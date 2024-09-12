package com.example.SpringWithJs;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ClientService {
	
	@Autowired
	ClientRepository clientRepo;
	
	public boolean saveName(Client client) {
		try {
			Client response = clientRepo.save(client);
			if(response !=null) {
				return true;
			} else {
				return false;
			}
			
		} catch(Exception e){
			
		}
		return false;
	}
	
	public List<Client> getClient() {
		return clientRepo.findAll();
	}

}
