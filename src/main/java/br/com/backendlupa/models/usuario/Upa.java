package br.com.backendlupa.models.usuario;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


    @Data
    @Entity
    @NoArgsConstructor
    @AllArgsConstructor
    public class Upa {
        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        private Long id;
        private String nome;
        private String especialidade;
        private String bairro;
        private String cidade;
        private String estado;
        private String cep;
    }

