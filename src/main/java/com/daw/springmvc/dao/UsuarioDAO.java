/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.daw.springmvc.dao;

import com.daw.springmvc.model.Usuario;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

/**
 *
 * @author Tichaona
 */
public class UsuarioDAO {

    EntityManagerFactory emf = Persistence.createEntityManagerFactory("SpringMVCPU");

    public void save(Usuario entity) {
        EntityManager manager = emf.createEntityManager();
        try {
            manager.getTransaction().begin();
            manager.persist(entity);
            manager.getTransaction().commit();
        } catch (Exception e) {
            Logger.getLogger(getClass().getName()).log(Level.SEVERE, "exception caught", e);
            manager.getTransaction().rollback();
        } finally {
            manager.close();
        }
    }
    
    public Usuario find(Long codigo) {
        EntityManager manager = emf.createEntityManager();
        Usuario entity= new Usuario();
        try {
            manager.getTransaction().begin();
            entity = manager.find(Usuario.class, codigo);
            manager.getTransaction().commit();
        } catch (Exception e) {
            Logger.getLogger(getClass().getName()).log(Level.SEVERE, "exception caught", e);
            manager.getTransaction().rollback();
        } finally {
            manager.close();
            return entity;
        }
        
    }
}
