package br.com.backendlupa.models.usuario;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Entity
@NoArgsConstructor
@AllArgsConstructor
public class Usuario {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String email;
    private String senha;
    private String primeiroNome;
    private String nomeDoMeio;
    private String sobrenome;
    private String sexo;
    @Embedded
    private Endereco endereco;
}