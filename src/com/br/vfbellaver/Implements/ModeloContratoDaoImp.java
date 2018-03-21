/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.br.vfbellaver.Implements;

import com.br.vfbellaver.interfaces.ModeloContratoDAO;
import com.br.vfbellaver.models.ModeloContrato;
import com.br.vfbellaver.utils.FabricaDeGerenciadorDeEntidade;
import java.sql.SQLException;
import javax.persistence.EntityManager;
import javax.transaction.Transaction;

/**
 *
 * @author vfbellaver
 */
public class ModeloContratoDaoImp extends GenericDaoImp<ModeloContrato> implements ModeloContratoDAO{
    
    public ModeloContrato buscarPorId(Integer id){
        FabricaDeGerenciadorDeEntidade fabGerEntidades = FabricaDeGerenciadorDeEntidade.getInstance();
        EntityManager EntManager = fabGerEntidades.getEntityManager();
        ModeloContrato modelo = EntManager.find(ModeloContrato.class, id);
        System.out.println(EntManager.isOpen());
        return modelo;
    }
}
