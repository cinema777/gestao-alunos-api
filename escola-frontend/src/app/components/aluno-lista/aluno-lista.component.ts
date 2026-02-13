import { Component, OnInit, ChangeDetectorRef } from '@angular/core';
import { Aluno } from '../../models/aluno';
import { AlunoService } from '../../services/aluno.service';
import { CommonModule } from '@angular/common';
import { FormsModule } from '@angular/forms'; // Importante para o [(ngModel)]

@Component({
  selector: 'app-aluno-lista',
  standalone: true,
  imports: [CommonModule, FormsModule],
  templateUrl: './aluno-lista.component.html'
})
export class AlunoListaComponent implements OnInit {
  alunos: Aluno[] = [];
  novoAluno: Aluno = { nome: '', email: '' };
  filtroNome: string = '';

  constructor(private alunoService: AlunoService,
    private cd: ChangeDetectorRef
  ) {}

  ngOnInit(): void {
    this.carregarAlunos();
  }

  carregarAlunos(valor?: string): void {
    const termo = valor || '';
    
    this.alunoService.listar(termo).subscribe({
      next: (dados) => {
        this.alunos = [...dados]; // Criamos um novo array para forçar o Angular a notar a mudança
        this.cd.detectChanges();   // FORÇA a atualização da tela no primeiro clique
      },
      error: (err) => console.error('Erro na API:', err)
    });
  }

  salvar(): void {
    this.alunoService.salvar(this.novoAluno).subscribe(() => {
      this.carregarAlunos();
      this.novoAluno = { nome: '', email: '' };
    });
  }
}
