import { AppRoutingModule } from './app-routing.module';
import { MenuItem } from 'primeng/api';
import { NgModule } from '@angular/core';
import { FormsModule, ReactiveFormsModule } from '@angular/forms';
import { HttpClientModule } from '@angular/common/http'
import { BrowserModule } from '@angular/platform-browser';
import { BrowserAnimationsModule } from '@angular/platform-browser/animations';

import { NgbModule } from '@ng-bootstrap/ng-bootstrap';
import { TableModule } from 'primeng/table';
import { PanelModule } from 'primeng/panel';
import { ButtonModule } from 'primeng/button'
import { InputTextModule } from 'primeng/inputtext';
import { MenubarModule } from 'primeng/menubar';
// import { MessagesModule } from 'primeng/messages';
// import { MessageModule } from 'primeng/message';

import { AppComponent } from './app.component';
import { PainelAgendaComponent } from './painel-agenda/painel-agenda.component';
import { MenuComponent } from './menu/menu.component';
import { CadastroClienteComponent } from './cadastro-cliente/cadastro-cliente.component';
import { ListarClienteComponent } from './listar-cliente/listar-cliente.component';
import { EditarClienteComponent } from './editar-cliente/editar-cliente.component';
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
