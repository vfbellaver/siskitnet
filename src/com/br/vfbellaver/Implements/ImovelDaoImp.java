/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.br.vfbellaver.Implements;

import com.br.vfbellaver.interfaces.ImovelDAO;
import com.br.vfbellaver.models.Imovel;
import java.sql.SQLException;
import java.util.List;

/**
 *
 * @author vfbellaver
 */
public class ImovelDaoImp extends GenericDaoImp<Imovel> implements ImovelDAO{
    public List<Imovel> listarTodos(Imovel i) throws SQLException {
        return listarTodos(Imovel.class);
    }
}
