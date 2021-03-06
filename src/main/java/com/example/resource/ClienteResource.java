package com.example.resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.example.domain.Cliente;
import com.example.services.ClienteService;

@RestController
@RequestMapping(value = "/clientes")

public class ClienteResource {
	
	@Autowired
	private ClienteService clienteService;
	
	
	@RequestMapping(value = "/{id}", method = RequestMethod.GET)
	public ResponseEntity<Cliente> findId(@PathVariable Integer id) {	
		
		Cliente objeto = clienteService.find(id);
		
		return ResponseEntity.ok().body(objeto);

	}
}