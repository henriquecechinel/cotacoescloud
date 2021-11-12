package com.betha.cotacoescloud.cotacoescloud.model;

import com.betha.cotacoescloud.cotacoescloud.enterprise.AbstractEntity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.validation.constraints.NotNull;

@Entity
public class Material extends AbstractEntity {

    @GeneratedValue
    @NotNull(message = "O campo Código é obrigatório!")
    @Column(name = "CODIGO")
    private Long codigo;
    @NotNull(message = "O campo Descrição é obrigatório!")
    @Column(name = "DESCRICAO")
    private String descricao;
    @NotNull(message = "O campo Unidade e Medida é obrigatório!")
    @Column(name = "UNIDADE_MEDIDA")
    private UnidadeMedida unidadeMedida;
    @NotNull(message = "O campo Tipo é obrigatório!")
    @Column(name = "Tipo")
    private Tipo tipo;

    public Material(Long codigo, String descricao, UnidadeMedida unidadeMedida, Tipo tipo) {
        this.codigo = codigo;
        this.descricao = descricao;
        this.unidadeMedida = unidadeMedida;
        this.tipo = tipo;
    }

    public Material() {}

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
