package com.betha.cotacoescloud.cotacoescloud.resource;

import com.betha.cotacoescloud.cotacoescloud.model.Fornecedor;
import com.betha.cotacoescloud.cotacoescloud.model.Participante;
import com.betha.cotacoescloud.cotacoescloud.model.SedeMPE;
import com.betha.cotacoescloud.cotacoescloud.model.SituacaoDocumentacao;

import java.time.LocalDate;

public class ParticipanteDTO {

    private Long id;
    private Fornecedor fornecedor;
    private LocalDate dataCredenciamento;
    private Boolean mpe;
    private String nomeRepresentante;
    private String cpfRepresentante;
    private SedeMPE sedeMPE;
    private SituacaoDocumentacao situacaoDocumentacao;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Fornecedor getFornecedor() {
        return fornecedor;
    }

    public void setFornecedor(Fornecedor fornecedor) {
        this.fornecedor = fornecedor;
    }

    public LocalDate getDataCredenciamento() {
        return dataCredenciamento;
    }

    public void setDataCredenciamento(LocalDate dataCredenciamento) {
        this.dataCredenciamento = dataCredenciamento;
    }

    public Boolean getMpe() {
        return mpe;
    }

    public void setMpe(Boolean mpe) {
        this.mpe = mpe;
    }

    public String getNomeRepresentante() {
        return nomeRepresentante;
    }

    public void setNomeRepresentante(String nomeRepresentante) {
        this.nomeRepresentante = nomeRepresentante;
    }

    public String getCpfRepresentante() {
        return cpfRepresentante;
    }

    public void setCpfRepresentante(String cpfRepresentante) {
        this.cpfRepresentante = cpfRepresentante;
    }

    public SedeMPE getSedeMPE() {
        return sedeMPE;
    }

    public void setSedeMPE(SedeMPE sedeMPE) {
        this.sedeMPE = sedeMPE;
    }

    public SituacaoDocumentacao getSituacaoDocumentacao() {
        return situacaoDocumentacao;
    }

    public void setSituacaoDocumentacao(SituacaoDocumentacao situacaoDocumentacao) {
        this.situacaoDocumentacao = situacaoDocumentacao;
    }

    public static ParticipanteDTO toDTO(Participante participante){
        ParticipanteDTO dto = new ParticipanteDTO();
        dto.setId(participante.getId());
        dto.setFornecedor(participante.getFornecedor());
        dto.setDataCredenciamento(participante.getDataCredenciamento());
        dto.setMpe(participante.getMpe());
        dto.setNomeRepresentante(participante.getNomeRepresentante());
        dto.setCpfRepresentante(participante.getCpfRepresentante());
        dto.setSedeMPE(participante.getSedeMPE());
        dto.setSituacaoDocumentacao(participante.getSituacaoDocumentacao());

        return dto;
    }

    public static Participante fromDTO(ParticipanteDTO dto){
        Participante entity = new Participante();
        entity.setId(dto.getId());
        entity.setFornecedor(dto.getFornecedor());
        entity.setDataCredenciamento(dto.getDataCredenciamento());
        entity.setMpe(dto.getMpe());
        entity.setNomeRepresentante(dto.getNomeRepresentante());
        entity.setCpfRepresentante(dto.getCpfRepresentante());
        entity.setSedeMPE(dto.getSedeMPE());
        entity.setSituacaoDocumentacao(dto.getSituacaoDocumentacao());

        return entity;
    }
}
