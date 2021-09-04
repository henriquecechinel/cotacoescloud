package com.betha.cotacoescloud.cotacoescloud.model;

import com.betha.cotacoescloud.cotacoescloud.enterprise.AbstractRegiao;

import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

public class Logradouro extends AbstractRegiao {
    @ManyToOne
    @JoinColumn(name = "I_BAIRRO", referencedColumnName = "ID")
    private Long i_bairro;

    public Logradouro(String nome, Long populacao, Long i_bairro) {
        super(nome, populacao);
        this.i_bairro = i_bairro;
    }

    public Long getI_bairro() {
        return i_bairro;
    }

    public void setI_bairro(Long i_bairro) {
        this.i_bairro = i_bairro;
    }
}
