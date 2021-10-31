package com.betha.cotacoescloud.cotacoescloud.resource;

import com.betha.cotacoescloud.cotacoescloud.model.Material;
import com.betha.cotacoescloud.cotacoescloud.repository.MaterialRepository;
import com.querydsl.core.types.Predicate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.querydsl.binding.QuerydslPredicate;
import org.springframework.web.bind.annotation.*;

import javax.persistence.EntityNotFoundException;
import javax.validation.Valid;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/api/material")
public class MaterialController extends AbstractResource {

    @Autowired
    private MaterialRepository repository;

    @GetMapping
    public List<MaterialDTO> getMaterials(@QuerydslPredicate(root = Material.class) Predicate predicate) {
        List<MaterialDTO> result = new ArrayList<>();
        Iterable<Material> all = repository.findAll(predicate);
        all.forEach(f -> result.add(MaterialDTO.toDTO(f)));
        return result;
    }

    @GetMapping("/{id}")
    public MaterialDTO getMaterialsId(@PathVariable(value = "id") Long materialId) throws EntityNotFoundException {
        Material materialFind = repository.findById(materialId)
                .orElseThrow(() -> new EntityNotFoundException("Material não encontrado com ID: " + materialId));

        return MaterialDTO.toDTO(materialFind);
    }

    @PostMapping
    public MaterialDTO create(@Valid @RequestBody Material material){
        return MaterialDTO.toDTO(repository.save(material));
    }

    @PostMapping("/list")
    public List<MaterialDTO> createList(@Valid @RequestBody List<Material> materiais){
        materiais.stream().forEach(m-> {
            repository.save(m);
        });

        return repository.findAll().stream().map(m-> MaterialDTO.toDTO(m)).collect(Collectors.toList());
    }

    @PutMapping("/{id}")
    public MaterialDTO update(@PathVariable(value = "id") Long materialId,
                               @Valid @RequestBody Material material) throws EntityNotFoundException {
        Material materialFind = repository.findById(materialId)
                .orElseThrow(() -> new EntityNotFoundException("Material não encontrado com ID: " + materialId));
        materialFind.setId(materialId);
        materialFind.setCodigo(material.getCodigo());
        materialFind.setDescricao(material.getDescricao());
        materialFind.setUnidadeMedida(material.getUnidadeMedida());
        materialFind.setTipo(material.getTipo());

        return MaterialDTO.toDTO(repository.save(materialFind));
    }
}
