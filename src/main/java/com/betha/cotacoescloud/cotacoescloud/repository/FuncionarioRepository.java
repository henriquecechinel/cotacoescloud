package com.betha.cotacoescloud.cotacoescloud.repository;

import com.betha.cotacoescloud.cotacoescloud.model.Funcionario;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface FuncionarioRepository extends JpaRepository<Funcionario, Long> {

    List<Funcionario> findByNome(String nome);

    List<Funcionario> findByTipoDocumento(String tipoDocumento);

    List<Funcionario> findByDocumento(String documento);

    List<Funcionario> findByCargo(String cargo);

    List<Funcionario> findByAtivo(Boolean ativo);
}
