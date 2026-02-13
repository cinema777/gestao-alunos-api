import { HttpClient, HttpParams } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Observable } from 'rxjs';
import { Aluno } from '../models/aluno';


@Injectable({ providedIn: 'root' })
export class AlunoService {
  private apiUrl = 'http://localhost:8080/api/alunos';

  constructor(private http: HttpClient) { }

  listar(nome?: string): Observable<Aluno[]> {
    let params = new HttpParams();
    if (nome && nome.trim() !== '') {
      params = params.set('nome', nome);
    }
    return this.http.get<Aluno[]>(this.apiUrl, { params });
  }

  salvar(aluno: Aluno): Observable<Aluno> {
    return this.http.post<Aluno>(this.apiUrl, aluno);
  }
}