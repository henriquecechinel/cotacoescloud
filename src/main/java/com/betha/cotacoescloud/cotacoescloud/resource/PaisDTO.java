package com.betha.cotacoescloud.cotacoescloud.resource;

import com.betha.cotacoescloud.cotacoescloud.model.Pais;

public class PaisDTO {

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

    public static PaisDTO toDTO(Pais pais){
        PaisDTO dto = new PaisDTO();
        dto.setId(pais.getId());
        dto.setNome(pais.getNome());
        dto.setPopulacao(pais.getPopulacao());

        return dto;
    }

    public static Pais fromDTO(PaisDTO dto){
        Pais entity = new Pais();
        entity.setId(dto.getId());
        entity.setPopulacao(dto.getPopulacao());
        entity.setNome(dto.getNome());

        return entity;
    }
}
