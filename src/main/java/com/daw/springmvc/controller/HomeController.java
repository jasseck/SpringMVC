/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.daw.springmvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

/**
 *
 * @author Tichaona
 */
@Controller
public class HomeController {
    
    @GetMapping({"/home","/"})
    public ModelAndView home(ModelAndView model){
        model.setViewName("home_view");
        return model;
    }
    
    @GetMapping("/register")
    public ModelAndView register(ModelAndView model){
        model.addObject("usuario", "Abdul Sumail");
        model.setViewName("register_view");
        return model;
    }
    
    @PostMapping("/registerProcess")
    public ModelAndView regProcess(ModelAndView model, @RequestParam String usuario, @RequestParam String senha){
        model.setViewName("list_view");
        model.addObject("usuario", usuario);
        model.addObject("senha", senha);
        return model;
    }
}
