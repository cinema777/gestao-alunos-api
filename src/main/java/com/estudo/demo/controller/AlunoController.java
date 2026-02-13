package com.estudo.demo.controller;

import com.estudo.demo.model.Aluno;
import com.estudo.demo.repository.AlunoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/alunos")
public class AlunoController {

    @Autowired
    private AlunoRepository repository;

    @GetMapping
    public List<Aluno> listarTodos() {
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