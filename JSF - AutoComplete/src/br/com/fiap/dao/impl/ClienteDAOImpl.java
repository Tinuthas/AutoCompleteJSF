package br.com.fiap.dao.impl;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.TypedQuery;

import br.com.fiap.dao.ClienteDAO;
import br.com.fiap.resource.ClienteTO;

public class ClienteDAOImpl extends GenericDAOImpl<ClienteTO, Integer> implements ClienteDAO{

	public ClienteDAOImpl(EntityManager em) {
		super(em);
		// TODO Auto-generated constructor stub
	}
	
	public List<String> buscarPorNomeCliente(String nome) {
		TypedQuery<String> query = em.createQuery(
		"select c.nome from Cliente c where c.nome like :nome",String.class);
		query.setParameter("nome","%"+ nome + "%");
		return query.getResultList();
	}

}
