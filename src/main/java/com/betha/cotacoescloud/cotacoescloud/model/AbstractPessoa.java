package com.betha.cotacoescloud.cotacoescloud.model;

import com.betha.cotacoescloud.cotacoescloud.enterprise.AbstractEntity;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.time.LocalDate;
import java.util.Date;

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
    private Endereco i_endereco;
    @Column(name = "TELEFONE")
    private String telefone;
    @Column(name = "EMAIL")
    private String email;

    public AbstractPessoa(String nome, String dataNascimento, String documento, TipoDocumento tipoDocumento, Endereco i_endereco, String telefone, String email) {
        this.nome = nome;
        this.dataNascimento = dataNascimento;
        this.documento = documento;
        this.tipoDocumento = tipoDocumento;
        this.i_endereco = i_endereco;
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

    public String getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(String dataNascimento) {
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

    public Endereco getI_endereco() {
        return i_endereco;
    }

    public void setI_endereco(Endereco i_endereco) {
        this.i_endereco = i_endereco;
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

    @Override
    public String toString() {
        return "AbstractPessoa{" +
                "nome='" + nome + '\'' +
                ", dataNascimento=" + dataNascimento +
                ", documento='" + documento + '\'' +
                ", tipoDocumento='" + tipoDocumento + '\'' +
                ", i_endereco=" + i_endereco +
                ", telefone='" + telefone + '\'' +
                ", email='" + email + '\'' +
                "} " + super.toString();
    }
}
