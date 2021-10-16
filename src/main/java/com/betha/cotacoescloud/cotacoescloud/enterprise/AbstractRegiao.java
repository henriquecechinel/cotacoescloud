package com.betha.cotacoescloud.cotacoescloud.enterprise;

import javax.persistence.Column;
import javax.persistence.MappedSuperclass;
import javax.validation.constraints.NotNull;

@MappedSuperclass
public abstract class AbstractRegiao extends AbstractEntity {
    @NotNull(message = "O nome não pode ser nulo!")
    @Column(name = "NOME")
    private String nome;
    @Column(name = "POPULACAO")
    private Long populacao;

    public AbstractRegiao(String nome, Long populacao) {
        this.nome = nome;
        this.populacao = populacao;
    }


    public AbstractRegiao() {}

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
