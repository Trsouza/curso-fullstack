import { Component, OnInit } from '@angular/core';
import { ActivatedRoute, Router } from '@angular/router';
import { FormBuilder, FormGroup, Validators } from '@angular/forms';
import { Cliente } from './../../_models/cliente';
import { ClienteService } from './../../_services/cliente.service';

@Component({
  selector: 'app-cadastro-cliente',
  templateUrl: './cadastro-cliente.component.html',
  styleUrls: ['./cadastro-cliente.component.css']
})
export class CadastroClienteComponent implements OnInit {

  id: number;
  formCadastro: FormGroup;

  constructor(private clienteService: ClienteService,
    private fb: FormBuilder,
    private router: Router,
    private activatedRoute: ActivatedRoute) { }

  ngOnInit(): void {
    this.id = this.activatedRoute.snapshot.params['id'];
    console.log("\n id -- " + this.id);
    if (this.id) {
      this.clienteService.visualizar(this.id).subscribe((cliente: Cliente) => this.criarFormulario(cliente));
    } else {
      this.criarFormulario(this.criarClienteEmBranco());
    }
  }

  private criarFormulario(cliente: Cliente): void {
    this.formCadastro = this.fb.group({
      nome: [cliente.nome],
      sobrenome: [cliente.sobrenome],
      dataNasci: [cliente.dataNasci],
      endereco: [cliente.endereco],
      email: [cliente.email],
      telefone: [cliente.telefone],
      rg: [cliente.rg],
      cpf: [cliente.cpf],
    });
  }


  private criarClienteEmBranco(): Cliente {
    return {
      id: null,
      nome: null,
      sobrenome: null,
      dataNasci: null, //Date;
      endereco: null,
      email: null,
      telefone: null,
      rg: null,
      cpf: null,
    } as Cliente;
  }

  adicionar(): void {
    const cliente = this.formCadastro.getRawValue() as Cliente;  // retorna os campos que existem dentro do formGroup cadastro
    console.log("salvar *** " + cliente.nome)
    this.salvar(cliente);
    this.router.navigate(["/"])
  }

  private salvar(cliente: Cliente): void {
    this.clienteService.salvar(cliente).subscribe();
  }
}
