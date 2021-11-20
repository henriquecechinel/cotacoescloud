package com.betha.cotacoescloud.cotacoescloud.resource;

import com.betha.cotacoescloud.cotacoescloud.model.Logradouro;
import com.betha.cotacoescloud.cotacoescloud.repository.LogradouroRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.persistence.EntityNotFoundException;
import javax.validation.Valid;
import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/api/logradouros")
public class LogradouroController extends AbstractResource {

    @Autowired
    private LogradouroRepository repository;

    @GetMapping
    public List<LogradouroDTO> getLogradouros() {
        return repository.findAll().stream().map(p-> LogradouroDTO.toDTO(p)).collect(Collectors.toList());
    }

    @GetMapping("/{id}")
    public LogradouroDTO getLogradourosId(@PathVariable(value = "id") Long logradouroId) throws EntityNotFoundException {
        Logradouro logradouroFind = repository.findById(logradouroId)
                .orElseThrow(() -> new EntityNotFoundException("Logradouro não encontrado com ID: " + logradouroId));

        return LogradouroDTO.toDTO(logradouroFind);
    }

    @PostMapping
    public LogradouroDTO create(@Valid @RequestBody Logradouro logradouro){
        return LogradouroDTO.toDTO(repository.save(logradouro));
    }

    @PostMapping("/list")
    public List<LogradouroDTO> createList(@Valid @RequestBody List<Logradouro> logradouros){
        logradouros.stream().forEach(p-> {
            repository.save(p);
        });

        return repository.findAll().stream().map(p-> LogradouroDTO.toDTO(p)).collect(Collectors.toList());
    }

    @PutMapping("/{id}")
    public LogradouroDTO update(@PathVariable(value = "id") Long logradouroId,
                       @Valid @RequestBody Logradouro logradouro) throws EntityNotFoundException {
        Logradouro logradouroFind = repository.findById(logradouroId)
                .orElseThrow(() -> new EntityNotFoundException("Logradouro não encontrado com ID: " + logradouroId));
        logradouroFind.setId(logradouroId);
        logradouroFind.setNome(logradouro.getNome());
        logradouroFind.setPopulacao(logradouro.getPopulacao());

        return LogradouroDTO.toDTO(repository.save(logradouroFind));
    }

    @DeleteMapping("/{id}")
    public ResponseEntity delete(@PathVariable(value = "id") Long logradouroId) throws EntityNotFoundException {
        Logradouro logradouroFind = repository.findById(logradouroId)
                .orElseThrow(() -> new EntityNotFoundException("Logradouro não encontrado com ID: " + logradouroId));

        repository.delete(logradouroFind);

        return ResponseEntity.noContent().build();
    }
}
