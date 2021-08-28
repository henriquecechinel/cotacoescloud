package com.betha.cotacoescloud.cotacoescloud.model;

import javax.persistence.Entity;

@Entity
public class AgenteLicitacao extends AbstractPessoaJuridica {
    public AgenteLicitacao(Long id, String nome, String cpf, String endereco, String telefone, String cpnj) {
        super(id, nome, cpf, endereco, telefone, cpnj);
    }
}
