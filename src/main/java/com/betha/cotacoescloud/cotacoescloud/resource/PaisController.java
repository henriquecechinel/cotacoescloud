package com.betha.cotacoescloud.cotacoescloud.resource;

import com.betha.cotacoescloud.cotacoescloud.model.Pais;
import com.betha.cotacoescloud.cotacoescloud.repository.PaisRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.persistence.EntityNotFoundException;
import java.util.List;

@RestController
@RequestMapping("/api/paises")
public class PaisController {

    @Autowired
    private PaisRepository repository;

    @GetMapping
    public List<Pais> getPaises() {
        return repository.findAll();
    }

    @GetMapping("/{id}")
    public Pais getPaisesId(@PathVariable(value = "id") Long paisId) throws EntityNotFoundException {
        Pais paisFind = repository.findById(paisId)
                .orElseThrow(() -> new EntityNotFoundException("Pais não encontrado com ID: " + paisId));

        return paisFind;
    }

    @PostMapping
    public Pais create(@RequestBody Pais pais){
        return repository.save(pais);
    }

}
