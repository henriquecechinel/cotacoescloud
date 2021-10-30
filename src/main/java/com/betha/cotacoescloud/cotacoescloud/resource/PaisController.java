package com.betha.cotacoescloud.cotacoescloud.resource;

import com.betha.cotacoescloud.cotacoescloud.model.Pais;
import com.betha.cotacoescloud.cotacoescloud.repository.PaisRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.persistence.EntityNotFoundException;
import javax.validation.Valid;
import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/api/paises")
public class PaisController extends AbstractResource {

    @Autowired
    private PaisRepository repository;

    @GetMapping
    public List<PaisDTO> getPaises() {
        return repository.findAll().stream().map(p-> PaisDTO.toDTO(p)).collect(Collectors.toList());
    }

    @GetMapping("/{id}")
    public PaisDTO getPaisesId(@PathVariable(value = "id") Long paisId) throws EntityNotFoundException {
        Pais paisFind = repository.findById(paisId)
                .orElseThrow(() -> new EntityNotFoundException("Pais não encontrado com ID: " + paisId));

        return PaisDTO.toDTO(paisFind);
    }

    @PostMapping
    public PaisDTO create(@Valid @RequestBody Pais pais){
        return PaisDTO.toDTO(repository.save(pais));
    }

    @PostMapping("/list")
    public List<PaisDTO> createList(@Valid @RequestBody List<Pais> paises){
        paises.stream().forEach(p-> {
            repository.save(p);
        });

        return repository.findAll().stream().map(p-> PaisDTO.toDTO(p)).collect(Collectors.toList());
    }

    @PutMapping("/{id}")
    public PaisDTO update(@PathVariable(value = "id") Long paisId,
                       @Valid @RequestBody Pais pais) throws EntityNotFoundException {
        Pais paisFind = repository.findById(paisId)
                .orElseThrow(() -> new EntityNotFoundException("Pais não encontrado com ID: " + paisId));
        paisFind.setId(paisId);
        paisFind.setNome(pais.getNome());
        paisFind.setPopulacao(pais.getPopulacao());

        return PaisDTO.toDTO(repository.save(paisFind));
    }
}
