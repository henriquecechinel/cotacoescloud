package com.betha.cotacoescloud.cotacoescloud.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class Endereco {
    @ManyToOne
    @JoinColumn(name = "I_LOGRADOURO", referencedColumnName = "ID")
    private Long i_logradouro;
    @Column(name = "CEP")
    private String cep;
    @Column(name = "NUMERO")
    private Long numero;
    @Column(name = "COMPLEMENTO")
    private String complemento;

    public Endereco(Long i_logradouro, String cep, Long numero, String complemento) {
        this.i_logradouro = i_logradouro;
        this.cep = cep;
        this.numero = numero;
        this.complemento = complemento;
    }

    public Long getI_logradouro() {
        return i_logradouro;
    }

    public void setI_logradouro(Long i_logradouro) {
        this.i_logradouro = i_logradouro;
    }

    public String getCep() {
        return cep;
    }

    public void setCep(String cep) {
        this.cep = cep;
    }

    public Long getNumero() {
        return numero;
    }

    public void setNumero(Long numero) {
        this.numero = numero;
    }

    public String getComplemento() {
        return complemento;
    }

    public void setComplemento(String complemento) {
        this.complemento = complemento;
    }
}
