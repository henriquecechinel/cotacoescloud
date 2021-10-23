package com.betha.cotacoescloud.cotacoescloud.resource;

import com.betha.cotacoescloud.cotacoescloud.model.Bairro;
import com.betha.cotacoescloud.cotacoescloud.repository.BairroRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.validation.FieldError;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.*;

import javax.persistence.EntityNotFoundException;
import javax.validation.Valid;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/api/bairros")
public class BairroController {

    @Autowired
    private BairroRepository repository;

    @GetMapping
    public List<BairroDTO> getBairros() {
        return repository.findAll().stream().map(p-> BairroDTO.toDTO(p)).collect(Collectors.toList());
    }

    @GetMapping("/{id}")
    public BairroDTO getBairrosId(@PathVariable(value = "id") Long bairroId) throws EntityNotFoundException {
        Bairro bairroFind = repository.findById(bairroId)
                .orElseThrow(() -> new EntityNotFoundException("Bairro não encontrado com ID: " + bairroId));

        return BairroDTO.toDTO(bairroFind);
    }

    @PostMapping
    public BairroDTO create(@Valid @RequestBody Bairro bairro){
        return BairroDTO.toDTO(repository.save(bairro));
    }

    @PostMapping("/list")
    public List<BairroDTO> createList(@Valid @RequestBody List<Bairro> bairros){
        bairros.stream().forEach(p-> {
            repository.save(p);
        });

        return repository.findAll().stream().map(p-> BairroDTO.toDTO(p)).collect(Collectors.toList());
    }

    @PutMapping("/{id}")
    public BairroDTO update(@PathVariable(value = "id") Long bairroId,
                       @Valid @RequestBody Bairro bairro) throws EntityNotFoundException {
        Bairro bairroFind = repository.findById(bairroId)
                .orElseThrow(() -> new EntityNotFoundException("Bairro não encontrado com ID: " + bairroId));
        bairroFind.setId(bairroId);
        bairroFind.setNome(bairro.getNome());
        bairroFind.setPopulacao(bairro.getPopulacao());

        return BairroDTO.toDTO(repository.save(bairroFind));
    }
}
