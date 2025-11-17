package com.daw.percistence.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.daw.percistence.entities.Cliente;

public interface ClienteRepository extends JpaRepository<Cliente, Integer> {

}
