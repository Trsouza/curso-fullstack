import { Router, ActivatedRoute } from '@angular/router';
import { Component, OnInit } from '@angular/core';
import { ClienteService } from './../../_services/cliente.service';
import { Cliente } from './../../_models/cliente';

@Component({
  selector: 'app-editar-cliente',
  templateUrl: './editar-cliente.component.html',
  styleUrls: ['./editar-cliente.component.css']
})
export class EditarClienteComponent implements OnInit {

  cliente: Cliente;

  constructor(private clienteService: ClienteService, private router: Router, private route: ActivatedRoute) { }

  ngOnInit(): void {
    const id = + this.route.snapshot.paramMap.get('id')
    this.clienteService.visualizar(id).subscribe({
      next: cliente => this.cliente = cliente,
      error: err => console.log('\n\n Error ao listar ' + err)
    })
  }

    atualizaCliente(): void {
      this.clienteService.editar(this.cliente).subscribe(() => {
       // this.clienteService.showMessage('Cliente atualizado com sucesso')
       console.log("Cliente atualizado com sucesso")
      })
      this.router.navigate(["/"])
    }

}
