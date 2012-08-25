/*
 * André Spanguero Kanayama			NUSP: 7156873
 * EP1 - Engenharia de Software
 */

package br.edu.usp.angel.modelo;

	import junit.framework.Assert;

import org.junit.Test;
	
	public class Testes {
		@Test
		public void Test1(){
		Pedido pedido1 = new Pedido();
		pedido1.setCliente("Levih");
		Assert.assertEquals(0.0, pedido1.calculaValorTotal());
		}

		@Test
		public void Test2(){
		Pedido pedido2 = new Pedido();
		pedido2.setCliente("Rebeca");
		pedido2.adicionaItem("Tenis", "Tenis comum", 40, 1);
		Assert.assertEquals(40.0, pedido2.calculaValorTotal());
		}

		@Test
		public void Test3(){
		Pedido pedido3 = new Pedido();
		pedido3.setCliente("Denyel");
		pedido3.adicionaItem("Shotgun", "Arma de fogo de curto alcance", 500.50, 2);
		Assert.assertEquals(1001.0, pedido3.calculaValorTotal());
		}
		
		@Test
		public void Test4(){
		Pedido pedido4 = new Pedido();
		pedido4.setCliente("Kaira");
		pedido4.adicionaItem("Avatar", "Avatar para andar no plano terreno", 1200, 1);
		pedido4.adicionaItem("Poderes da natureza", "Poderes para controlar a natureza", 15, 1);
		Assert.assertEquals(1215.0, pedido4.calculaValorTotal());
		}


		@Test
		public void Test5(){
		Pedido pedido5 = new Pedido();
		pedido5.setCliente("Urakin");
		pedido5.adicionaItem("Espada", "Arma cortante", 150, 3);
		pedido5.adicionaItem("Martelo", "Arma de impacto", 300, 4);
		Assert.assertEquals(1650.0, pedido5.calculaValorTotal());
		}
	}
