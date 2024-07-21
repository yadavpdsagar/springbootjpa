package com.sagar.demo.controller;

import com.sagar.demo.dao.AlienRepo;
import com.sagar.demo.model.Alien;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class AlienController {
    @Autowired
    AlienRepo repo;
    @RequestMapping("/home")
    public String home()
    {
        System.out.println("Home Page");
        return "home";
    }
    @RequestMapping("/addAlien")
    public String addAlien(Alien alien)
    {
        repo.save(alien);
        System.out.println("this is data "+alien);
        return "home";
    }
}

