package com.betha.cotacoescloud.cotacoescloud.resource;

import com.betha.cotacoescloud.cotacoescloud.model.Funcionario;
import com.betha.cotacoescloud.cotacoescloud.repository.FuncionarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.persistence.EntityNotFoundException;
import javax.validation.Valid;
import com.betha.cotacoescloud.cotacoescloud.enterprise.ValidationException;

import java.text.ParseException;
import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/api/funcionarios")
public class FuncionarioController extends AbstractResource {

    @Autowired
    private FuncionarioRepository repository;

    @GetMapping
    public List<FuncionarioDTO> getFuncionarios() {
        return repository.findAll().stream().map(p-> FuncionarioDTO.toDTO(p)).collect(Collectors.toList());
    }

    @GetMapping("/{id}")
    public FuncionarioDTO getFuncionariosId(@PathVariable(value = "id") Long funcionarioId) throws EntityNotFoundException {
        Funcionario funcionarioFind = repository.findById(funcionarioId)
                .orElseThrow(() -> new EntityNotFoundException("Funcionario não encontrado com ID: " + funcionarioId));

        return FuncionarioDTO.toDTO(funcionarioFind);
    }

    @PostMapping
    public FuncionarioDTO create(@Valid @RequestBody Funcionario funcionario) throws ValidationException, ParseException {

        List<Funcionario> byDocumento = repository.findByDocumento(funcionario.getDocumento());

        if(!byDocumento.isEmpty()){
            throw new ValidationException("Já existe um Funcionário com o mesmo Documento registrado!");
        }

        return FuncionarioDTO.toDTO(repository.save(funcionario));
    }

    @PostMapping("/list")
    public List<FuncionarioDTO> createList(@Valid @RequestBody List<Funcionario> funcionarioes){
        funcionarioes.stream().forEach(p-> {
            repository.save(p);
        });

        return repository.findAll().stream().map(p-> FuncionarioDTO.toDTO(p)).collect(Collectors.toList());
    }

    @PutMapping("/{id}")
    public FuncionarioDTO update(@PathVariable(value = "id") Long funcionarioId,
                          @Valid @RequestBody Funcionario funcionario) throws EntityNotFoundException {
        Funcionario funcionarioFind = repository.findById(funcionarioId)
                .orElseThrow(() -> new EntityNotFoundException("Funcionario não encontrado com ID: " + funcionarioId));
        funcionarioFind.setId(funcionarioId);
        funcionarioFind.setNome(funcionario.getNome());
        funcionarioFind.setDataNascimento(funcionario.getDataNascimento());
        funcionarioFind.setDocumento(funcionario.getDocumento());
        funcionarioFind.setTipoDocumento(funcionario.getTipoDocumento());
        funcionarioFind.setEndereco(funcionario.getEndereco());
        funcionarioFind.setTelefone(funcionario.getTelefone());
        funcionarioFind.setEmail(funcionario.getEmail());
        funcionarioFind.setCargo(funcionario.getCargo());

        return FuncionarioDTO.toDTO(repository.save(funcionarioFind));
    }
}
