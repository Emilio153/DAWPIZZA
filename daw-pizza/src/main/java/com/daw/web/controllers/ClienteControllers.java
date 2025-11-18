package com.daw.web.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.daw.persistence.entities.Cliente;
import com.daw.services.ClienteService;
import com.daw.services.exceptions.ClienteNotFoundException;

@RestController
@RequestMapping("/clientes")

public class ClienteControllers {

	@Autowired
	private ClienteService clienteService;
	
	@GetMapping
	public ResponseEntity<List<Cliente>>list(){
		return ResponseEntity.ok(this.clienteService.findAll());
	}
	
	@GetMapping("/{idCliente}")
	public ResponseEntity<?> findById(@PathVariable int idCliente){
		try {
			return ResponseEntity.ok(this.clienteService.findById(idCliente));
		}
		catch(ClienteNotFoundException ex) {
			return ResponseEntity.status(HttpStatus.NOT_FOUND).body(ex.getMessage());
		}
	}
}
