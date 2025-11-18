package com.daw.web.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.daw.persistence.entities.Pedido;
import com.daw.services.PedidoService;
import com.daw.services.PizzaService;
import com.daw.services.exceptions.PedidoNotFoundExceptions;

@RestController
@RequestMapping("/pedidos")
public class PedidoControllers {

    private final PizzaService pizzaService;

	@Autowired
	private PedidoService pedidoService;

    PedidoControllers(PizzaService pizzaService) {
        this.pizzaService = pizzaService;
    }
	
	@GetMapping
	public ResponseEntity<List<Pedido>> list(){
		return ResponseEntity.ok(this.pedidoService.findAll());
		
	}
	
	@GetMapping("/{idPedido}")
	public ResponseEntity<?> findById(@PathVariable int idPedido){
		try {
			return ResponseEntity.ok(this.pedidoService.findById(idPedido));
		}
		catch(PedidoNotFoundExceptions ex) {
		return ResponseEntity.status(HttpStatus.NOT_FOUND).body(ex.getMessage());
	}
	}
	
	
}
