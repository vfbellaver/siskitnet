/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.br.vfbellaver.models;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 *
 * @author vfbellaver
 */

@Entity
@Table(name="contrato")
public class Contrato implements Serializable{
    
    @Id
    @Column(name = "contrato_id")
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    @Column(name = "data_contrato", nullable = false)
    @Temporal(TemporalType.DATE)
    private Date dataContrato;
    @Column(name = "data_entrada", nullable = false)
    @Temporal(TemporalType.DATE)
    private Date dataEntrada;
    
    @OneToOne
    @JoinColumn(name = "imovel_id")
    private Imovel imovel;
    
    @OneToOne
    @JoinColumn(name = "inquilino_id")
    private Inquilino inquilino;
    
    @OneToOne
    @JoinColumn(name = "modelo_contrato_id")
    private ModeloContrato contrato;
    
    public Contrato() {
    }

    public int getId() {
        return id;
    }

    public Date getDataContrato() {
        return dataContrato;
    }

    public void setDataContrato(Date dataContrato) {
        this.dataContrato = dataContrato;
    }

    public Date getDataEntrada() {
        return dataEntrada;
    }

    public void setDataEntrada(Date dataEntrada) {
        this.dataEntrada = dataEntrada;
    }

    public Imovel getImovel() {
        return imovel;
    }

    public void setImovel(Imovel imovel) {
        this.imovel = imovel;
    }

    public Inquilino getInquilino() {
        return inquilino;
    }

    public void setInquilino(Inquilino inquilino) {
        this.inquilino = inquilino;
    }

    public ModeloContrato getContrato() {
        return contrato;
    }

    public void setContrato(ModeloContrato contrato) {
        this.contrato = contrato;
    }
    
    
    
}
