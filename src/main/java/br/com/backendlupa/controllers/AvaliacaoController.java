package br.com.backendlupa.controllers;

import br.com.backendlupa.models.usuario.Avaliacao;
import br.com.backendlupa.services.AvaliacaoService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/avaliacoes")
public class AvaliacaoController {
    private final AvaliacaoService avaliacaoService;

    public AvaliacaoController(AvaliacaoService avaliacaoService) {
        this.avaliacaoService = avaliacaoService;
    }

    @GetMapping
    public List<Avaliacao> listar() {
        return avaliacaoService.listarTodas();
    }

    @PostMapping
    public Avaliacao cadastrar(@RequestBody Avaliacao avaliacao) {
        return avaliacaoService.cadastrar(avaliacao);
    }

    @GetMapping("/{id}")
    public Avaliacao buscarPorId(@PathVariable Long id) {
        return avaliacaoService.buscarPorId(id);
    }

    @DeleteMapping("/{id}")
    public void deletar(@PathVariable Long id) {
        avaliacaoService.deletar(id);
    }
}