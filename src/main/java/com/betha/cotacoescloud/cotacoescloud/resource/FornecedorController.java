package com.betha.cotacoescloud.cotacoescloud.resource;

import com.betha.cotacoescloud.cotacoescloud.enterprise.ValidationException;
import com.betha.cotacoescloud.cotacoescloud.model.Fornecedor;
import com.betha.cotacoescloud.cotacoescloud.repository.FornecedorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.persistence.EntityNotFoundException;
import javax.validation.Valid;
import java.text.ParseException;
import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/api/fornecedor")
public class FornecedorController extends AbstractResource {

    @Autowired
    private FornecedorRepository repository;

    @GetMapping
    public List<FornecedorDTO> getFornecedores() {
        return repository.findAll().stream().map(p -> FornecedorDTO.toDTO(p)).collect(Collectors.toList());
    }

    @GetMapping("/{id}")
    public FornecedorDTO getFornecedorId(@PathVariable(value = "id") Long fornecedorId) throws EntityNotFoundException {
        Fornecedor fornecedorFind = repository.findById(fornecedorId)
                .orElseThrow(() -> new EntityNotFoundException("Fornecedor não encontrado com ID: " + fornecedorId));

        return FornecedorDTO.toDTO(fornecedorFind);
    }

    @PostMapping
    public FornecedorDTO create(@Valid @RequestBody Fornecedor fornecedor) throws ValidationException, ParseException {

        List<Fornecedor> byDocumento = repository.findByDocumento(fornecedor.getDocumento());

        if (!byDocumento.isEmpty()) {
            throw new ValidationException("Já existe um Fornecedor com o mesmo Documento registrado!");
        }

        return FornecedorDTO.toDTO(repository.save(fornecedor));
    }

    @PutMapping("/{id}")
    public FornecedorDTO update(@PathVariable(value = "id") Long fornecedorId,
                                 @Valid @RequestBody Fornecedor fornecedor) throws EntityNotFoundException {
        Fornecedor fornecedorFind = repository.findById(fornecedorId)
                .orElseThrow(() -> new EntityNotFoundException("Fornecedor não encontrado com ID: " + fornecedorId));
        fornecedorFind.setId(fornecedorId);
        fornecedorFind.setNome(fornecedor.getNome());
        fornecedorFind.setDataNascimento(fornecedor.getDataNascimento());
        fornecedorFind.setDocumento(fornecedor.getDocumento());
        fornecedorFind.setTipoDocumento(fornecedor.getTipoDocumento());
        fornecedorFind.setEndereco(fornecedor.getEndereco());
        fornecedorFind.setTelefone(fornecedor.getTelefone());
        fornecedorFind.setEmail(fornecedor.getEmail());
        fornecedorFind.setNomeRepresentante(fornecedor.getNomeRepresentante());
        fornecedorFind.setPorte(fornecedor.getPorte());
        fornecedorFind.setNaturezaJuridica(fornecedor.getNaturezaJuridica());

        return FornecedorDTO.toDTO(repository.save(fornecedorFind));
    }
}
