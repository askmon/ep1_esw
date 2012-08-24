<%@include file="/header.jspf" %>
<table>
	<thead>
		<tr>
			<th>Cliente</th>
			<th>Valor</th>
			<th>Data</th>
		</tr>
	</thead>
	<tbody>
		<c:forEach items="${pedidoList}" var="pedido">
			<tr>
				<td>${pedido.cliente }</td>
				<td>${pedido.valorTotal }</td>
				<td>${pedido.data }</td>
				<td><a href="detalha?id=${pedido.id }">Detalhes</a></td>
			</tr>
		</c:forEach>
	</tbody>
</table>
<%@include file="/footer.jspf" %>