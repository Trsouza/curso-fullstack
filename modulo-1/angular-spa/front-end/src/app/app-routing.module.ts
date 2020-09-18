import { NgModule } from '@angular/core';
import { Routes, RouterModule } from '@angular/router';
import { EditarClienteComponent } from './_cliente/editar-cliente/editar-cliente.component';
import { ListarClienteComponent } from './_cliente/listar-cliente/listar-cliente.component';
import { CadastroClienteComponent } from './_cliente/cadastro-cliente/cadastro-cliente.component';

const routes: Routes = [
{
  path: '',
    component: ListarClienteComponent
},
  {
    path: "criar",
    component: CadastroClienteComponent
  },
  {
    path: "editar/:id",
    component: EditarClienteComponent
  },
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
