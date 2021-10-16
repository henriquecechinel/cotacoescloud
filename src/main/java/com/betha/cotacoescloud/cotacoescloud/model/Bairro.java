package com.betha.cotacoescloud.cotacoescloud.model;

import com.betha.cotacoescloud.cotacoescloud.enterprise.AbstractRegiao;

import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.validation.constraints.NotNull;

@Entity
public class Bairro extends AbstractRegiao {
    @ManyToOne
    @NotNull
    @JoinColumn(name = "I_MUNICIPIO", referencedColumnName = "ID")
    private Municipio i_municipio;

    public Bairro(String nome, Long populacao, Municipio i_municipio) {
        super(nome, populacao);
        this.i_municipio = i_municipio;
    }

    public Bairro(){}

    public Municipio getI_municipio() {
        return i_municipio;
    }

    public void setI_municipio(Municipio i_municipio) {
        this.i_municipio = i_municipio;
    }
}
