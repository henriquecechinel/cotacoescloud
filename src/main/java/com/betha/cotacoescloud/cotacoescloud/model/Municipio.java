package com.betha.cotacoescloud.cotacoescloud.model;

import com.betha.cotacoescloud.cotacoescloud.enterprise.AbstractRegiao;

import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.validation.constraints.NotNull;

@Entity
public class Municipio extends AbstractRegiao {
    @NotNull(message = "O campo Estado é obrigatório!")
    @ManyToOne
    @JoinColumn(name = "I_ESTADO", referencedColumnName = "ID")
    private Estado estado;

    public Municipio(String nome, Long populacao, Estado estado) {
        super(nome, populacao);
        this.estado = estado;
    }

    public Municipio(){}

    public Estado getEstado() {
        return estado;
    }

    public void setEstado(Estado estado) {
        this.estado = estado;
    }
}
