package com.betha.cotacoescloud.cotacoescloud.resource;

import com.betha.cotacoescloud.cotacoescloud.model.Logradouro;

public class LogradouroDTO {

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

    public static LogradouroDTO toDTO(Logradouro logradouro){
        LogradouroDTO dto = new LogradouroDTO();
        dto.setId(logradouro.getId());
        dto.setNome(logradouro.getNome());
        dto.setPopulacao(logradouro.getPopulacao());

        return dto;
    }

    public static Logradouro fromDTO(LogradouroDTO dto){
        Logradouro entity = new Logradouro();
        entity.setId(dto.getId());
        entity.setPopulacao(dto.getPopulacao());
        entity.setNome(dto.getNome());

        return entity;
    }
}
