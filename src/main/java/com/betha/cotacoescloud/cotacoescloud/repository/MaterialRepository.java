package com.betha.cotacoescloud.cotacoescloud.repository;


import com.betha.cotacoescloud.cotacoescloud.model.*;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.querydsl.QuerydslPredicateExecutor;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface MaterialRepository extends JpaRepository<Material, Long>, QuerydslPredicateExecutor<Material> {

    List<Material> findByCodigo(String codigo);

    List<Material> findByDescricao(String descricao);

    List<Material> findByUnidadeMedida(String unidadeMedida);

    List<Material> findByTipo(String valorTotal);

}


