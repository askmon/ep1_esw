package br.edu.usp.angel.controller;

import java.util.List;

import br.com.caelum.vraptor.Resource;
import br.edu.usp.angel.dao.PedidoDAO;
import br.edu.usp.angel.modelo.Pedido;

@Resource
public class PedidoController {
	private final PedidoDAO dao;

	public PedidoController(PedidoDAO dao) {
		this.dao = dao;
	}
	public List<Pedido> lista() {
		return dao.listaTudo();
	}
	
	public Pedido detalha(Long id){
		Pedido pedido = dao.carregaPedido(id);
		return pedido;
	}
}
