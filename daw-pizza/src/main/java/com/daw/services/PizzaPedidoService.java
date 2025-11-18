package com.daw.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.daw.persistence.entities.PizzaPedido;
import com.daw.persistence.repositories.PizzaPedidoRepository;
import com.daw.services.exceptions.PedidoPizzaNotFoundExceptions;

@Service
public class PizzaPedidoService {
	 @Autowired
	    private PizzaPedidoRepository pizzaPedidoRepository;

	    public List<PizzaPedido> findAll() {
	        return pizzaPedidoRepository.findAll();
	    }
	    public PizzaPedido findById(int idPizzaPedido) {
			if(!this.pizzaPedidoRepository.existsById(idPizzaPedido)) {
				throw new PedidoPizzaNotFoundExceptions("El ID indicado no existe. ");
			}
			
			return this.pizzaPedidoRepository.findById(idPizzaPedido).get();
		}
	    
}
