package br.com.backendlupa.controllers;

import br.com.backendlupa.models.usuario.Documentos;
import br.com.backendlupa.services.DocumentosService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/documentos")
public class DocumentosController {
    private final DocumentosService documentosService;

    public DocumentosController(DocumentosService documentosService) {
        this.documentosService = documentosService;
    }

    @GetMapping
    public List<Documentos> listar() {
        return documentosService.listarTodos();
    }

    @PostMapping
    public Documentos cadastrar(@RequestBody Documentos documento) {
        return documentosService.cadastrar(documento);
    }

    @GetMapping("/{id}")
    public Documentos buscarPorId(@PathVariable Long id) {
        return documentosService.buscarPorId(id);
    }

    @DeleteMapping("/{id}")
    public void deletar(@PathVariable Long id) {
        documentosService.deletar(id);
    }
}