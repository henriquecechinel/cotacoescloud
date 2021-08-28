package com.betha.cotacoescloud.cotacoescloud.model;

public abstract class AbstractPessoaJuridica extends AbstractPessoa {
    private String cpnj;

    public AbstractPessoaJuridica(Long id, String nome, String cpf, String endereco, String telefone, String cpnj) {
        super(id, nome, cpf, endereco, telefone);
        this.cpnj = cpnj;
    }

    public String getCpnj() {
        return cpnj;
    }

    public void setCpnj(String cpnj) {
        this.cpnj = cpnj;
    }
}
