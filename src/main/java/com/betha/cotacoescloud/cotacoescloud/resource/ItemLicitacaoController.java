package com.betha.cotacoescloud.cotacoescloud.resource;

import com.betha.cotacoescloud.cotacoescloud.model.ItemLicitacao;
import com.betha.cotacoescloud.cotacoescloud.repository.ItemLicitacaoRepository;
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
@RequestMapping("/api/itemlicitacao")
public class ItemLicitacaoController extends AbstractResource {

    @Autowired
    private ItemLicitacaoRepository repository;

    @GetMapping
    public List<ItemLicitacaoDTO> getItemLicitacaos(@QuerydslPredicate(root = ItemLicitacao.class) Predicate predicate) {
        List<ItemLicitacaoDTO> result = new ArrayList<>();
        Iterable<ItemLicitacao> all = repository.findAll(predicate);
        all.forEach(f -> result.add(ItemLicitacaoDTO.toDTO(f)));
        return result;
    }

    @GetMapping("/{id}")
    public ItemLicitacaoDTO getItemLicitacaosId(@PathVariable(value = "id") Long itemLicitacaoId) throws EntityNotFoundException {
        ItemLicitacao itemLicitacaoFind = repository.findById(itemLicitacaoId)
                .orElseThrow(() -> new EntityNotFoundException("Item da Licitacao não encontrado com ID: " + itemLicitacaoId));

        return ItemLicitacaoDTO.toDTO(itemLicitacaoFind);
    }

    @PostMapping
    public ItemLicitacaoDTO create(@Valid @RequestBody ItemLicitacao itemLicitacao){
        return ItemLicitacaoDTO.toDTO(repository.save(itemLicitacao));
    }

    @PostMapping("/list")
    public List<ItemLicitacaoDTO> createList(@Valid @RequestBody List<ItemLicitacao> materiais){
        materiais.stream().forEach(m-> {
            repository.save(m);
        });

        return repository.findAll().stream().map(m-> ItemLicitacaoDTO.toDTO(m)).collect(Collectors.toList());
    }

    @PutMapping("/{id}")
    public ItemLicitacaoDTO update(@PathVariable(value = "id") Long itemLicitacaoId,
                              @Valid @RequestBody ItemLicitacao itemLicitacao) throws EntityNotFoundException {
        ItemLicitacao itemLicitacaoFind = repository.findById(itemLicitacaoId)
                .orElseThrow(() -> new EntityNotFoundException("Item da Licitacao não encontrado com ID: " + itemLicitacaoId));
        itemLicitacaoFind.setId(itemLicitacaoId);
        itemLicitacaoFind.setNumeroItem(itemLicitacao.getNumeroItem());
        itemLicitacaoFind.setQuantidade(itemLicitacao.getQuantidade());
        itemLicitacaoFind.setValorUnitario(itemLicitacao.getValorUnitario());
        itemLicitacaoFind.setValorTotal(itemLicitacao.getValorTotal());

        return ItemLicitacaoDTO.toDTO(repository.save(itemLicitacaoFind));
    }
}
