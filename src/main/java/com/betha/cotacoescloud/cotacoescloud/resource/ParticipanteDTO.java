package com.betha.cotacoescloud.cotacoescloud.resource;

import com.betha.cotacoescloud.cotacoescloud.model.Fornecedor;
import com.betha.cotacoescloud.cotacoescloud.model.Participante;
import com.betha.cotacoescloud.cotacoescloud.model.SedeMPE;
import com.betha.cotacoescloud.cotacoescloud.model.SituacaoDocumentacao;

import java.time.LocalDate;

public class ParticipanteDTO {

    private Long id;
    private Fornecedor nomeFornecedor;
    private Fornecedor cpfCnpjFornecedor;
    private Fornecedor emailFornecedor;
    private Fornecedor telefoneFornecedor;
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

    public Fornecedor getNomeFornecedor() {
        return nomeFornecedor;
    }

    public void setNomeFornecedor(Fornecedor nomeFornecedor) {
        this.nomeFornecedor = nomeFornecedor;
    }

    public Fornecedor getCpfCnpjFornecedor() {
        return cpfCnpjFornecedor;
    }

    public void setCpfCnpjFornecedor(Fornecedor cpfCnpjFornecedor) {
        this.cpfCnpjFornecedor = cpfCnpjFornecedor;
    }

    public Fornecedor getEmailFornecedor() {
        return emailFornecedor;
    }

    public void setEmailFornecedor(Fornecedor emailFornecedor) {
        this.emailFornecedor = emailFornecedor;
    }

    public Fornecedor getTelefoneFornecedor() {
        return telefoneFornecedor;
    }

    public void setTelefoneFornecedor(Fornecedor telefoneFornecedor) {
        this.telefoneFornecedor = telefoneFornecedor;
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
        dto.setNomeFornecedor(participante.getNomeFornecedor());
        dto.setCpfCnpjFornecedor(participante.getCpfCnpjFornecedor());
        dto.setEmailFornecedor(participante.getEmailFornecedor());
        dto.setTelefoneFornecedor(participante.getTelefoneFornecedor());
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
        entity.setNomeFornecedor(dto.getNomeFornecedor());
        entity.setCpfCnpjFornecedor(dto.getCpfCnpjFornecedor());
        entity.setEmailFornecedor(dto.getEmailFornecedor());
        entity.setTelefoneFornecedor(dto.getTelefoneFornecedor());
        entity.setDataCredenciamento(dto.getDataCredenciamento());
        entity.setMpe(dto.getMpe());
        entity.setNomeRepresentante(dto.getNomeRepresentante());
        entity.setCpfRepresentante(dto.getCpfRepresentante());
        entity.setSedeMPE(dto.getSedeMPE());
        entity.setSituacaoDocumentacao(dto.getSituacaoDocumentacao());

        return entity;
    }
}
