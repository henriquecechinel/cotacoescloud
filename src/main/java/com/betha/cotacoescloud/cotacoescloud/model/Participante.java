package com.betha.cotacoescloud.cotacoescloud.model;

import com.betha.cotacoescloud.cotacoescloud.enterprise.AbstractEntity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.validation.constraints.NotNull;
import java.time.LocalDate;

@Entity
public class Participante extends AbstractEntity {
    @NotNull(message = "O campo Fornecedor é obrigatório!")
    @ManyToOne
    @JoinColumn(name = "I_FORNECEDOR", referencedColumnName = "ID")
    private Fornecedor fornecedor;

    @Column(name = "DATA_CREDENCIAMENTO")
    private LocalDate dataCredenciamento;

    @Column(name = "MPE")
    private Boolean mpe;

    @Column(name = "NOME_REPRESENTANTE")
    private String nomeRepresentante;

    @Column(name = "CPF_REPRESENTANTE")
    private String cpfRepresentante;

    @Column(name = "SEDE_MPE")
    private SedeMPE sedeMPE;

    @Column(name = "SITUACAO_DOCUMENTO")
    private SituacaoDocumentacao situacaoDocumentacao;

    public Participante(Fornecedor fornecedor, LocalDate dataCredenciamento, Boolean mpe, String nomeRepresentante, String cpfRepresentante, SedeMPE sedeMPE, SituacaoDocumentacao situacaoDocumentacao) {
        this.fornecedor = fornecedor;
        this.dataCredenciamento = dataCredenciamento;
        this.mpe = mpe;
        this.nomeRepresentante = nomeRepresentante;
        this.cpfRepresentante = cpfRepresentante;
        this.sedeMPE = sedeMPE;
        this.situacaoDocumentacao = situacaoDocumentacao;
    }

    public Participante() {}

    public void setFornecedor(Fornecedor fornecedor) {
        this.fornecedor = fornecedor;
    }

    public Fornecedor getFornecedor() {
        return fornecedor;
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
}
