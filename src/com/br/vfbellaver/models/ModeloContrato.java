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
@Table(name = "modelo_contrato")
public class ModeloContrato implements Serializable{
    
    @Id
    @Column(name = "modelo_id")
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    @Column(name = "nome_modelo",length = 150,nullable = false)
    private String nomeModeloContrato;
    @Column(name = "nome_locatario",length = 300,nullable = false)
    private String nomeLocatario;
    @Column(name = "nacionalidade_locatario",length = 250,nullable = false)
    private String nacionalidadeLocatario;
    @Column(name = "estado_civil",length = 50,nullable = false)
    private String estadoCivilLocatario;
    @Column(name = "cpf_locatario",nullable = false)
    private Long cpfLocatario;
    @Column(name = "rg_locatario",nullable = false)
    private Long rgLocatario;
    @Column(name = "org_emissor",length = 20,nullable = false)
    private String orgaoEmissorLocatario;
    @Column(name = "endereco_locatario",length = 500,nullable = false)
    private String enderecoLocatario;
    @Column(name = "clausulas_contrato",length = 20000,nullable = false)
    private String clausulasContrato;

    public ModeloContrato() {
    }

    public int getId() {
        return id;
    }

    public String getNomeModeloContrato() {
        return nomeModeloContrato;
    }

    public void setNomeModeloContrato(String nomeModeloContrato) {
        this.nomeModeloContrato = nomeModeloContrato;
    }
    
    public String getNomeLocatario() {
        return nomeLocatario;
    }

    public void setNomeLocatario(String nomeLocatario) {
        this.nomeLocatario = nomeLocatario;
    }

    public String getNacionalidadeLocatario() {
        return nacionalidadeLocatario;
    }

    public void setNacionalidadeLocatario(String nacionalidadeLocatario) {
        this.nacionalidadeLocatario = nacionalidadeLocatario;
    }

    public String getEstadoCivilLocatario() {
        return estadoCivilLocatario;
    }

    public void setEstadoCivilLocatario(String estadoCivilLocatario) {
        this.estadoCivilLocatario = estadoCivilLocatario;
    }

    public Long getCpfLocatario() {
        return cpfLocatario;
    }

    public void setCpfLocatario(Long cpfLocatario) {
        this.cpfLocatario = cpfLocatario;
    }

    public Long getRgLocatario() {
        return rgLocatario;
    }

    public void setRgLocatario(Long rgLocatario) {
        this.rgLocatario = rgLocatario;
    }

    public String getOrgaoEmissorLocatario() {
        return orgaoEmissorLocatario;
    }

    public void setOrgaoEmissorLocatario(String orgaoEmissorLocatario) {
        this.orgaoEmissorLocatario = orgaoEmissorLocatario;
    }

    public String getEnderecoLocatario() {
        return enderecoLocatario;
    }

    public void setEnderecoLocatario(String enderecoLocatario) {
        this.enderecoLocatario = enderecoLocatario;
    }

    public String getClausulasContrato() {
        return clausulasContrato;
    }

    public void setClausulasContrato(String clausulasContrato) {
        this.clausulasContrato = clausulasContrato;
    }

    @Override
    public String toString() {
        return getNomeModeloContrato();
    
    }
}
