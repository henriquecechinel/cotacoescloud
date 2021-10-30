package com.betha.cotacoescloud.cotacoescloud.model;

import com.betha.cotacoescloud.cotacoescloud.enterprise.AbstractEntity;

import java.time.LocalDate;

public class Participante extends AbstractEntity {
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

    public Participante(Fornecedor nomeFornecedor, Fornecedor cpfCnpjFornecedor, Fornecedor emailFornecedor, Fornecedor telefoneFornecedor, LocalDate dataCredenciamento, Boolean mpe, String nomeRepresentante, String cpfRepresentante, SedeMPE sedeMPE, SituacaoDocumentacao situacaoDocumentacao) {
        this.nomeFornecedor = nomeFornecedor;
        this.cpfCnpjFornecedor = cpfCnpjFornecedor;
        this.emailFornecedor = emailFornecedor;
        this.telefoneFornecedor = telefoneFornecedor;
        this.dataCredenciamento = dataCredenciamento;
        this.mpe = mpe;
        this.nomeRepresentante = nomeRepresentante;
        this.cpfRepresentante = cpfRepresentante;
        this.sedeMPE = sedeMPE;
        this.situacaoDocumentacao = situacaoDocumentacao;
    }

    public Participante() {}

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
}
