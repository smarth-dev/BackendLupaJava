package br.com.backendlupa.repositories;

import br.com.backendlupa.models.usuario.Avaliacao;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AvaliacaoRepository extends JpaRepository<Avaliacao, Long> {
}