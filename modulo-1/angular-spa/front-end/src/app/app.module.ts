import { MenuItem } from 'primeng/api';
import { NgModule } from '@angular/core';
import { FormsModule } from '@angular/forms';
import { HttpClientModule } from '@angular/common/http'
import { BrowserModule } from '@angular/platform-browser';
import { BrowserAnimationsModule } from '@angular/platform-browser/animations';

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
// import { MensagemComponent } from './mensagem/mensagem.component'
@NgModule({
  declarations: [
    AppComponent,
    PainelAgendaComponent,
    MenuComponent,
    // MensagemComponent
  ],
  imports: [
    BrowserModule,
    FormsModule,
    HttpClientModule,
    BrowserAnimationsModule,
    TableModule,
    PanelModule,
    InputTextModule,
    ButtonModule,
    MenubarModule,
    // MessageModule,
    // MessagesModule
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule {

}
