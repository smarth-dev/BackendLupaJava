package br.com.backendlupa;

import br.com.backendlupa.models.usuario.Upa;
import br.com.backendlupa.repositories.UpasRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UpaService {

    private final UpasRepository upasRepository;

    public UpaService(UpasRepository upasRepository) {
        this.upasRepository = upasRepository;
    }

    public List<Upa> listarTodas() {
        return upasRepository.findAll();
    }

    public Upa cadastrar(Upa upa) {
        return upasRepository.save(upa);
    }

    public Upa buscarPorId(Long id) {
        return upasRepository.findById(id).orElseThrow(() -> new RuntimeException("UPA não encontrada"));
    }
}