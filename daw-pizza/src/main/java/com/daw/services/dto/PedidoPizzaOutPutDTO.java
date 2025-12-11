package com.daw.services.dto;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@Getter
@Setter
public class PedidoPizzaOutPutDTO {
	private int id;
	private Double cantidad;
	private Double precio;
	private Integer idPizza;
	private String pizza;

}
