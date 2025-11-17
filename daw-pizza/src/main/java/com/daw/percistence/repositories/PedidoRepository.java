package com.daw.percistence.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.daw.percistence.entities.Pedido;

public interface PedidoRepository extends JpaRepository<Pedido, Integer>{

}
