package com.betha.cotacoescloud.cotacoescloud.resource;

import com.betha.cotacoescloud.cotacoescloud.model.Municipio;

public class MunicipioDTO {

    private Long id;
    private String nome;
    private Long populacao;

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

    public Long getPopulacao() {
        return populacao;
    }

    public void setPopulacao(Long populacao) {
        this.populacao = populacao;
    }

    public static MunicipioDTO toDTO(Municipio municipio){
        MunicipioDTO dto = new MunicipioDTO();
        dto.setId(municipio.getId());
        dto.setNome(municipio.getNome());
        dto.setPopulacao(municipio.getPopulacao());

        return dto;
    }

    public static Municipio fromDTO(MunicipioDTO dto){
        Municipio entity = new Municipio();
        entity.setId(dto.getId());
        entity.setPopulacao(dto.getPopulacao());
        entity.setNome(dto.getNome());

        return entity;
    }
}
