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
    @JoinColumn(name = "", referencedColumnName = "ID")
    private Material i_material;

}
