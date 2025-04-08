package br.com.backendlupa.repositories;

import br.com.backendlupa.models.usuario.Documentos;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DocumentosRepository extends JpaRepository<Documentos, Long> {

}