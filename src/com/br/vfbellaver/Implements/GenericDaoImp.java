/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.br.vfbellaver.Implements;

import com.br.vfbellaver.interfaces.GenericDAO;
import com.br.vfbellaver.utils.FabricaDeGerenciadorDeEntidade;
import java.sql.SQLException;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;

/**
 *
 * @author vfbellaver
 */
public class GenericDaoImp<T> implements GenericDAO<T>{
    
    private FabricaDeGerenciadorDeEntidade fabGerEntidades = FabricaDeGerenciadorDeEntidade.getInstance();
    private EntityManager EntManager = fabGerEntidades.getEntityManager();
    
   @Override
    public T persistir(T t) throws SQLException {
        EntManager.getTransaction().begin();
        EntManager.persist(t);
        EntManager.getTransaction().commit();
        return t;
    }

    @Override
    public T remover(T t) throws SQLException {
        EntManager.getTransaction().begin();
        EntManager.remove(t);
        EntManager.getTransaction().commit();
        return t;
    }

    @Override
    public T alterar(T t) throws SQLException {
        EntManager.getTransaction().begin();
        EntManager.merge(t);
        EntManager.getTransaction().commit();
        return t;
    }


    @Override
    public T buscarPorId(Integer id) throws SQLException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<T> listarTodos(Class c) throws SQLException {
        CriteriaBuilder cb = EntManager.getCriteriaBuilder();
        CriteriaQuery<T> cq = cb.createQuery(c);
        Root r = cq.from(c);
        cq.select(r);
        return EntManager.createQuery(cq).getResultList();
    }
    
}
