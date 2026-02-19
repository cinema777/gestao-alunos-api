package com.escola.api.controller;

import com.escola.api.model.Aluno;
import com.escola.api.repository.AlunoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@RequestMapping("/api/alunos")
@CrossOrigin(origins = "http://localhost:4200")
public class AlunoController {

    @Autowired
    private AlunoRepository repository;

    @GetMapping
    public List<Aluno> listar(@RequestParam(required = false) String nome) {
        System.out.println("Pesquisando por: " + nome);
        if (nome != null && !nome.isBlank()) {
            return repository.findByNomeContainingIgnoreCase(nome);
        }
        return repository.findAll();
    }

    @PostMapping
    public Aluno cadastrar(@RequestBody Aluno aluno) {
        return repository.save(aluno);
    }
    
    @GetMapping("/{id}")
    public Aluno buscarPorId(@PathVariable Long id) {
        return repository.findById(id).orElseThrow(() -> new RuntimeException("Aluno não encontrado"));
    }
}