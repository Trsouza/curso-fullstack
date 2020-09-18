import { Component, OnInit } from '@angular/core';
import { Cliente } from './../../_models/cliente';
import { ClienteService } from './../../_services/cliente.service';

@Component({
  selector: 'app-listar-cliente',
  templateUrl: './listar-cliente.component.html',
  styleUrls: ['./listar-cliente.component.css']
})
export class ListarClienteComponent implements OnInit {

  clientes: Cliente[] = [];
  _filterBy: string;
  filtraClientes: Cliente[] = [];
  page = 1;
  pageSize = 5;

  constructor(private clienteService: ClienteService) {  }

  ngOnInit(): void {
   this.listar();
  }

  listar(){
    this.clienteService.listar().subscribe({
      next: clientes => {
        this.clientes = clientes;
        this.filtraClientes = this.clientes;
        console.log(clientes)
      }
    })
  }

  set filter(value: string) {
    this._filterBy = value;
    this.filtraClientes = this.clientes.filter((cliente: Cliente) => cliente.nome.toLocaleLowerCase().indexOf(this._filterBy.toLocaleLowerCase())>-1);
  }

  get filter() {
    return this._filterBy;
  }

  excluir(clienteId: number): void {
    this.clienteService.excluir(clienteId).subscribe({
      next: () => {
        console.log('Deletado com Sucesso');
        this.listar();
      },
      error: err => console.log('Error ao excluir', err)
    })
  }


}
