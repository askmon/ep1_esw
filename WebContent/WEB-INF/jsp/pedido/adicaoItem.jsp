<%@include file="/header.jspf"%>
<h3>Pedido:</h3>
<h2>${pedido.id }</h2>
<br />
<form action="adicionaItem">
	<fieldset>
		<legend>Adicionar item</legend>
		<input type="hidden" name="id" value="${pedido.id }" /> <label
			for="nome">Nome do item:</label> <input id="nome" type="text"
			name="nome" /> <label for="valorUnitario">Valor Unitário:</label> <input
			id="valorUnitario" type="text" name="valorUnitario" /> <label
			for="quantidade">Quantidade:</label> <input id="quantidade"
			type="text" name="quantidade" /> <label for="descricao">Descrição:</label>
		<textarea id="descricao" name="descricao"></textarea>
		<button type="submit">Próximo item</button>
	</fieldset>
</form>
<a href="lista">Encerrar adição de itens</a>
<%@include file="/footer.jspf"%>