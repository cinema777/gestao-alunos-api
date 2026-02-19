package com.escola.api.model;

import com.escola.api.model.Aluno;
import com.escola.api.repository.AlunoRepository;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.when;

@SpringBootTest
public class AlunoServiceTest {

    @Mock
    private AlunoRepository repository;

    @Test
    public void testCriarAluno() {
        Aluno aluno = new Aluno();
        aluno.setNome("Rodolfo Felis");
        aluno.setEmail("rodolfo@teste.com");

        when(repository.save(aluno)).thenReturn(aluno);

        assertEquals("Rodolfo Felis", aluno.getNome());
        assertEquals("rodolfo@teste.com", aluno.getEmail());
    }
}