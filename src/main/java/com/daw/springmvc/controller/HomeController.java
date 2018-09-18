/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.daw.springmvc.controller;

import com.daw.springmvc.dao.UsuarioDAO;
import com.daw.springmvc.model.Usuario;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

/**
 *
 * @author Tichaona
 */
@Controller
public class HomeController {
    
    UsuarioDAO dao =new UsuarioDAO();
    @GetMapping({"/home","/"})
    public ModelAndView home(ModelAndView model){
        model.setViewName("home_view");
        return model;
    }
    
    @GetMapping("/register")
    public ModelAndView register(ModelAndView model){
        model.addObject("user", "Abdul Sumail");
        model.setViewName("register_view");
        return model;
    }
    
    @PostMapping("/registerProcess")
    public ModelAndView regProcess(ModelAndView model, @ModelAttribute Usuario user){
        
        model.setViewName("list_view");
        dao.save(user);
        //model.addObject("resultado", usuario)
        return model;
    }
    
    @GetMapping("/list")
    public ModelAndView list(ModelAndView model){
        model.addObject("user", dao.find(12L));
        model.setViewName("list_view");
        return model;
    }
}
