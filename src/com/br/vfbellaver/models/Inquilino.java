/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.br.vfbellaver.models;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 *
 * @author vfbellaver
 */

@Entity
@Table(name = "inquilino")
public class Inquilino implements Serializable{
   
    @Id
    @Column(name = "cpf", nullable = false)
    private Long cpf;
    @Column(name = "nome", length = 400, nullable = false)
    private String nome;
    @Column(name = "nacionalidade", length = 100, nullable = false)
    private String nacionalidade;
    @Column(name = "profissao", length = 150, nullable = false)
    private String profissao;
    @Column(name = "registro_geral", nullable = false)
    private Long registroGeral;
    @Column(name = "orgao_emissor", length = 50, nullable = false)
    private String orgaoEmissor;
    @Column(name = "telefone", length = 15, nullable = false)
    private String telefone;
    @Column(name = "endereco", length = 400, nullable = false)
    private String endereco;

    public Inquilino() {
    }

    public Long getCpf() {
        return cpf;
    }

    public void setCpf(Long cpf) {
        this.cpf = cpf;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNacionalidade() {
        return nacionalidade;
    }

    public void setNacionalidade(String nacionalidade) {
        this.nacionalidade = nacionalidade;
    }

    public String getProfissao() {
        return profissao;
    }

    public void setProfissao(String profissao) {
        this.profissao = profissao;
    }

    public Long getRegistroGeral() {
        return registroGeral;
    }

    public void setRegistroGeral(Long registroGeral) {
        this.registroGeral = registroGeral;
    }

    public String getOrgaoEmissor() {
        return orgaoEmissor;
    }

    public void setOrgaoEmissor(String orgaoEmissor) {
        this.orgaoEmissor = orgaoEmissor;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    @Override
    public String toString() {
        return getNome();
    }

  
    
    
}
