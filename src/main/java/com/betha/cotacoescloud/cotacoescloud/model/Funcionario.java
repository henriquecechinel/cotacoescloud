package com.betha.cotacoescloud.cotacoescloud.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.validation.constraints.NotNull;
import java.time.LocalDate;
import java.util.Date;

@Entity
public class Funcionario extends AbstractPessoa{
    @NotNull(message = "O campo Cargo é obrigatório!")
    @Column(name = "CARGO")
    private String cargo;
    @NotNull(message = "O campo Ativo é obrigatório!")
    @Column(name = "ATIVO")
    private Boolean ativo;

    public Funcionario(String nome, LocalDate dataNascimento, String documento, TipoDocumento tipoDocumento, Endereco i_endereco, String telefone, String email, String cargo, Boolean ativo) {
        super(nome, dataNascimento, documento, tipoDocumento, i_endereco, telefone, email);
        this.cargo = cargo;
        this.ativo = ativo;
    }

    public Funcionario() {}

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public Boolean getAtivo() {
        return ativo;
    }

    public void setAtivo(Boolean ativo) {
        this.ativo = ativo;
    }

    @Override
    public String toString() {
        return "Funcionario{" +
                "cargo='" + cargo + '\'' +
                ", ativo=" + ativo +
                "} " + super.toString();
    }
}
