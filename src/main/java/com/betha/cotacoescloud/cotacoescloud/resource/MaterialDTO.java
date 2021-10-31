package com.betha.cotacoescloud.cotacoescloud.resource;

import com.betha.cotacoescloud.cotacoescloud.model.Material;
import com.betha.cotacoescloud.cotacoescloud.model.Tipo;
import com.betha.cotacoescloud.cotacoescloud.model.UnidadeMedida;

public class MaterialDTO {

    private Long id;
    private Long codigo;
    private String descricao;
    private UnidadeMedida unidadeMedida;
    private Tipo tipo;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
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

    public static MaterialDTO toDTO(Material material) {
        MaterialDTO dto = new MaterialDTO();
        dto.setId(material.getId());
        dto.setCodigo(material.getCodigo());
        dto.setDescricao(material.getDescricao());
        dto.setUnidadeMedida(material.getUnidadeMedida());
        dto.setTipo(material.getTipo());

        return dto;
    }

    public static Material fromDTO(MaterialDTO dto) {
        Material entity = new Material();
        entity.setId(dto.getId());
        entity.setCodigo(dto.getCodigo());
        entity.setDescricao(dto.getDescricao());
        entity.setUnidadeMedida(dto.getUnidadeMedida());
        entity.setTipo(dto.getTipo());

        return entity;
    }

}



