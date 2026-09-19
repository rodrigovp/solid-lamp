package br.com.fiap.biblioteca.controller;

import br.com.fiap.biblioteca.dominio.Livro;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;

@RestController
@RequestMapping("/livros")
public class LivroController {

    private static final ArrayList<Livro> livros = new ArrayList<>();

    @PostMapping
    public ResponseEntity<Livro> salvar(@RequestBody Livro livro) {
        livros.add(livro);
        return ResponseEntity.status(HttpStatus.CREATED).body(livro);
    }

    @GetMapping
    public ResponseEntity<ArrayList<Livro>> obterTodosLivros() {
        return ResponseEntity.ok(livros);
    }

}
