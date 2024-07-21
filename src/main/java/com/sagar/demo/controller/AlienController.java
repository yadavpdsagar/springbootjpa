package com.sagar.demo.controller;

import com.sagar.demo.dao.AlienRepo;
import com.sagar.demo.model.Alien;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

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
        //System.out.println("this is data "+alien);
        return "home";
    }
@RequestMapping("/getAlien")
    public ModelAndView getAlien(@RequestParam int id)
    {
        ModelAndView view = new ModelAndView("showAliens");

        //System.out.println("this is data ");
        Alien alien=repo.findAllById(id).orElse(new Alien());
        view.addObject(alien);


        return view;
    }
    @RequestMapping("/updateAlien")
    public ModelAndView updateAlien(@RequestParam int id)
    {
        ModelAndView view = new ModelAndView("home");
        Alien alien=repo.findAllById(id).orElse(new Alien());
        repo.save(alien);

        return view;
    }
    @RequestMapping("/deleteAlien")
    public ModelAndView deleteAlien(@RequestParam int id)
    {
        ModelAndView view = new ModelAndView("showAliens");
        Alien alien=repo.findAllById(id).orElse(new Alien());
        repo.delete(alien);

        return view;
    }


}

