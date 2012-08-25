/*
 * André Spanguero Kanayama			NUSP: 7156873
 * EP1 - Engenharia de Software
 */

package br.edu.usp.angel.modelo;

import br.edu.usp.angel.dao.PedidoDAO;


//Adiciona as entradas escritas aqui no banco de dados, para testar se estava tudo certinho
//antes de começar a trabalhar com o VRaptor

public class Main {
	public static void main (String[] args){
		PedidoDAO dao = new PedidoDAO();
		Pedido pedido1 = new Pedido();
		pedido1.setCliente("Levih");

		Pedido pedido2 = new Pedido();
		pedido2.setCliente("Rebeca");
		pedido2.adicionaItem("Tenis", "Tenis comum", 40, 1);

		Pedido pedido3 = new Pedido();
		pedido3.setCliente("Denyel");
		pedido3.adicionaItem("Shotgun", "Arma de fogo de curto alcance", 500.50, 2);

		Pedido pedido4 = new Pedido();
		pedido4.setCliente("Kaira");
		pedido4.adicionaItem("Avatar", "Avatar para andar no plano terreno", 1200, 1);
		pedido4.adicionaItem("Poderes da natureza", "Poderes para controlar a natureza", 15, 1);


		Pedido pedido5 = new Pedido();
		pedido5.setCliente("Urakin");
		pedido5.adicionaItem("Espada", "Arma cortante", 150, 3);
		pedido5.adicionaItem("Martelo", "Arma de impacto", 300, 4);

		dao.salvarPedido(pedido1);
		dao.salvarPedido(pedido2);
		dao.salvarPedido(pedido3);
		dao.salvarPedido(pedido4);
		dao.salvarPedido(pedido5);

	}
}
