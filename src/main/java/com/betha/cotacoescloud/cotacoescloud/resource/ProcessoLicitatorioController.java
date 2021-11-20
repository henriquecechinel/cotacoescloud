package com.betha.cotacoescloud.cotacoescloud.resource;

import com.betha.cotacoescloud.cotacoescloud.model.ProcessoLicitatorio;
import com.betha.cotacoescloud.cotacoescloud.repository.ProcessoLicitatorioRepository;
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
@RequestMapping("/api/processolicitatorio")
public class ProcessoLicitatorioController extends AbstractResource {

    @Autowired
    private ProcessoLicitatorioRepository repository;

    @GetMapping
    public List<ProcessoLicitatorioDTO> getProcessoLicitatorios(@QuerydslPredicate(root = ProcessoLicitatorio.class) Predicate predicate) {
        List<ProcessoLicitatorioDTO> result = new ArrayList<>();
        Iterable<ProcessoLicitatorio> all = repository.findAll(predicate);
        all.forEach(f -> result.add(ProcessoLicitatorioDTO.toDTO(f)));
        return result;
    }

    @GetMapping("/{id}")
    public ProcessoLicitatorioDTO getProcessoLicitatoriosId(@PathVariable(value = "id") Long processoLicitatorioId) throws EntityNotFoundException {
        ProcessoLicitatorio processoLicitatorioFind = repository.findById(processoLicitatorioId)
                .orElseThrow(() -> new EntityNotFoundException("ProcessoLicitatorio não encontrado com ID: " + processoLicitatorioId));

        return ProcessoLicitatorioDTO.toDTO(processoLicitatorioFind);
    }

    @PostMapping
    public ProcessoLicitatorioDTO create(@Valid @RequestBody ProcessoLicitatorio processoLicitatorio){
        return ProcessoLicitatorioDTO.toDTO(repository.save(processoLicitatorio));
    }

    @PostMapping("/list")
    public List<ProcessoLicitatorioDTO> createList(@Valid @RequestBody List<ProcessoLicitatorio> processolicitatorio){
        processolicitatorio.stream().forEach(m-> {
            repository.save(m);
        });

        return repository.findAll().stream().map(m-> ProcessoLicitatorioDTO.toDTO(m)).collect(Collectors.toList());
    }

    @PutMapping("/{id}")
    public ProcessoLicitatorioDTO update(@PathVariable(value = "id") Long processoLicitatorioId,
                       @Valid @RequestBody ProcessoLicitatorio processoLicitatorio) throws EntityNotFoundException {
        ProcessoLicitatorio processoLicitatorioFind = repository.findById(processoLicitatorioId)
                .orElseThrow(() -> new EntityNotFoundException("ProcessoLicitatorio não encontrado com ID: " + processoLicitatorioId));
        processoLicitatorioFind.setId(processoLicitatorioId);
        processoLicitatorioFind.setNumeroProcesso(processoLicitatorio.getNumeroProcesso());
        processoLicitatorioFind.setNumeroLicitacao(processoLicitatorio.getNumeroLicitacao());
        processoLicitatorioFind.setDataProcesso(processoLicitatorio.getDataProcesso());
        processoLicitatorioFind.setDataLicitacao(processoLicitatorio.getDataLicitacao());
        processoLicitatorioFind.setObjeto(processoLicitatorio.getObjeto());
        processoLicitatorioFind.setTipoObjeto(processoLicitatorio.getTipoObjeto());
        processoLicitatorioFind.setModalidade(processoLicitatorio.getModalidade());
        processoLicitatorioFind.setLei(processoLicitatorio.getLei());
        processoLicitatorioFind.setCriterioJulgamento(processoLicitatorio.getCriterioJulgamento());
        processoLicitatorioFind.setAgenteContratacao(processoLicitatorio.getAgenteContratacao());
        processoLicitatorioFind.setResponsavelLicitacao(processoLicitatorio.getResponsavelLicitacao());
        processoLicitatorioFind.setItensLicitacao(processoLicitatorio.getItensLicitacao());
        processoLicitatorioFind.setSessaoJulgamento(processoLicitatorio.getSessaoJulgamento());

        return ProcessoLicitatorioDTO.toDTO(repository.save(processoLicitatorioFind));
    }
}
