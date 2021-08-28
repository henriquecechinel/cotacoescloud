package com.betha.cotacoescloud.cotacoescloud.model;

public abstract class AbstractPessoaFisica extends AbstractPessoa {
    private String cpf;

    public AbstractPessoaFisica(Long id, String nome, String cpf, String endereco, String telefone, String cpf1) {
        super(id, nome, cpf, endereco, telefone);
        this.cpf = cpf1;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }
}
