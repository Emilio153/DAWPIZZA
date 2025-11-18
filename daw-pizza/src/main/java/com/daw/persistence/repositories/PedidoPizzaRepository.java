package com.daw.persistence.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.daw.persistence.entities.PizzaPedido;

public interface PedidoPizzaRepository extends JpaRepository<PizzaPedido, Integer>{

}
