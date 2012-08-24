package br.edu.usp.angel.controller;

import java.util.List;

import br.com.caelum.vraptor.Resource;
import br.com.caelum.vraptor.Result;
import br.edu.usp.angel.dao.PedidoDAO;
import br.edu.usp.angel.modelo.Pedido;

@Resource
public class PedidoController {
	private final PedidoDAO dao;
	private final Result result;

	public PedidoController(PedidoDAO dao, Result result) {
		this.dao = dao;
		this.result = result;
	}
	public List<Pedido> lista() {
		return dao.listaTudo();
	}
	
	public Pedido detalha(Long id){
		Pedido pedido = dao.carregaPedido(id);
		return pedido;
	}
	
	public void remove(Long id){
		dao.removePedido(id);
		result.redirectTo(PedidoController.class).lista();
	}
	
	public void adicao(){
	}
	
	public void adiciona(Pedido pedido){
		dao.salvarPedido(pedido);
		result.redirectTo(PedidoController.class).adicaoItem(pedido);
	}
	
	public Pedido adicaoItem(Pedido pedido){
		return pedido;
	}
	
	public void adicionaItem(Long id, String nome, double valorUnitario, int quantidade, String descricao){
		dao.addItem(id, nome, valorUnitario, quantidade, descricao);
		result.redirectTo(PedidoController.class).adicaoItem(dao.carregaPedido(id));
	}
}
