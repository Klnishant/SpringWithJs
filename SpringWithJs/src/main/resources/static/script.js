const submit = document.getElementById("button");

console.log(submit)

const callBackendApi = async() => {
	
	let clientName = document.getElementById("name").value;
	let response2 = await fetch("http://localhost:8000/save",{
		method:'POST',
		headers:{
			'Accept':'application/json',
			'Content-Type':'application/json'
		},
		body:JSON.stringify({
			name: clientName
		})
	})
	let response = await fetch("http://localhost:8000/getClient");
	console.log(response2);
	console.log(response);
}
submit.addEventListener("click",callBackendApi);