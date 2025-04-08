package br.com.backendlupa.controllers;

import br.com.backendlupa.models.usuario.Usuario;
import br.com.backendlupa.repositories.UsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api")
public class UpaController {

    @Autowired
    private UsuarioRepository usuarioRepository;

    @GetMapping("/")
    public ResponseEntity<String> home() {
        return ResponseEntity.ok("API Backend Lupa está funcionando");
    }

    @GetMapping("/login")
    public ResponseEntity<String> login() {
        return ResponseEntity.ok("Endpoint de login - use POST para autenticar");
    }

    @GetMapping("/cadastro")
    public ResponseEntity<Usuario> cadastro() {
        return ResponseEntity.ok(new Usuario());
    }

    @PostMapping("/cadastro")
    public ResponseEntity<Usuario> cadastrarUsuario(@RequestBody Usuario usuario) {
        Usuario usuarioSalvo = usuarioRepository.save(usuario);
        return ResponseEntity.status(HttpStatus.CREATED).body(usuarioSalvo);
    }
}