package com.betha.cotacoescloud.cotacoescloud.model;

public class Material {

    private Long codigo;
    private String descricao;
    private UnidadeMedida unidadeMedida;
    private Tipo tipo;


    public Material(Long codigo, String descricao, UnidadeMedida unidadeMedida, Tipo tipo) {
        this.codigo = codigo;
        this.descricao = descricao;
        this.unidadeMedida = unidadeMedida;
        this.tipo = tipo;
    }


    public Long getCodigo() {
        return codigo;
    }

    public void setCodigo(Long codigo) {
        this.codigo = codigo;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public UnidadeMedida getUnidadeMedida() {
        return unidadeMedida;
    }

    public void setUnidadeMedida(UnidadeMedida unidadeMedida) {
        this.unidadeMedida = unidadeMedida;
    }

    public Tipo getTipo() {
        return tipo;
    }

    public void setTipo(Tipo tipo) {
        this.tipo = tipo;
    }
}
