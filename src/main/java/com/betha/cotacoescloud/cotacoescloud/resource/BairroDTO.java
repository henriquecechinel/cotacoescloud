package com.betha.cotacoescloud.cotacoescloud.resource;

import com.betha.cotacoescloud.cotacoescloud.model.Bairro;

public class BairroDTO {

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

    public static BairroDTO toDTO(Bairro bairro){
        BairroDTO dto = new BairroDTO();
        dto.setId(bairro.getId());
        dto.setNome(bairro.getNome());
        dto.setPopulacao(bairro.getPopulacao());

        return dto;
    }

    public static Bairro fromDTO(BairroDTO dto){
        Bairro entity = new Bairro();
        entity.setId(dto.getId());
        entity.setPopulacao(dto.getPopulacao());
        entity.setNome(dto.getNome());

        return entity;
    }
}
