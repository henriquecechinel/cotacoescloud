package com.betha.cotacoescloud.cotacoescloud.resource;

import com.betha.cotacoescloud.cotacoescloud.model.SessaoJulgamento;
import com.betha.cotacoescloud.cotacoescloud.repository.SessaoJulgamentoRepository;
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
@RequestMapping("/api/sessaojulgamento")
public class SessaoJulgamentoController extends AbstractResource {

    @Autowired
    private SessaoJulgamentoRepository repository;

    @GetMapping
    public List<SessaoJulgamentoDTO> getSessaoJulgamentos(@QuerydslPredicate(root = SessaoJulgamento.class) Predicate predicate) {
        List<SessaoJulgamentoDTO> result = new ArrayList<>();
        Iterable<SessaoJulgamento> all = repository.findAll(predicate);
        all.forEach(f -> result.add(SessaoJulgamentoDTO.toDTO(f)));
        return result;
    }

    @GetMapping("/{id}")
    public SessaoJulgamentoDTO getSessaoJulgamentosId(@PathVariable(value = "id") Long sessaoJulgamentoId) throws EntityNotFoundException {
        SessaoJulgamento sessaoJulgamentoFind = repository.findById(sessaoJulgamentoId)
                .orElseThrow(() -> new EntityNotFoundException("SessaoJulgamento não encontrado com ID: " + sessaoJulgamentoId));

        return SessaoJulgamentoDTO.toDTO(sessaoJulgamentoFind);
    }

    @PostMapping
    public SessaoJulgamentoDTO create(@Valid @RequestBody SessaoJulgamento sessaoJulgamento){
        return SessaoJulgamentoDTO.toDTO(repository.save(sessaoJulgamento));
    }

    @PostMapping("/list")
    public List<SessaoJulgamentoDTO> createList(@Valid @RequestBody List<SessaoJulgamento> sessaojulgamento){
        sessaojulgamento.stream().forEach(m-> {
            repository.save(m);
        });

        return repository.findAll().stream().map(m-> SessaoJulgamentoDTO.toDTO(m)).collect(Collectors.toList());
    }

    @PutMapping("/{id}")
    public SessaoJulgamentoDTO update(@PathVariable(value = "id") Long sessaoJulgamentoId,
                       @Valid @RequestBody SessaoJulgamento sessaoJulgamento) throws EntityNotFoundException {
        SessaoJulgamento sessaoJulgamentoFind = repository.findById(sessaoJulgamentoId)
                .orElseThrow(() -> new EntityNotFoundException("SessaoJulgamento não encontrado com ID: " + sessaoJulgamentoId));
        sessaoJulgamentoFind.setId(sessaoJulgamentoId);
        sessaoJulgamentoFind.setTipoSessao(sessaoJulgamento.getTipoSessao());
        sessaoJulgamentoFind.setDataInicioCredenciamento(sessaoJulgamento.getDataInicioCredenciamento());
        sessaoJulgamentoFind.setDataFimCredenciamento(sessaoJulgamento.getDataFimCredenciamento());
        sessaoJulgamentoFind.setDataInicioAbertura(sessaoJulgamento.getDataInicioAbertura());
        sessaoJulgamentoFind.setDataFimAbertura(sessaoJulgamento.getDataFimAbertura());
        sessaoJulgamentoFind.setPropostas(sessaoJulgamento.getPropostas());

        return SessaoJulgamentoDTO.toDTO(repository.save(sessaoJulgamentoFind));
    }
}
