package com.betha.cotacoescloud.cotacoescloud.model;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.math.BigDecimal;

@Entity
public class ItensLicitacao {
    @GeneratedValue
    @Column(name = "NUMERO_ITEM")
    private Long numeroItem;
    @NotNull(message = "O campo Quantidade é obrigatório!")
    @Column(name = "QUANTIDADE")
    private Long quantidade;
    @NotNull(message = "O campo valor unitário é obrigatório!")
    @Column(name = "VALOR_UNITARIO" )
    private BigDecimal valorUnitario;
    @Column(name = "VALOR_TOTAL" )
    private BigDecimal valorTotal;
    @ManyToOne
    @NotNull
    @JoinColumn(name = "I_MATERIAL", referencedColumnName = "ID")
    private Material material;

    public ItensLicitacao(Long numeroItem, Long quantidade, BigDecimal valorUnitario, BigDecimal valorTotal, Material material) {
        this.numeroItem = numeroItem;
        this.quantidade = quantidade;
        this.valorUnitario = valorUnitario;
        this.valorTotal = valorTotal;
        this.material = material;
    }

    public ItensLicitacao (){}

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

    public Material getMaterial() {
        return material;
    }

    public void setMaterial(Material material) {
        this.material = material;
    }
}
