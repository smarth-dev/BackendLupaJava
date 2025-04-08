package br.com.backendlupa.repositories;

import br.com.backendlupa.models.usuario.Upa;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UpasRepository extends JpaRepository<Upa, Long> {
}
