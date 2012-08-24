package br.edu.usp.angel.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import org.hibernate.Session;
import org.hibernate.ejb.EntityManagerImpl;

import br.com.caelum.vraptor.ioc.Component;
import br.edu.usp.angel.modelo.Pedido;

@Component
public class PedidoDAO {
	private static EntityManager em;
	private static EntityManagerFactory emf; 

	public PedidoDAO(){
		emf = Persistence.createEntityManagerFactory(
				"sample-persistence-unit");
		em = emf.createEntityManager();
	}

	@SuppressWarnings("unchecked")
	public List<Pedido> listaTudo() {
		Session session;
		if (em.getDelegate() instanceof EntityManagerImpl) {  
			EntityManagerImpl entityManagerImpl = (EntityManagerImpl) em.getDelegate();  
			session = entityManagerImpl.getSession();  
		} else {  
			session = (Session) em.getDelegate();  
		}
		return session.createCriteria(Pedido.class).list();
	}

	public void salvarPedido(Pedido pedido){

		em.getTransaction().begin();

		em.persist(pedido);

		em.getTransaction().commit();

	}

}
