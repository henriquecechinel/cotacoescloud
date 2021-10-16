package com.betha.cotacoescloud.cotacoescloud.resource;

import com.betha.cotacoescloud.cotacoescloud.model.Endereco;
import com.betha.cotacoescloud.cotacoescloud.model.Funcionario;
import com.betha.cotacoescloud.cotacoescloud.model.TipoDocumento;

import java.util.Date;

public class FuncionarioDTO {

    private Long id;
    private String nome;
    private Date dataNascimento;
    private String documento;
    private TipoDocumento tipoDocumento;
    private Endereco i_endereco;
    private String telefone;
    private String email;
    private String cargo;
    private Boolean ativo;

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

    public Date getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(Date dataNascimento) {
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

    public static FuncionarioDTO toDTO(Funcionario funcionario){
        FuncionarioDTO dto = new FuncionarioDTO();

        dto.setId(funcionario.getId());
        dto.setNome(funcionario.getNome());
        dto.setDataNascimento(funcionario.getDataNascimento());
        dto.setDocumento(funcionario.getDocumento());
        dto.setTipoDocumento(funcionario.getTipoDocumento());
        dto.setI_endereco(funcionario.getI_endereco());
        dto.setTelefone(funcionario.getTelefone());
        dto.setEmail(funcionario.getEmail());
        dto.setCargo(funcionario.getCargo());
        dto.setAtivo(funcionario.getAtivo());
        return dto;
    }

    public static Funcionario fromDTO(FuncionarioDTO dto){
        Funcionario funcionario = new Funcionario();

        funcionario.setId((dto.getId()));
        funcionario.setNome(dto.getNome());
        funcionario.setDataNascimento(dto.getDataNascimento());
        funcionario.setDocumento(dto.getDocumento());
        funcionario.setTipoDocumento(dto.getTipoDocumento());
        funcionario.setI_endereco(dto.getI_endereco());
        funcionario.setTelefone(dto.getTelefone());
        funcionario.setEmail(dto.getEmail());
        funcionario.setCargo(dto.getCargo());
        funcionario.setAtivo(dto.getAtivo());

        return funcionario;
    }
}
