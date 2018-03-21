package com.br.vfbellaver.interfaces;


import java.sql.SQLException;
import java.util.List;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author vfbellaver
 */
public interface GenericDAO<T> {
    
     public T persistir(T t) throws SQLException;

    public T remover(T t) throws SQLException;

    public T alterar(T t) throws SQLException;
    
    public List<T> listarTodos(Class c) throws SQLException;
    
    public T buscarPorId(Integer id) throws SQLException;   
}
