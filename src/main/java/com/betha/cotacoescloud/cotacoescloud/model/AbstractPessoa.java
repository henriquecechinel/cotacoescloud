package com.betha.cotacoescloud.cotacoescloud.model;

import com.betha.cotacoescloud.cotacoescloud.enterprise.AbstractEntity;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.time.LocalDate;

@MappedSuperclass
public abstract class AbstractPessoa extends AbstractEntity {
    @NotNull(message = "O campo Nome é obrigatório!")
    @Column(name = "NOME")
    private String nome;
    @Column(name = "DATA_NASCIMENTO")
    private LocalDate dataNascimento;
    @NotNull(message = "O campo Documento é obrigatório!")
    @Column(name = "DOCUMENTO")
    private String documento;
    @NotNull(message = "O campo Tipo de Documento é obrigatório!")
    @Column(name = "TIPO_DOCUMENTO")
    private TipoDocumento tipoDocumento;
    @ManyToOne
    @JoinColumn(name = "I_ENDERECO", referencedColumnName = "ID")
    private Endereco endereco;
    @Column(name = "TELEFONE")
    private String telefone;
    @Column(name = "EMAIL")
    private String email;

    public AbstractPessoa(String nome, LocalDate dataNascimento, String documento, TipoDocumento tipoDocumento, Endereco endereco, String telefone, String email) {
        this.nome = nome;
        this.dataNascimento = dataNascimento;
        this.documento = documento;
        this.tipoDocumento = tipoDocumento;
        this.endereco = endereco;
        this.telefone = telefone;
        this.email = email;
    }

    public AbstractPessoa() {}

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public LocalDate getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(LocalDate dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    public String getDocumento() {
        return documento;
    }

    public void setDocumento(String documento) {
        this.documento = documento;
    }

    public TipoDocumento getTipoDocumento() {
        return tipoDocumento;
    }

    public void setTipoDocumento(TipoDocumento tipoDocumento) {
        this.tipoDocumento = tipoDocumento;
    }

    public Endereco getEndereco() {
        return endereco;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
