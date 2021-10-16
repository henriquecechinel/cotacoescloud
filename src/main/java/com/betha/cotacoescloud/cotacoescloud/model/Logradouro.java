package com.betha.cotacoescloud.cotacoescloud.model;

import com.betha.cotacoescloud.cotacoescloud.enterprise.AbstractRegiao;

import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.validation.constraints.NotNull;

@Entity
public class Logradouro extends AbstractRegiao {
    @ManyToOne
    @NotNull
    @JoinColumn(name = "I_BAIRRO", referencedColumnName = "ID")
    private Bairro i_bairro;

    public Logradouro(String nome, Long populacao, Bairro i_bairro) {
        super(nome, populacao);
        this.i_bairro = i_bairro;
    }

    public Logradouro(){}

    public Bairro getI_bairro() {
        return i_bairro;
    }

    public void setI_bairro(Bairro i_bairro) {
        this.i_bairro = i_bairro;
    }
}
