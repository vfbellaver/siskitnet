/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.br.vfbellaver.models;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 *
 * @author vfbellaver
 */
@Entity
@Table(name = "imovel")
public class Imovel implements Serializable{
    
    @Id
    @Column(name = "imovel_id")
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    
    @Column(name = "endereco",length = 500, nullable = false)
    private String endereco;
    
    @Column(name = "qnt_comodos", nullable = false)
    private int qntComodos;
    @Column(name = "descricao", length = 2000, nullable = false)
    private String descricao;
    

    public Imovel() {
    }
    

    public int getId() {
        return id;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public int getQntComodos() {
        return qntComodos;
    }

    public void setQntComodos(int qntComodos) {
        this.qntComodos = qntComodos;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    @Override
    public String toString() {
       return getEndereco();
    }
    
    
}
