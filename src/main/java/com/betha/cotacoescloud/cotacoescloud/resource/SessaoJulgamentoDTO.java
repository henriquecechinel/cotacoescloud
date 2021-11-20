package com.betha.cotacoescloud.cotacoescloud.resource;

import com.betha.cotacoescloud.cotacoescloud.model.*;

import java.time.LocalDate;
import java.util.List;

public class SessaoJulgamentoDTO {

    private Long id;
    private String tipoSessao;
    private LocalDate dataInicioCredenciamento;
    private LocalDate dataFimCredenciamento;
    private LocalDate dataInicioAbertura;
    private LocalDate dataFimAbertura;
    private List<Participante> participantes;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

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

    public List<Participante> getParticipantes() {
        return participantes;
    }

    public void setParticipantes(List<Participante> participantes) {
        this.participantes = participantes;
    }

    public static SessaoJulgamentoDTO toDTO(SessaoJulgamento sessaoJulgamento){
        SessaoJulgamentoDTO dto = new SessaoJulgamentoDTO();
        dto.setId(sessaoJulgamento.getId());
        dto.setTipoSessao(sessaoJulgamento.getTipoSessao());
        dto.setDataInicioCredenciamento(sessaoJulgamento.getDataInicioCredenciamento());
        dto.setDataFimCredenciamento(sessaoJulgamento.getDataFimCredenciamento());
        dto.setDataInicioAbertura(sessaoJulgamento.getDataInicioAbertura());
        dto.setDataFimAbertura(sessaoJulgamento.getDataFimAbertura());
        dto.setParticipantes(sessaoJulgamento.getParticipantes());

        return dto;
    }

    public static SessaoJulgamento fromDTO(SessaoJulgamentoDTO dto){
        SessaoJulgamento entity = new SessaoJulgamento();
        entity.setId(dto.getId());
        entity.setTipoSessao(dto.getTipoSessao());
        entity.setDataInicioCredenciamento(dto.getDataInicioCredenciamento());
        entity.setDataFimCredenciamento(dto.getDataFimCredenciamento());
        entity.setDataInicioAbertura(dto.getDataInicioAbertura());
        entity.setDataFimAbertura(dto.getDataFimAbertura());
        entity.setParticipantes(dto.getParticipantes());

        return entity;
    }
}
