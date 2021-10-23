package com.betha.cotacoescloud.cotacoescloud.resource;

import com.betha.cotacoescloud.cotacoescloud.model.Municipio;
import com.betha.cotacoescloud.cotacoescloud.repository.MunicipioRepository;
import com.querydsl.core.types.Predicate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.querydsl.binding.QuerydslPredicate;
import org.springframework.http.HttpStatus;
import org.springframework.validation.FieldError;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.*;

import javax.persistence.EntityNotFoundException;
import javax.validation.Valid;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/api/municipios")
public class MunicipioController {

    @Autowired
    private MunicipioRepository repository;

    @GetMapping
    public List<MunicipioDTO> getMunicipios(@QuerydslPredicate(root = Municipio.class) Predicate predicate) {
        List<MunicipioDTO> result = new ArrayList<>();
        Iterable<Municipio> all = repository.findAll(predicate);
        all.forEach(f -> result.add(MunicipioDTO.toDTO(f)));
        return result;
    }

    @GetMapping("/{id}")
    public MunicipioDTO getMunicipiosId(@PathVariable(value = "id") Long municipioId) throws EntityNotFoundException {
        Municipio municipioFind = repository.findById(municipioId)
                .orElseThrow(() -> new EntityNotFoundException("Municipio não encontrado com ID: " + municipioId));

        return MunicipioDTO.toDTO(municipioFind);
    }

    @PostMapping
    public MunicipioDTO create(@Valid @RequestBody Municipio municipio){
        return MunicipioDTO.toDTO(repository.save(municipio));
    }

    @PostMapping("/list")
    public List<MunicipioDTO> createList(@Valid @RequestBody List<Municipio> municipios){
        municipios.stream().forEach(m-> {
            repository.save(m);
        });

        return repository.findAll().stream().map(m-> MunicipioDTO.toDTO(m)).collect(Collectors.toList());
    }

    @PutMapping("/{id}")
    public MunicipioDTO update(@PathVariable(value = "id") Long municipioId,
                       @Valid @RequestBody Municipio municipio) throws EntityNotFoundException {
        Municipio municipioFind = repository.findById(municipioId)
                .orElseThrow(() -> new EntityNotFoundException("Municipio não encontrado com ID: " + municipioId));
        municipioFind.setId(municipioId);
        municipioFind.setNome(municipio.getNome());
        municipioFind.setPopulacao(municipio.getPopulacao());

        return MunicipioDTO.toDTO(repository.save(municipioFind));
    }

    @ResponseStatus(HttpStatus.BAD_REQUEST)
    @ExceptionHandler(MethodArgumentNotValidException.class)
    public Map<String, String> handleValidationExceptions(
            MethodArgumentNotValidException ex) {
        Map<String, String> errors = new HashMap<>();
        ex.getBindingResult().getAllErrors().forEach((error) -> {
            String fieldName = ((FieldError) error).getField();
            String errorMessage = error.getDefaultMessage();
            errors.put(fieldName, errorMessage);
        });
        return errors;
    }

}
