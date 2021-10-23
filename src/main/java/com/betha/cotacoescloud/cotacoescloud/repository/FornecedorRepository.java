package com.betha.cotacoescloud.cotacoescloud.repository;


import com.betha.cotacoescloud.cotacoescloud.model.Fornecedor;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface FornecedorRepository extends JpaRepository<Fornecedor, Long> {

    List<Fornecedor> findByNome(String nome);

    List<Fornecedor> findByPorte(String porte);

    List<Fornecedor> findByTipoDocumento(String tipoDocumento);

    List<Fornecedor> findByDocumento(String documento);
}
