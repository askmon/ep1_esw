<%@include file="/header.jspf" %>
<form action="adiciona">
	<fieldset>
		<legend>Adicionar Pedido</legend>
		<label for="cliente">Cliente:</label> <input id="cliente" type="text" name="pedido.cliente" /> 
		<button type="submit">Enviar</button>
	</fieldset>
</form>
<%@include file="/footer.jspf" %>