package com.betha.cotacoescloud.cotacoescloud.enterprise;

import com.betha.cotacoescloud.cotacoescloud.enterprise.AbstractEntidade;

public abstract class AbstractRegiao extends AbstractEntidade {
    private String nome;
    private Long populacao;

    public AbstractRegiao(String nome, Long populacao) {
        this.nome = nome;
        this.populacao = populacao;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Long getPopulacao() {
        return populacao;
    }

    public void setPopulacao(Long populacao) {
        this.populacao = populacao;
    }

    @Override
    public String toString() {
        return "AbstractRegiao{" +
                "nome='" + nome + '\'' +
                ", populacao='" + populacao + '\'' +
                '}';
    }
}
