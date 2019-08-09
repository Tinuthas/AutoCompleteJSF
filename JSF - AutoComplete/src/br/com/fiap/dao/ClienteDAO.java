package br.com.fiap.dao;

import java.util.List;

import br.com.fiap.resource.ClienteTO;

public interface ClienteDAO extends GenericDAO<ClienteTO, Integer>{
	
	public List<String> buscarPorNomeCliente(String nome);

	
}
