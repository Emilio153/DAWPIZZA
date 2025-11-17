package com.daw.percistence.repositories;

import org.springframework.data.repository.ListCrudRepository;

import com.daw.percistence.entities.Pizza;

public interface PizzaRepository extends ListCrudRepository<Pizza, Integer> {
   
}