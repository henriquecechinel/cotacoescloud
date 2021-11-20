package com.betha.cotacoescloud.cotacoescloud.model;

import com.betha.cotacoescloud.cotacoescloud.enterprise.AbstractEntity;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.time.LocalDate;
import java.util.List;

@Entity
public class ProcessoLicitatorio extends AbstractEntity {
    @Column(name = "NUMERO_PROCESSO")
    private Long numeroProcesso;

    @Column(name = "NUMERO_LICITACAO")
    private Long numeroLicitacao;

    @Column(name = "DATA_PROCESSO")
    private LocalDate dataProcesso;

    @Column(name = "DATA_LICITACAO")
    private LocalDate dataLicitacao;

    @Column(name = "OBJETO")
    private String objeto;

    @Column(name = "TIPO_OBJETO")
    private String tipoObjeto;

    @Column(name = "MODALIDADE")
    private String modalidade;

    @Column(name = "LEI")
    private String lei;

    @Column(name = "CRITERIO_JULGAMENTO")
    private String criterioJulgamento;

    @Column(name = "AGENTE_CONTRATACAO")
    private String agenteContratacao;

    @Column(name = "RESPONSAVEL_LICITACAO")
    private String responsavelLicitacao;

    @ManyToMany(cascade = {CascadeType.REFRESH})
    @JoinTable(
            name = "PROCESSO_LICITATORIO_ITENS_LICITACAO",
            joinColumns = {@JoinColumn(name = "PROCESSO_LICITATORIO_ID")},
            inverseJoinColumns = {@JoinColumn(name = "ITEM_LICITACAO_ID")}
    )
    private List<ItemLicitacao> itensLicitacao;

    @NotNull(message = "O campo Sessão de Julgamento é obrigatório!")
    @ManyToOne
    @JoinColumn(name = "I_SESSAO_JULGAMENTO", referencedColumnName = "ID")
    private SessaoJulgamento sessaoJulgamento;

    public ProcessoLicitatorio(Long numeroProcesso, Long numeroLicitacao, LocalDate dataProcesso, LocalDate dataLicitacao, String objeto, String tipoObjeto, String modalidade, String lei, String criterioJulgamento, String agenteContratacao, String responsavelLicitacao, List<ItemLicitacao> itensLicitacao, SessaoJulgamento sessaoJulgamento) {
        this.numeroProcesso = numeroProcesso;
        this.numeroLicitacao = numeroLicitacao;
        this.dataProcesso = dataProcesso;
        this.dataLicitacao = dataLicitacao;
        this.objeto = objeto;
        this.tipoObjeto = tipoObjeto;
        this.modalidade = modalidade;
        this.lei = lei;
        this.criterioJulgamento = criterioJulgamento;
        this.agenteContratacao = agenteContratacao;
        this.responsavelLicitacao = responsavelLicitacao;
        this.itensLicitacao = itensLicitacao;
        this.sessaoJulgamento = sessaoJulgamento;
    }

    public ProcessoLicitatorio() {}

    public Long getNumeroProcesso() {
        return numeroProcesso;
    }

    public void setNumeroProcesso(Long numeroProcesso) {
        this.numeroProcesso = numeroProcesso;
    }

    public Long getNumeroLicitacao() {
        return numeroLicitacao;
    }

    public void setNumeroLicitacao(Long numeroLicitacao) {
        this.numeroLicitacao = numeroLicitacao;
    }

    public LocalDate getDataProcesso() {
        return dataProcesso;
    }

    public void setDataProcesso(LocalDate dataProcesso) {
        this.dataProcesso = dataProcesso;
    }

    public LocalDate getDataLicitacao() {
        return dataLicitacao;
    }

    public void setDataLicitacao(LocalDate dataLicitacao) {
        this.dataLicitacao = dataLicitacao;
    }

    public String getObjeto() {
        return objeto;
    }

    public void setObjeto(String objeto) {
        this.objeto = objeto;
    }

    public String getTipoObjeto() {
        return tipoObjeto;
    }

    public void setTipoObjeto(String tipoObjeto) {
        this.tipoObjeto = tipoObjeto;
    }

    public String getModalidade() {
        return modalidade;
    }

    public void setModalidade(String modalidade) {
        this.modalidade = modalidade;
    }

    public String getLei() {
        return lei;
    }

    public void setLei(String lei) {
        this.lei = lei;
    }

    public String getCriterioJulgamento() {
        return criterioJulgamento;
    }

    public void setCriterioJulgamento(String criterioJulgamento) {
        this.criterioJulgamento = criterioJulgamento;
    }

    public String getAgenteContratacao() {
        return agenteContratacao;
    }

    public void setAgenteContratacao(String agenteContratacao) {
        this.agenteContratacao = agenteContratacao;
    }

    public String getResponsavelLicitacao() {
        return responsavelLicitacao;
    }

    public void setResponsavelLicitacao(String responsavelLicitacao) {
        this.responsavelLicitacao = responsavelLicitacao;
    }

    public List<ItemLicitacao> getItensLicitacao() {
        return itensLicitacao;
    }

    public void setItensLicitacao(List<ItemLicitacao> itensLicitacao) {
        this.itensLicitacao = itensLicitacao;
    }

    public SessaoJulgamento getSessaoJulgamento() {
        return sessaoJulgamento;
    }

    public void setSessaoJulgamento(SessaoJulgamento sessaoJulgamento) {
        this.sessaoJulgamento = sessaoJulgamento;
    }
}



