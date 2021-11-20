package com.betha.cotacoescloud.cotacoescloud.resource;

import com.betha.cotacoescloud.cotacoescloud.model.Participante;
import com.betha.cotacoescloud.cotacoescloud.repository.ParticipanteRepository;
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
@RequestMapping("/api/participantes")
public class ParticipanteController extends AbstractResource {

    @Autowired
    private ParticipanteRepository repository;

    @GetMapping
    public List<ParticipanteDTO> getParticipantes(@QuerydslPredicate(root = Participante.class) Predicate predicate) {
        List<ParticipanteDTO> result = new ArrayList<>();
        Iterable<Participante> all = repository.findAll(predicate);
        all.forEach(f -> result.add(ParticipanteDTO.toDTO(f)));
        return result;
    }

    @GetMapping("/{id}")
    public ParticipanteDTO getParticipantesId(@PathVariable(value = "id") Long participanteId) throws EntityNotFoundException {
        Participante participanteFind = repository.findById(participanteId)
                .orElseThrow(() -> new EntityNotFoundException("Participante não encontrado com ID: " + participanteId));

        return ParticipanteDTO.toDTO(participanteFind);
    }

    @PostMapping
    public ParticipanteDTO create(@Valid @RequestBody Participante participante){
        return ParticipanteDTO.toDTO(repository.save(participante));
    }

    @PostMapping("/list")
    public List<ParticipanteDTO> createList(@Valid @RequestBody List<Participante> participantes){
        participantes.stream().forEach(m-> {
            repository.save(m);
        });

        return repository.findAll().stream().map(m-> ParticipanteDTO.toDTO(m)).collect(Collectors.toList());
    }

    @PutMapping("/{id}")
    public ParticipanteDTO update(@PathVariable(value = "id") Long participanteId,
                       @Valid @RequestBody Participante participante) throws EntityNotFoundException {
        Participante participanteFind = repository.findById(participanteId)
                .orElseThrow(() -> new EntityNotFoundException("Participante não encontrado com ID: " + participanteId));
        participanteFind.setId(participanteId);
        participanteFind.setFornecedor(participante.getFornecedor());
        participanteFind.setDataCredenciamento(participante.getDataCredenciamento());
        participanteFind.setMpe(participante.getMpe());
        participanteFind.setNomeRepresentante(participante.getNomeRepresentante());
        participanteFind.setCpfRepresentante(participante.getCpfRepresentante());
        participanteFind.setSedeMPE(participante.getSedeMPE());
        participanteFind.setSituacaoDocumentacao(participante.getSituacaoDocumentacao());

        return ParticipanteDTO.toDTO(repository.save(participanteFind));
    }
}
