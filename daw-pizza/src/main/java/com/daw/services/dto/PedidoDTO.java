package com.daw.services.dto;

import java.time.LocalDate;
import java.util.List;

import com.daw.persistence.entities.Metodo;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@Getter
@Setter

public class PedidoDTO {
	
	private int id;
	private LocalDate fecha;
	private Double total;
	private Metodo metodo;
	private String cliente;
	private String telefono;
	private String direccion;
	private String notas;
	private int numeroPizzas;
	private List<PedidoPizzaOutPutDTO> pizzas;
	

}
