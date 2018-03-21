/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.br.vfbellaver.Implements;

import com.br.vfbellaver.interfaces.ContratoDAO;
import com.br.vfbellaver.models.Contrato;
import java.sql.SQLException;
import java.util.List;

/**
 *
 * @author vfbellaver
 */
public class ContratoDaoImp extends GenericDaoImp<Contrato> implements ContratoDAO{
    public List<Contrato> listarTodos(Contrato c) throws SQLException {
        return listarTodos(Contrato.class);
    }
}
