package br.edu.usp.angel.modelo;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Pedido {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	private String cliente;
	private String data = dataatual();
	private double valorTotal = 0;
	private int quantidade = 0;

	@OneToMany(mappedBy = "pedido", cascade = CascadeType.ALL)
	private List<Item> itens = new ArrayList<Item>();

	private String dataatual() {
		Calendar calen = Calendar.getInstance();
		String DATE_FORMAT = "dd/MM/yyyy";
		SimpleDateFormat sdf = new SimpleDateFormat(DATE_FORMAT);
		return sdf.format(calen.getTime());
	}

	public void adicionaItem(String nome, String descricao, double valorUnitario, int quantidade){
		Item novoItem = new Item();
		novoItem.setNome(nome);
		novoItem.setDescricao(descricao);
		novoItem.setValorUnitario(valorUnitario);
		novoItem.setQuantidade(quantidade);
		novoItem.setValorTotal(quantidade * valorUnitario);
		novoItem.setPedido(this);
		this.itens.add(novoItem);
		this.valorTotal += quantidade * valorUnitario;
		this.quantidade += quantidade;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getCliente() {
		return cliente;
	}

	public void setCliente(String cliente) {
		this.cliente = cliente;
	}

	public String getData() {
		return data;
	}

	public void setData(String data) {
		this.data = data;
	}

	public double getValorTotal() {
		return valorTotal;
	}

	public void setValorTotal(double valorTotal) {
		this.valorTotal = valorTotal;
	}

	public List<Item> getItens() {
		return itens;
	}

	public void setItens(List<Item> itens) {
		this.itens = itens;
	}

	public int getQuantidade() {
		return quantidade;
	}

	public void setQuantidade(int quantidade) {
		this.quantidade = quantidade;
	}

}
