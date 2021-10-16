package com.betha.cotacoescloud.cotacoescloud.model;

import com.betha.cotacoescloud.cotacoescloud.enterprise.AbstractRegiao;

import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.validation.constraints.NotNull;

@Entity
public class Municipio extends AbstractRegiao {
    @ManyToOne
    @NotNull
    @JoinColumn(name = "I_ESTADO", referencedColumnName = "ID")
    private Estado i_estado;

    public Municipio(String nome, Long populacao, Estado i_estado) {
        super(nome, populacao);
        this.i_estado = i_estado;
    }

    public Municipio(){}

    public Estado getI_estado() {
        return i_estado;
    }

    public void setI_estado(Estado i_estado) {
        this.i_estado = i_estado;
    }
}
