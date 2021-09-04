package com.betha.cotacoescloud.cotacoescloud.repository;

import com.betha.cotacoescloud.cotacoescloud.model.Pais;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PaisRepository extends JpaRepository<Pais, Long> {
}
