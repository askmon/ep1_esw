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
	
	public Pedido carregaPedido(Long id){
		Pedido pedido = em.find(Pedido.class, id);
		return pedido;
	}
	
	public void removePedido(Long id){
		Pedido pedido = carregaPedido(id);
		em.getTransaction().begin();
		em.remove(pedido);
		em.getTransaction().commit();
	}
	
	public void addItem(Long id, String nome, double valorUnitario, int quantidade, String descricao){
		Pedido pedido = carregaPedido(id);
		pedido.adicionaItem(nome, descricao, valorUnitario, quantidade);
		em.getTransaction().begin();
		em.persist(pedido);
		em.getTransaction().commit();
	}
	
	public void salvarPedido(Pedido pedido){

		em.getTransaction().begin();

		em.persist(pedido);

		em.getTransaction().commit();

	}

}
