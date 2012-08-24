<%@include file="/header.jspf"%>
<h3>Pedido:</h3>
<h2>${pedido.id }</h2>
<br />
<h3>Cliente:</h3>
<h2>${pedido.cliente }</h2>
<br />
<h3>Data:</h3>
<h2>${pedido.data }</h2>
<br />
<h3>Quantidade:</h3>
<h2>${pedido.quantidade }</h2>
<br />
<h3>Valor da compra:</h3>
<h2>R\$${pedido.valorTotal }</h2>
<br />

<table>
	<thead>
		<tr>
			<th>Item</th>
			<th>Quantidade</th>
			<th>Valor Unitário</th>
			<th>Valor Total</th>
			<th>Descrição</th>
		</tr>
	</thead>
	<tbody>
		<c:forEach items="${pedido.itens}" var="item">
			<tr>
				<td>${item.nome }</td>
				<td>${item.quantidade }</td>
				<td>R\$${item.valorUnitario }</td>
				<td>R\$${item.valorTotal }</td>
				<td>${item.descricao }</td>
			</tr>
		</c:forEach>
	</tbody>
</table>
<%@include file="/footer.jspf"%>