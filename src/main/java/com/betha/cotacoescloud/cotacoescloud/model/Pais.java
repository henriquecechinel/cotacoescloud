package com.betha.cotacoescloud.cotacoescloud.model;

import com.betha.cotacoescloud.cotacoescloud.enterprise.AbstractRegiao;

import javax.persistence.Entity;

@Entity
public class Pais extends AbstractRegiao {
    public Pais(String nome, Long populacao) {
        super(nome, populacao);
    }

    public Pais() {}
}
