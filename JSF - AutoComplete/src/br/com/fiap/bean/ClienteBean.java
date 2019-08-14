package br.com.fiap.bean;

import java.util.List;

import javax.faces.bean.ManagedBean;

import br.com.fiap.dao.ClienteDAO;
import br.com.fiap.dao.impl.ClienteDAOImpl;
import br.com.fiap.dao.impl.EntityManagerFactorySingleton;

@ManagedBean
public class ClienteBean {
	
	private String nomeBusca;

	public List<String> completaNomeCliente(String nome){
		return new ClienteDAOImpl(EntityManagerFactorySingleton.getInstance().createEntityManager())
				.buscarPorNomeCliente(nome);
	}
	
	public void excluir(String codigo) {
		
	}

	public String getNomeBusca() {
		return nomeBusca;
	}

	public void setNomeBusca(String nomeBusca) {
		this.nomeBusca = nomeBusca;
	}
	
	
	
	


	
}
