package com.betha.cotacoescloud.cotacoescloud.model;

import com.betha.cotacoescloud.cotacoescloud.enterprise.AbstractRegiao;

import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

public class Estado extends AbstractRegiao {
    @ManyToOne
    @JoinColumn(name = "I_PAIS", referencedColumnName = "ID")
    private Long i_pais;

    public Estado(String nome, Long populacao, Long i_pais) {
        super(nome, populacao);
        this.i_pais = i_pais;
    }

    public Long getI_pais() {
        return i_pais;
    }

    public void setI_pais(Long i_pais) {
        this.i_pais = i_pais;
    }
}
