package com.betha.cotacoescloud.cotacoescloud.resource;


import com.betha.cotacoescloud.cotacoescloud.model.ItemLicitacao;

import java.math.BigDecimal;

public class ItemLicitacaoDTO {

    private Long id;
    private Long numeroItem;
    private Long quantidade;
    private BigDecimal valorUnitario;
    private BigDecimal valorTotal;


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getNumeroItem() {
        return numeroItem;
    }

    public void setNumeroItem(Long numeroItem) {
        this.numeroItem = numeroItem;
    }

    public Long getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(Long quantidade) {
        this.quantidade = quantidade;
    }

    public BigDecimal getValorUnitario() {
        return valorUnitario;
    }

    public void setValorUnitario(BigDecimal valorUnitario) {
        this.valorUnitario = valorUnitario;
    }

    public BigDecimal getValorTotal() {
        return valorTotal;
    }

    public void setValorTotal(BigDecimal valorTotal) {
        this.valorTotal = valorTotal;
    }

    public static ItemLicitacaoDTO toDTO(ItemLicitacao itemLicitacao) {
        ItemLicitacaoDTO dto = new ItemLicitacaoDTO();
        dto.setId(itemLicitacao.getId());
        dto.setNumeroItem(itemLicitacao.getNumeroItem());
        dto.setQuantidade(itemLicitacao.getQuantidade());
        dto.setValorUnitario(itemLicitacao.getValorUnitario());
        dto.setValorTotal(itemLicitacao.getValorTotal());

        return dto;
    }

    public static ItemLicitacao fromDTO(ItemLicitacaoDTO dto) {
        ItemLicitacao entity = new ItemLicitacao();
        entity.setId(dto.getId());
        entity.setNumeroItem(dto.getNumeroItem());
        entity.setQuantidade(dto.getQuantidade());
        entity.setValorUnitario(dto.getValorUnitario());
        entity.setValorTotal(dto.getValorTotal());

        return entity;
    }

}
