package br.com.fiap.teste;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import br.com.fiap.dao.ClienteDAO;
import br.com.fiap.dao.impl.ClienteDAOImpl;
import br.com.fiap.resource.ClienteTO;

public class Testes {

	public static void main(String[] args) {
		EntityManagerFactory fabrica = Persistence.createEntityManagerFactory("CLIENTE_ORACLE");

		EntityManager em = fabrica.createEntityManager();

		List<ClienteTO> clientes = new ArrayList<ClienteTO>();
		for(int i =0; i < 10; i++) {
			ClienteTO a = new ClienteTO();
			a.setNome("Jose");
			clientes.add(a);
		}
	
				
		ClienteDAO dao = new ClienteDAOImpl(em);

		try {
			for (ClienteTO clienteTO : clientes) {
				dao.cadastrar(clienteTO);
			}
			
			dao.commit();

		} catch (Exception e) {
			e.printStackTrace();

		}
	}

}
