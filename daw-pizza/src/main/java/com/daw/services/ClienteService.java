package com.daw.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.daw.persistence.entities.Cliente;
import com.daw.persistence.repositories.ClienteRepository;

public class ClienteService {
	@Autowired
	private ClienteRepository clienteRepository;
	
	public List<Cliente> findAll(){
		return this.clienteRepository.findAll();
	}
	
	// public Cliente findById(int id) {
		
	// }

}
