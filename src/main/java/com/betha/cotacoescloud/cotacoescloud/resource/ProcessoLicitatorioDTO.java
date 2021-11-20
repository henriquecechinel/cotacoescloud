package com.betha.cotacoescloud.cotacoescloud.resource;

import com.betha.cotacoescloud.cotacoescloud.model.ItemLicitacao;
import com.betha.cotacoescloud.cotacoescloud.model.ProcessoLicitatorio;
import com.betha.cotacoescloud.cotacoescloud.model.Proposta;
import com.betha.cotacoescloud.cotacoescloud.model.SessaoJulgamento;

import java.time.LocalDate;
import java.util.List;

public class ProcessoLicitatorioDTO {

    private Long id;
    private Long numeroProcesso;
    private Long numeroLicitacao;
    private LocalDate dataProcesso;
    private LocalDate dataLicitacao;
    private String objeto;
    private String tipoObjeto;
    private String modalidade;
    private String lei;
    private String criterioJulgamento;
    private String agenteContratacao;
    private String responsavelLicitacao;
    private List<ItemLicitacao> itensLicitacao;
    private SessaoJulgamento sessaoJulgamento;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

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

    public static ProcessoLicitatorioDTO toDTO(ProcessoLicitatorio processoAdministrativo){
        ProcessoLicitatorioDTO dto = new ProcessoLicitatorioDTO();
        dto.setId(processoAdministrativo.getId());
        dto.setNumeroProcesso(processoAdministrativo.getNumeroProcesso());
        dto.setNumeroLicitacao(processoAdministrativo.getNumeroLicitacao());
        dto.setDataProcesso(processoAdministrativo.getDataProcesso());
        dto.setDataLicitacao(processoAdministrativo.getDataLicitacao());
        dto.setObjeto(processoAdministrativo.getObjeto());
        dto.setTipoObjeto(processoAdministrativo.getTipoObjeto());
        dto.setModalidade(processoAdministrativo.getModalidade());
        dto.setLei(processoAdministrativo.getLei());
        dto.setCriterioJulgamento(processoAdministrativo.getCriterioJulgamento());
        dto.setAgenteContratacao(processoAdministrativo.getAgenteContratacao());
        dto.setResponsavelLicitacao(processoAdministrativo.getResponsavelLicitacao());
        dto.setItensLicitacao(processoAdministrativo.getItensLicitacao());
        dto.setSessaoJulgamento(processoAdministrativo.getSessaoJulgamento());

        return dto;
    }

    public static ProcessoLicitatorio fromDTO(ProcessoLicitatorioDTO dto){
        ProcessoLicitatorio entity = new ProcessoLicitatorio();
        entity.setId(dto.getId());
        entity.setNumeroProcesso(dto.getNumeroProcesso());
        entity.setNumeroLicitacao(dto.getNumeroLicitacao());
        entity.setDataProcesso(dto.getDataProcesso());
        entity.setDataLicitacao(dto.getDataLicitacao());
        entity.setObjeto(dto.getObjeto());
        entity.setTipoObjeto(dto.getTipoObjeto());
        entity.setModalidade(dto.getModalidade());
        entity.setLei(dto.getLei());
        entity.setCriterioJulgamento(dto.getCriterioJulgamento());
        entity.setAgenteContratacao(dto.getAgenteContratacao());
        entity.setResponsavelLicitacao(dto.getResponsavelLicitacao());
        entity.setItensLicitacao(dto.getItensLicitacao());
        entity.setSessaoJulgamento(dto.getSessaoJulgamento());

        return entity;
    }
}
