package com.betha.cotacoescloud.cotacoescloud.model;

import com.betha.cotacoescloud.cotacoescloud.enterprise.AbstractRegiao;

import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

public class Municipio extends AbstractRegiao {
    @ManyToOne
    @JoinColumn(name = "I_ESTADO", referencedColumnName = "ID")
    private Long i_estado;

    public Municipio(String nome, Long populacao, Long i_estado) {
        super(nome, populacao);
        this.i_estado = i_estado;
    }

    public Long getI_estado() {
        return i_estado;
    }

    public void setI_estado(Long i_estado) {
        this.i_estado = i_estado;
    }
}
