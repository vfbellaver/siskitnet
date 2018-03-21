/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.br.vfbellaver.Implements;

import com.br.vfbellaver.interfaces.InquilinoDAO;
import com.br.vfbellaver.models.Inquilino;
import java.sql.SQLException;
import java.util.List;

/**
 *
 * @author vfbellaver
 */
public class InquilinoDaoImp  extends GenericDaoImp<Inquilino> implements InquilinoDAO{
    
    public List<Inquilino> listarInquilinos(Inquilino inq) throws SQLException{
            return listarTodos(Inquilino.class);
    }
}
