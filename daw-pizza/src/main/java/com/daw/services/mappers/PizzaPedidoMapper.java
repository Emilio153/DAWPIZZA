package com.daw.services.mappers;

import java.util.List;

import com.daw.persistence.entities.PizzaPedido;
import com.daw.services.dto.PedidoPizzaOutPutDTO;
import com.daw.services.dto.PizzaPedidoInputDTO;

public class PizzaPedidoMapper {
	
	public static PedidoPizzaOutPutDTO toDTO(PizzaPedido pizzaPedido) {
		PedidoPizzaOutPutDTO dto = new PedidoPizzaOutPutDTO();
		
		dto.setId(pizzaPedido.getId());
		dto.setCantidad(pizzaPedido.getCantidad());
		dto.setPrecio(pizzaPedido.getPrecio());
		dto.setIdPizza(pizzaPedido.getIdPizza());
		dto.setPizza(pizzaPedido.getPizza().getNombre());
		
		return dto;
	}
	
	public static List<PedidoPizzaOutPutDTO> toDtos(List<PizzaPedido> pizzaPedidos){
		return pizzaPedidos.stream().map(pp -> toDTO(pp)).toList();
	}
	
	public static PizzaPedido toEntity(PizzaPedidoInputDTO dto) {
		PizzaPedido entity = new PizzaPedido();
		
		entity.setId(dto.getId());
		entity.setIdPizza(dto.getIdPizza());
		entity.setIdPedido(dto.getIdPedido());
		entity.setCantidad(dto.getCantidad());
		
		return entity;
	}

}
