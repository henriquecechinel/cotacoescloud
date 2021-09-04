package com.betha.cotacoescloud.cotacoescloud.model;

import com.betha.cotacoescloud.cotacoescloud.enterprise.AbstractRegiao;

import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

public class Bairro extends AbstractRegiao {
    @ManyToOne
    @JoinColumn(name = "I_MUNICIPIO", referencedColumnName = "ID")
    private Long i_municipio;

    public Bairro(String nome, Long populacao, Long i_municipio) {
        super(nome, populacao);
        this.i_municipio = i_municipio;
    }

    public Long getI_municipio() {
        return i_municipio;
    }

    public void setI_municipio(Long i_municipio) {
        this.i_municipio = i_municipio;
    }
}
