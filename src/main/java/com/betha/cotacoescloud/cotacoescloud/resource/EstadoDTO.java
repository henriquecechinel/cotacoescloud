package com.betha.cotacoescloud.cotacoescloud.resource;

import com.betha.cotacoescloud.cotacoescloud.model.Estado;

public class EstadoDTO {

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

    public static EstadoDTO toDTO(Estado estado){
        EstadoDTO dto = new EstadoDTO();
        dto.setId(estado.getId());
        dto.setNome(estado.getNome());
        dto.setPopulacao(estado.getPopulacao());

        return dto;
    }

    public static Estado fromDTO(EstadoDTO dto){
        Estado entity = new Estado();
        entity.setId(dto.getId());
        entity.setPopulacao(dto.getPopulacao());
        entity.setNome(dto.getNome());

        return entity;
    }
}
