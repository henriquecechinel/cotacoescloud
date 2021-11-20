package com.betha.cotacoescloud.cotacoescloud.model;

import com.betha.cotacoescloud.cotacoescloud.enterprise.AbstractEntity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.validation.constraints.NotNull;
import java.math.BigDecimal;
import java.time.LocalDate;

@Entity
public class Proposta extends AbstractEntity {
    @NotNull(message = "O campo Item da Licitação é obrigatório!")
    @ManyToOne
    @JoinColumn(name = "I_ITEM_LICITACAO", referencedColumnName = "ID")
    private ItemLicitacao itemLicitacao;

    @Column(name = "MARCA")
    private String marca;

    @Column(name = "QUANTIDADE")
    private Long quantidade;

    @Column(name = "VALOR_UNITARIO")
    private BigDecimal valorUnitario;

    @Column(name = "VALOR_TOTAL")
    private BigDecimal valorTotal;

    @Column(name = "SITUACAO")
    private SituacaoProposta situacao;

    @Column(name = "ORDEM_CLASSIFICACAO")
    private Long ordemClassificacao;

    @Column(name = "DATA_VALIDADE_PROPOSTA")
    private LocalDate dataValidadeProposta;

    @Column(name = "PRAZO_PREENCHIMENTO")
    private LocalDate prazoPreenchimento;

    public Proposta(ItemLicitacao itemLicitacao, String marca, Long quantidade, BigDecimal valorUnitario, BigDecimal valorTotal, SituacaoProposta situacao, Long ordemClassificacao, LocalDate dataValidadeProposta, LocalDate prazoPreenchimento) {
        this.itemLicitacao = itemLicitacao;
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
}
