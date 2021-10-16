package com.betha.cotacoescloud.cotacoescloud.model;

import com.betha.cotacoescloud.cotacoescloud.enterprise.AbstractRegiao;

import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.validation.constraints.NotNull;

@Entity
public class Estado extends AbstractRegiao {
    @NotNull
    @ManyToOne
    @JoinColumn(name = "I_PAIS", referencedColumnName = "ID")
    private Pais i_pais;

    public Estado(String nome, Long populacao, Pais i_pais) {
        super(nome, populacao);
        this.i_pais = i_pais;
    }

    public Estado(){}

    public Pais getI_pais() {
        return i_pais;
    }

    public void setI_pais(Pais i_pais) {
        this.i_pais = i_pais;
    }
}
