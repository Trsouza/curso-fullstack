import { ClienteModel } from '../model/cliente-model';
import { ClienteEntity } from '../entity/cliente-entity';
import { Mapper } from './../../base/mapper';
import { registerLocaleData } from '@angular/common';
export class ClienteMapper extends Mapper<ClienteEntity,ClienteModel> {
  
  //recebe do entity, que vem do back
  mapFrom(param: ClienteEntity): ClienteModel {
    return {
      id: param.id,
      nome: param.nome ? param.nome : '', // Caso o nome venha nulo - pode customizar com uma frase qualquer
      sobrenome: param.sobrenome,
      telefones: param.telefones,
      dataNasc: param.dataNasc,
      cpf: param.cpf,
      rg: param.rg,
      email: param.email,
      endereco: param.endereco
    };
  }

  //recebe do model p/ o entity
  mapTo(param: ClienteModel): ClienteEntity {
    return {
        id: param.id,
        nome: param.nome,
        sobrenome: param.sobrenome,
        telefones: param.telefones,
        dataNasc: param.dataNasc,
        cpf: param.cpf,
        rg: param.rg,
        email: param.email,
        endereco: param.endereco
    };
  }
}
