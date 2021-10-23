package com.betha.cotacoescloud.cotacoescloud.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.validation.constraints.NotNull;
import java.time.LocalDate;


@Entity
public class Fornecedor extends AbstractPessoa{

    @NotNull(message = "O campo Nome Representante é obrigatório!")
    @Column(name = "NOME_REPRESENTANTE")
    private String nomeRepresentante;
    @Column(name = "PORTE")
    private Porte porte;
    @Column(name = "NATUREZA_JURIDICA")
    private String naturezaJuridica;


    public Fornecedor(String nome, LocalDate dataNascimento, String documento, TipoDocumento tipoDocumento, Endereco i_endereco, String telefone, String email, String nomeRepresentante, Porte porte, String naturezaJuridica) {
        super(nome, dataNascimento, documento, tipoDocumento, i_endereco, telefone, email);
        this.nomeRepresentante = nomeRepresentante;
        this.porte = porte;
        this.naturezaJuridica = naturezaJuridica;
    }

    public Fornecedor() {}

    public String getNomeRepresentante() {
        return nomeRepresentante;
    }

    public void setNomeRepresentante(String nomeRepresentante) {
        this.nomeRepresentante = nomeRepresentante;
    }

    public Porte getPorte() {
        return porte;
    }

    public void setPorte(Porte porte) {
        this.porte = porte;
    }

    public String getNaturezaJuridica() {
        return naturezaJuridica;
    }

    public void setNaturezaJuridica(String naturezaJuridica) {
        this.naturezaJuridica = naturezaJuridica;
    }
}



