package com.betha.cotacoescloud.cotacoescloud.model;

import com.betha.cotacoescloud.cotacoescloud.enterprise.AbstractEntity;

import java.math.BigDecimal;
import java.time.LocalDate;

public class Proposta extends AbstractEntity {
    private ItemLicitacao numeroItem;
    private ItemLicitacao descricaoMaterial;
    private String marca;
    private Long quantidade;
    private BigDecimal valorUnitario;
    private BigDecimal valorTotal;
    private SituacaoProposta situacao;
    private Long ordemClassificacao;
    private LocalDate dataValidadeProposta;
    private LocalDate prazoPreenchimento;

    public Proposta(ItemLicitacao numeroItem, ItemLicitacao descricaoMaterial, String marca, Long quantidade, BigDecimal valorUnitario, BigDecimal valorTotal, SituacaoProposta situacao, Long ordemClassificacao, LocalDate dataValidadeProposta, LocalDate prazoPreenchimento) {
        this.numeroItem = numeroItem;
        this.descricaoMaterial = descricaoMaterial;
        this.marca = marca;
        this.quantidade = quantidade;
        this.valorUnitario = valorUnitario;
        this.valorTotal = valorTotal;
        this.situacao = situacao;
        this.ordemClassificacao = ordemClassificacao;
        this.dataValidadeProposta = dataValidadeProposta;
        this.prazoPreenchimento = prazoPreenchimento;
    }

    public Proposta() {}

    public ItemLicitacao getNumeroItem() {
        return numeroItem;
    }

    public void setNumeroItem(ItemLicitacao numeroItem) {
        this.numeroItem = numeroItem;
    }

    public ItemLicitacao getDescricaoMaterial() {
        return descricaoMaterial;
    }

    public void setDescricaoMaterial(ItemLicitacao descricaoMaterial) {
        this.descricaoMaterial = descricaoMaterial;
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
}
