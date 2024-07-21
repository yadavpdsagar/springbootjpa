package com.sagar.demo.dao;


import com.sagar.demo.model.Alien;
import org.springframework.data.repository.CrudRepository;

public interface AlienRepo extends CrudRepository<Alien, Integer>
{

}
