package com.betha.cotacoescloud.cotacoescloud.resource;

import com.betha.cotacoescloud.cotacoescloud.model.*;

import java.math.BigDecimal;
import java.time.LocalDate;

public class PropostaDTO {

    private Long id;
    private ItemLicitacao itemLicitacao;
    private String marca;
    private Long quantidade;
    private BigDecimal valorUnitario;
    private BigDecimal valorTotal;
    private SituacaoProposta situacao;
    private Long ordemClassificacao;
    private LocalDate dataValidadeProposta;
    private LocalDate prazoPreenchimento;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public ItemLicitacao getItemLicitacao() {
        return itemLicitacao;
    }

    public void setItemLicitacao(ItemLicitacao itemLicitacao) {
        this.itemLicitacao = itemLicitacao;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
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

    public SituacaoProposta getSituacao() {
        return situacao;
    }

    public void setSituacao(SituacaoProposta situacao) {
        this.situacao = situacao;
    }

    public Long getOrdemClassificacao() {
        return ordemClassificacao;
    }

    public void setOrdemClassificacao(Long ordemClassificacao) {
        this.ordemClassificacao = ordemClassificacao;
    }

    public LocalDate getDataValidadeProposta() {
        return dataValidadeProposta;
    }

    public void setDataValidadeProposta(LocalDate dataValidadeProposta) {
        this.dataValidadeProposta = dataValidadeProposta;
    }

    public LocalDate getPrazoPreenchimento() {
        return prazoPreenchimento;
    }

    public void setPrazoPreenchimento(LocalDate prazoPreenchimento) {
        this.prazoPreenchimento = prazoPreenchimento;
    }

    public static PropostaDTO toDTO(Proposta proposta){
        PropostaDTO dto = new PropostaDTO();
        dto.setId(proposta.getId());
        dto.setItemLicitacao(proposta.getItemLicitacao());
        dto.setMarca(proposta.getMarca());
        dto.setQuantidade(proposta.getQuantidade());
        dto.setValorUnitario(proposta.getValorUnitario());
        dto.setValorTotal(proposta.getValorTotal());
        dto.setSituacao(proposta.getSituacao());
        dto.setOrdemClassificacao(proposta.getOrdemClassificacao());
        dto.setDataValidadeProposta(proposta.getDataValidadeProposta());
        dto.setPrazoPreenchimento(proposta.getPrazoPreenchimento());

        return dto;
    }

    public static Proposta fromDTO(PropostaDTO dto){
        Proposta entity = new Proposta();
        entity.setId(dto.getId());
        entity.setItemLicitacao(dto.getItemLicitacao());
        entity.setMarca(dto.getMarca());
        entity.setQuantidade(dto.getQuantidade());
        entity.setValorUnitario(dto.getValorUnitario());
        entity.setValorTotal(dto.getValorTotal());
        entity.setSituacao(dto.getSituacao());
        entity.setOrdemClassificacao(dto.getOrdemClassificacao());
        entity.setDataValidadeProposta(dto.getDataValidadeProposta());
        entity.setPrazoPreenchimento(dto.getPrazoPreenchimento());

        return entity;
    }
}
