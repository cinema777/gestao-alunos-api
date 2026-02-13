import { Component, signal } from '@angular/core';
import { RouterOutlet } from '@angular/router';
import { AlunoListaComponent } from './components/aluno-lista/aluno-lista.component';

@Component({
  selector: 'app-root',
  standalone: true,
  imports: [AlunoListaComponent],
  templateUrl: './app.component.html',
  styleUrl: './app.component.css'
})
export class AppComponent { }
