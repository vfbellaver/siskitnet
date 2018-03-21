/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.br.vfbellaver.views;

import java.util.List;
import javax.swing.AbstractListModel;
import javax.swing.ComboBoxModel;

/**
 *
 * @author vfbellaver
 */
public class GenericComboModel<T> extends AbstractListModel<T> implements ComboBoxModel<T>{
    
    private List<T> listaItens;
    private T selection;
    
    public GenericComboModel(List list){
        this.listaItens = list;
    }
    
    @Override
    public int getSize() {
        return this.listaItens.size();
    }

    @Override
    public T getElementAt(int index) {
        return this.listaItens.get(index);
    }

    @Override
    public void setSelectedItem(Object anItem) {
         this.selection = (T) anItem;
    }

    @Override
    public Object getSelectedItem() {
        return this.selection;
    }
    
}
