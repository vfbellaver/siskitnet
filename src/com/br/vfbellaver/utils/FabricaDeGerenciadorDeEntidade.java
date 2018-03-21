/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.br.vfbellaver.utils;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

/**
 *
 * @author vfbellaver
 */
public class FabricaDeGerenciadorDeEntidade {
    private static FabricaDeGerenciadorDeEntidade fgEntidade;
    private static EntityManagerFactory emFactory;
    private EntityManager entityManager;

    private FabricaDeGerenciadorDeEntidade(){
        emFactory = Persistence.createEntityManagerFactory("ControleKitnetsPU");
    }
    
    public static FabricaDeGerenciadorDeEntidade getInstance(){
        if(fgEntidade == null){
            fgEntidade = new FabricaDeGerenciadorDeEntidade();
        }
        return fgEntidade;
    }
   public EntityManager getEntityManager(){
        if (entityManager == null ) {
            entityManager = emFactory.createEntityManager();
        }
        return entityManager;
    } 
}
