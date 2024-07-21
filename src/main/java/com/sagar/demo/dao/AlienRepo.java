package com.sagar.demo.dao;


import com.sagar.demo.model.Alien;
import org.springframework.data.repository.CrudRepository;

import java.util.Optional;

public interface AlienRepo extends CrudRepository<Alien, Integer>
{

    Optional<Alien> findAllById(int id);
}
