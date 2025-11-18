package com.daw.services;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.daw.persistence.entities.Cliente;
import com.daw.persistence.entities.Pedido;
import com.daw.persistence.repositories.PedidoRepository;
import com.daw.services.exceptions.ClienteNotFoundException;

@Service
public class PedidoService {

	@Autowired
	private PedidoRepository pedidoRepository;
	
	
	  public List<Pedido> findAll(){
		  return this.pedidoRepository.findAll();
	  
	  }
	  public Pedido findById(int idPedido) {
			if(!this.pedidoRepository.existsById(idPedido)) {
				throw new ClienteNotFoundException("El ID indicado no existe. ");
			}
			
			return this.pedidoRepository.findById(idPedido).get();
		}
	 
}
	
	

