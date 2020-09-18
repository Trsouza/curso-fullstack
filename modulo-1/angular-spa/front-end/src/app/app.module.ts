import { NgModule } from '@angular/core';
import { HttpClientModule } from '@angular/common/http'
import { BrowserModule } from '@angular/platform-browser';
import { FormsModule, ReactiveFormsModule } from '@angular/forms';
import { BrowserAnimationsModule } from '@angular/platform-browser/animations';
import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';

import { NgbModule } from '@ng-bootstrap/ng-bootstrap';
import { MenuItem } from 'primeng/api';
import { TableModule } from 'primeng/table';
import { PanelModule } from 'primeng/panel';
import { ButtonModule } from 'primeng/button'
import { InputTextModule } from 'primeng/inputtext';
import { MenubarModule } from 'primeng/menubar';
// import { MessagesModule } from 'primeng/messages';
// import { MessageModule } from 'primeng/message';

import { MenuComponent } from './_shared/menu/menu.component';
import { PainelAgendaComponent } from './_shared/painel-agenda/painel-agenda.component';
import { CadastroClienteComponent } from './_cliente/cadastro-cliente/cadastro-cliente.component';
import { ListarClienteComponent } from './_cliente/listar-cliente/listar-cliente.component';
import { EditarClienteComponent } from './_cliente/editar-cliente/editar-cliente.component';
// import { MensagemComponent } from './mensagem/mensagem.component'
@NgModule({
  declarations: [
    AppComponent,
    PainelAgendaComponent,
    MenuComponent,
    CadastroClienteComponent,
    ListarClienteComponent,
    EditarClienteComponent,
    // MensagemComponent
  ],
  imports: [
    AppRoutingModule,
    BrowserModule,
    FormsModule,
    HttpClientModule,
    BrowserAnimationsModule,
    TableModule,
    PanelModule,
    InputTextModule,
    ButtonModule,
    MenubarModule,
    ReactiveFormsModule,
    NgbModule
    // MessageModule,
    // MessagesModule
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule {

}
