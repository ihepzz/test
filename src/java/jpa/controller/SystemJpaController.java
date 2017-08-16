/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jpa.controller;

import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import jpa.entities.System;

/**
 *
 * @author Administrator
 */
public class SystemJpaController {
    EntityManagerFactory emf = Persistence.createEntityManagerFactory("WebApplication2PU");
    EntityManager em =emf.createEntityManager();
    public List<System> findSystemEntities(){
        try {
            return em.createQuery("select s from System s").getResultList();
        } finally {
            em.close();
            
        }
        
    } 
}
