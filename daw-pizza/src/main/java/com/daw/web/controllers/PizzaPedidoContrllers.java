package com.daw.web.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.daw.persistence.entities.PizzaPedido;
import com.daw.services.PizzaPedidoService;
import com.daw.services.exceptions.PizzaNotFoundException;

@RestController
@RequestMapping("/pizzaPedidos")
public class PizzaPedidoContrllers {
	
	@Autowired
	private PizzaPedidoService pizzaPedidoService;
	
	
	@GetMapping
	public ResponseEntity<List<PizzaPedido>> list(){
		return ResponseEntity.ok(this.pizzaPedidoService.findAll());
	}
	@GetMapping("/{idPizza}")
	public ResponseEntity<?> findById(@PathVariable int idPizza){
		try {
			return ResponseEntity.ok(this.pizzaPedidoService.findById(idPizza));
		}
		catch(PizzaNotFoundException ex) {
			return ResponseEntity.status(HttpStatus.NOT_FOUND).body(ex.getMessage());
		}
	}

}
