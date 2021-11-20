package com.betha.cotacoescloud.cotacoescloud.repository;

import com.betha.cotacoescloud.cotacoescloud.model.ProcessoLicitatorio;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.querydsl.QuerydslPredicateExecutor;
import org.springframework.stereotype.Repository;

@Repository
public interface ProcessoLicitatorioRepository extends JpaRepository<ProcessoLicitatorio, Long>, QuerydslPredicateExecutor<ProcessoLicitatorio> {
}
