package com.betha.cotacoescloud.cotacoescloud.resource;

import com.betha.cotacoescloud.cotacoescloud.model.Estado;
import com.betha.cotacoescloud.cotacoescloud.model.Pais;
import com.betha.cotacoescloud.cotacoescloud.repository.EstadoRepository;
import com.betha.cotacoescloud.cotacoescloud.repository.PaisRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.persistence.EntityNotFoundException;
import javax.validation.Valid;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/api/estados")
public class EstadoController extends AbstractResource {

    @Autowired
    private EstadoRepository repository;

    @Autowired
    private PaisRepository paisRepository;

    @GetMapping
    public List<EstadoDTO> getEstados() {
        return repository.findAll().stream().map(p-> EstadoDTO.toDTO(p)).collect(Collectors.toList());
    }

    @GetMapping("/{id}")
    public EstadoDTO getEstadosId(@PathVariable(value = "id") Long estadoId) throws EntityNotFoundException {
        Estado estadoFind = repository.findById(estadoId)
                .orElseThrow(() -> new EntityNotFoundException("Estado não encontrado com ID: " + estadoId));

        return EstadoDTO.toDTO(estadoFind);
    }

    @PostMapping
    public EstadoDTO create(@Valid @RequestBody Estado estado){

        Optional<Pais> byId = paisRepository.findById(estado.getPais().getId());

        if (!byId.isPresent()){
            throw new EntityNotFoundException("Pais não encontrado com ID: " + estado.getPais().getId());
        }

        return EstadoDTO.toDTO(repository.save(estado));
    }

    @PostMapping("/list")
    public List<EstadoDTO> createList(@Valid @RequestBody List<Estado> estados){
        estados.stream().forEach(p-> {
            repository.save(p);
        });

        return repository.findAll().stream().map(p-> EstadoDTO.toDTO(p)).collect(Collectors.toList());
    }

    @PutMapping("/{id}")
    public EstadoDTO update(@PathVariable(value = "id") Long estadoId,
                       @Valid @RequestBody Estado estado) throws EntityNotFoundException {
        Estado estadoFind = repository.findById(estadoId)
                .orElseThrow(() -> new EntityNotFoundException("Estado não encontrado com ID: " + estadoId));
        estadoFind.setId(estadoId);
        estadoFind.setNome(estado.getNome());
        estadoFind.setPopulacao(estado.getPopulacao());

        return EstadoDTO.toDTO(repository.save(estadoFind));
    }
}
