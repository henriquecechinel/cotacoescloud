package com.betha.cotacoescloud.cotacoescloud.model;

import com.betha.cotacoescloud.cotacoescloud.enterprise.AbstractRegiao;

import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.validation.constraints.NotNull;

@Entity
public class Bairro extends AbstractRegiao {
    @NotNull(message = "O campo Município é obrigatório!")
    @ManyToOne
    @JoinColumn(name = "I_MUNICIPIO", referencedColumnName = "ID")
    private Municipio municipio;

    public Bairro(String nome, Long populacao, Municipio municipio) {
        super(nome, populacao);
        this.municipio = municipio;
    }

    public Bairro(){}

    public Municipio getMunicipio() {
        return municipio;
    }

    public void setMunicipio(Municipio municipio) {
        this.municipio = municipio;
    }
}
