package br.com.digitalhouse.mapper;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import br.com.digitalhouse.dto.ClienteDTO;
import br.com.digitalhouse.model.Cliente;
import br.com.digitalhouse.request.ClienteRequest;

@Component
public class ClienteMapper {
	
	@Autowired
	private ModelMapper modelMapper;
	
	public ClienteDTO modelDTO(Cliente cliente) {
		return modelMapper.map(cliente, ClienteDTO.class);
	}
	
	public Cliente dtoRequestToModel(ClienteRequest clienteRequest) {
		return modelMapper.map(clienteRequest, Cliente.class);
	}

}
