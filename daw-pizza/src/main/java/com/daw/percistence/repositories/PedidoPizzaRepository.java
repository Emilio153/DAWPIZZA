package com.daw.percistence.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.daw.percistence.entities.PizzaPedido;

public interface PedidoPizzaRepository extends JpaRepository<PizzaPedido, Integer>{

}
