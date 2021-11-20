package com.betha.cotacoescloud.cotacoescloud.resource;

import com.betha.cotacoescloud.cotacoescloud.model.Proposta;
import com.betha.cotacoescloud.cotacoescloud.repository.PropostaRepository;
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
@RequestMapping("/api/propostas")
public class PropostaController extends AbstractResource {

    @Autowired
    private PropostaRepository repository;

    @GetMapping
    public List<PropostaDTO> getPropostas(@QuerydslPredicate(root = Proposta.class) Predicate predicate) {
        List<PropostaDTO> result = new ArrayList<>();
        Iterable<Proposta> all = repository.findAll(predicate);
        all.forEach(f -> result.add(PropostaDTO.toDTO(f)));
        return result;
    }

    @GetMapping("/{id}")
    public PropostaDTO getPropostasId(@PathVariable(value = "id") Long propostaId) throws EntityNotFoundException {
        Proposta propostaFind = repository.findById(propostaId)
                .orElseThrow(() -> new EntityNotFoundException("Proposta não encontrado com ID: " + propostaId));

        return PropostaDTO.toDTO(propostaFind);
    }

    @PostMapping
    public PropostaDTO create(@Valid @RequestBody Proposta proposta){
        return PropostaDTO.toDTO(repository.save(proposta));
    }

    @PostMapping("/list")
    public List<PropostaDTO> createList(@Valid @RequestBody List<Proposta> propostas){
        propostas.stream().forEach(m-> {
            repository.save(m);
        });

        return repository.findAll().stream().map(m-> PropostaDTO.toDTO(m)).collect(Collectors.toList());
    }

    @PutMapping("/{id}")
    public PropostaDTO update(@PathVariable(value = "id") Long propostaId,
                       @Valid @RequestBody Proposta proposta) throws EntityNotFoundException {
        Proposta propostaFind = repository.findById(propostaId)
                .orElseThrow(() -> new EntityNotFoundException("Proposta não encontrado com ID: " + propostaId));
        propostaFind.setId(propostaId);
        propostaFind.setItemLicitacao(proposta.getItemLicitacao());
        propostaFind.setMarca(proposta.getMarca());
        propostaFind.setQuantidade(proposta.getQuantidade());
        propostaFind.setValorUnitario(proposta.getValorUnitario());
        propostaFind.setValorTotal(proposta.getValorTotal());
        propostaFind.setSituacao(proposta.getSituacao());
        propostaFind.setOrdemClassificacao(proposta.getOrdemClassificacao());
        propostaFind.setDataValidadeProposta(proposta.getDataValidadeProposta());
        propostaFind.setPrazoPreenchimento(proposta.getPrazoPreenchimento());

        return PropostaDTO.toDTO(repository.save(propostaFind));
    }
}
