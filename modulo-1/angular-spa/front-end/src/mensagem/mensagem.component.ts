// import { Component, OnInit } from '@angular/core';

// import { Message, MessageService } from 'primeng/api';

// @Component({
//   selector: 'app-mensagem',
//   templateUrl: './mensagem.component.html',
//   styleUrls: ['./mensagem.component.css'],
//   providers: [MessageService]
// })

// export class MensagemComponent implements OnInit {

//   msgs1: Message[];

//   msgs2: Message[];

//   constructor(private messageService: MessageService) { }

//   ngOnInit() {
//     this.msgs1 = [
//       { severity: 'success', summary: 'Success', detail: 'Message Content' },
//       { severity: 'info', summary: 'Info', detail: 'Message Content' },
//       { severity: 'warn', summary: 'Warning', detail: 'Message Content' },
//       { severity: 'error', summary: 'Error', detail: 'Message Content' }
//     ];
//   }

//   addMessages() {
//     this.msgs2 = [
//       { severity: 'success', summary: 'Success', detail: 'Message Content' },
//       { severity: 'info', summary: 'Info', detail: 'Message Content' },
//       { severity: 'warn', summary: 'Warning', detail: 'Message Content' },
//       { severity: 'error', summary: 'Error', detail: 'Message Content' }
//     ];
//   }

//   clearMessages() {
//     this.msgs2 = [];
//   }

//   showViaService() {
//     this.messageService.add({ severity: 'success', summary: 'Service Message', detail: 'Via MessageService' });
//   }
// }