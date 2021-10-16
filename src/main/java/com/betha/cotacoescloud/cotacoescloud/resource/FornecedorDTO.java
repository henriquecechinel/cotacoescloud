package com.betha.cotacoescloud.cotacoescloud.resource;

import com.betha.cotacoescloud.cotacoescloud.model.Endereco;
import com.betha.cotacoescloud.cotacoescloud.model.Fornecedor;
import com.betha.cotacoescloud.cotacoescloud.model.Porte;
import com.betha.cotacoescloud.cotacoescloud.model.TipoDocumento;

public class FornecedorDTO {


    private Long id;
    private String nome;
    private String dataNascimento;
    private String documento;
    private TipoDocumento tipoDocumento;
    private Endereco i_endereco;
    private String telefone;
    private String email;
    private String nomeRepresentante;
    private Porte porte;
    private String naturezaJuridica;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

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

    public static FornecedorDTO toDTO(Fornecedor fornecedor){
        FornecedorDTO dto = new FornecedorDTO();

        dto.setId(fornecedor.getId());
        dto.setNome(fornecedor.getNome());
        dto.setDataNascimento(fornecedor.getDataNascimento());
        dto.setDocumento(fornecedor.getDocumento());
        dto.setTipoDocumento(fornecedor.getTipoDocumento());
        dto.setI_endereco(fornecedor.getI_endereco());
        dto.setTelefone(fornecedor.getTelefone());
        dto.setEmail(fornecedor.getEmail());
        dto.setNomeRepresentante(fornecedor.getNomeRepresentante());
        dto.setPorte(fornecedor.getPorte());
        dto.setNaturezaJuridica(fornecedor.getNaturezaJuridica());
        return dto;
    }

    public static Fornecedor fromDTO(FornecedorDTO dto){
        Fornecedor fornecedor = new Fornecedor();

        fornecedor.setId((dto.getId()));
        fornecedor.setNome(dto.getNome());
        fornecedor.setDataNascimento(dto.getDataNascimento());
        fornecedor.setDocumento(dto.getDocumento());
        fornecedor.setTipoDocumento(dto.getTipoDocumento());
        fornecedor.setI_endereco(dto.getI_endereco());
        fornecedor.setTelefone(dto.getTelefone());
        fornecedor.setEmail(dto.getEmail());
        fornecedor.setNomeRepresentante(fornecedor.getNomeRepresentante());
        fornecedor.setPorte(fornecedor.getPorte());
        fornecedor.setNaturezaJuridica(fornecedor.getNaturezaJuridica());

        return fornecedor;
    }

}




