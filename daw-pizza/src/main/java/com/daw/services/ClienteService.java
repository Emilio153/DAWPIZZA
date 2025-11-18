package com.daw.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.daw.persistence.entities.Cliente;
import com.daw.persistence.repositories.ClienteRepository;
import com.daw.services.exceptions.ClienteNotFoundException;
@Service
public class ClienteService {
	@Autowired
	private ClienteRepository clienteRepository;
	
	public List<Cliente> findAll(){
		return this.clienteRepository.findAll();
	}
	
	public Cliente findById(int idCliente) {
		if(!this.clienteRepository.existsById(idCliente)) {
			throw new ClienteNotFoundException("El ID indicado no existe. ");
		}
		
		return this.clienteRepository.findById(idCliente).get();
	}

}
