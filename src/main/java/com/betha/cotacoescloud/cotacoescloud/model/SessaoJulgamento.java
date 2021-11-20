package com.betha.cotacoescloud.cotacoescloud.model;

import com.betha.cotacoescloud.cotacoescloud.enterprise.AbstractEntity;

import javax.persistence.*;
import java.time.LocalDate;
import java.util.List;

@Entity
public class SessaoJulgamento extends AbstractEntity {
    @Column(name = "TIPO_SESSAO")
    private String tipoSessao;

    @Column(name = "DATA_INICIO_CREDENCIAMENTO")
    private LocalDate dataInicioCredenciamento;

    @Column(name = "DATA_FIM_CREDENCIAMENTO")
    private LocalDate dataFimCredenciamento;

    @Column(name = "DATA_INICIO_ABERTURA")
    private LocalDate dataInicioAbertura;

    @Column(name = "DATA_FIM_ABERTURA")
    private LocalDate dataFimAbertura;

    @ManyToMany(cascade = {CascadeType.REFRESH})
    @JoinTable(
            name = "SESSAO_JULGAMENTO_PROPOSTAS",
            joinColumns = {@JoinColumn(name = "SESSAO_JULGAMENTO_ID")},
            inverseJoinColumns = {@JoinColumn(name = "PROPOSTA_ID")}
    )
    @Column(name = "LISTA_I_PROPOSTA")
    private List<Proposta> propostas;

    public SessaoJulgamento(String tipoSessao, LocalDate dataInicioCredenciamento, LocalDate dataFimCredenciamento, LocalDate dataInicioAbertura, LocalDate dataFimAbertura, List<Proposta> propostas) {
        this.tipoSessao = tipoSessao;
        this.dataInicioCredenciamento = dataInicioCredenciamento;
        this.dataFimCredenciamento = dataFimCredenciamento;
        this.dataInicioAbertura = dataInicioAbertura;
        this.dataFimAbertura = dataFimAbertura;
        this.propostas = propostas;
    }

    public SessaoJulgamento() {};

    public String getTipoSessao() {
        return tipoSessao;
    }

    public void setTipoSessao(String tipoSessao) {
        this.tipoSessao = tipoSessao;
    }

    public LocalDate getDataInicioCredenciamento() {
        return dataInicioCredenciamento;
    }

    public void setDataInicioCredenciamento(LocalDate dataInicioCredenciamento) {
        this.dataInicioCredenciamento = dataInicioCredenciamento;
    }

    public LocalDate getDataFimCredenciamento() {
        return dataFimCredenciamento;
    }

    public void setDataFimCredenciamento(LocalDate dataFimCredenciamento) {
        this.dataFimCredenciamento = dataFimCredenciamento;
    }

    public LocalDate getDataInicioAbertura() {
        return dataInicioAbertura;
    }

    public void setDataInicioAbertura(LocalDate dataInicioAbertura) {
        this.dataInicioAbertura = dataInicioAbertura;
    }

    public LocalDate getDataFimAbertura() {
        return dataFimAbertura;
    }

    public void setDataFimAbertura(LocalDate dataFimAbertura) {
        this.dataFimAbertura = dataFimAbertura;
    }

    public List<Proposta> getPropostas() {
        return propostas;
    }

    public void setPropostas(List<Proposta> propostas) {
        this.propostas = propostas;
    }
}
