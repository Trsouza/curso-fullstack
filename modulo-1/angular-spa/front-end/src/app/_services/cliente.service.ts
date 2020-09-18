import { Cliente } from './../_models/cliente';
import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Observable } from 'rxjs';

const apiUrl = "http://localhost:8080/clientes/"

@Injectable({
  providedIn: 'root'
})
export class ClienteService {

  constructor(private http: HttpClient) { }

  listar(): Observable<Cliente[]> {
    return this.http.get<Cliente[]>(apiUrl);
  }

  visualizar(id: number): Observable<Cliente> {
    return this.http.get<Cliente>(apiUrl + id);
  }

  editar(cliente: Cliente): Observable<Cliente> {
    return this.http.put<Cliente>(apiUrl+ cliente.id, cliente);
  }

  salvar(cliente: Cliente): Observable<Cliente> {
    return this.http.post<any>(apiUrl, cliente);
  }

  excluir(id: number): Observable<void> {
    return this.http.delete<void>(apiUrl + id);
  }

}
