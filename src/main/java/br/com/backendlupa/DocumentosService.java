package br.com.backendlupa.services;

import br.com.backendlupa.models.usuario.Documentos;
import br.com.backendlupa.repositories.DocumentosRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DocumentosService {
    private final DocumentosRepository documentosRepository;

    public DocumentosService(DocumentosRepository documentosRepository) {
        this.documentosRepository = documentosRepository;
    }

    public List<Documentos> listarTodos() {
        return documentosRepository.findAll();
    }

    public Documentos cadastrar(Documentos documento) {
        return documentosRepository.save(documento);
    }

    public Documentos buscarPorId(Long id) {
        return documentosRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Documento não encontrado"));
    }

    public void deletar(Long id) {
        documentosRepository.deleteById(id);
    }
}