package com.betha.cotacoescloud.cotacoescloud.model;

import com.betha.cotacoescloud.cotacoescloud.enterprise.AbstractRegiao;

import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.validation.constraints.NotNull;

@Entity
public class Estado extends AbstractRegiao {
    @NotNull(message = "O campo Pais é obrigatório!")
    @ManyToOne
    @JoinColumn(name = "I_PAIS", referencedColumnName = "ID")
    private Pais pais;

    public Estado(String nome, Long populacao, Pais pais) {
        super(nome, populacao);
        this.pais = pais;
    }

    public Estado(){}

    public Pais getPais() {
        return pais;
    }

    public void setPais(Pais pais) {
        this.pais = pais;
    }
}
