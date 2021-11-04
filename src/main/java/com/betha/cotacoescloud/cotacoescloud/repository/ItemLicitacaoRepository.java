package com.betha.cotacoescloud.cotacoescloud.repository;

import com.betha.cotacoescloud.cotacoescloud.model.ItemLicitacao;
import com.betha.cotacoescloud.cotacoescloud.model.Material;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.querydsl.QuerydslPredicateExecutor;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ItemLicitacaoRepository extends JpaRepository<ItemLicitacao, Long>, QuerydslPredicateExecutor<ItemLicitacao> {

    List<ItemLicitacao> findByNumeroItem(String numeroItem);

    List<ItemLicitacao> findByQuantidade(String quantidade);

    List<ItemLicitacao> findByValorUnitario(String valorUnitario);

    List<ItemLicitacao> findByValorTotal(String valorTotal);


}
