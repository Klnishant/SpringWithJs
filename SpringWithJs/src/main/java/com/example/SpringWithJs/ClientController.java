package com.example.SpringWithJs;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ClientController {
	
	@Autowired
	ClientService service;
	
	@PostMapping(path="/save")
	public ResponseEntity<String> saveClient(@RequestBody Client client){
		if(service.saveName(client)) {
			return new ResponseEntity<>("Client Saved Successfully",HttpStatus.OK);
		} else {
			return new ResponseEntity<>("Client not Saved",HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}
	
	@GetMapping(path="/getClient")
	public ResponseEntity<List<Client>> getClient(){
		return new ResponseEntity<>(service.getClient(),HttpStatus.OK);
	}
}
