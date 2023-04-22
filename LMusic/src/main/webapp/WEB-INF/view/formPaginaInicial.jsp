<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Página Inicial</title>
</head>
<body>
	<h1>Página Inicial</h1>

	<form action="rota">
	<button name="acao" value="gerenciarUsuario">Configurações do usuário</button>
	</form>
	
	<form action="rota">
		<p>Lista de músicas:</p>
		<table border="1">
			<tr>
				<th>ID</th>
				<th>NOME</th>
				<th>ARTISTA</th>
				<th>DATA DO LANÇAMENTO</th>
				<th>GÊNERO</th>
				<th>LINK</th>
				<th>AÇÕES</th>
			</tr>
			<tr>
				<th>0</th>
				<th>Teste</th>
				<th>Testando</th>
				<th>18/04/2023</th>
				<th>Rock</th>
				<th><a href="https://www.google.com" target="_blank">Acesse</a></th>
				<th><a href="rota?acao=alterarUsuario&id=${x}">Alterar</a> <a href="rota?acao=excluir&id=${x}}">Excluir</a></th>
			</tr>

			<c:forEach items="${lista}" var="lista">
				<c:if test="${lista.getProprietario().getId() == idPrincipal}">
					<tr>
						<th>${lista.getId()}</th>
						<th>${lista.getNome()}</th>
						<th>${lista.getArtista()}</th>
						<th>${lista.getDataLancamento()}</th>
						<th>${lista.getGenero()}</th>
						<th><a href="${lista.getLink()}" target="_blank">Acesse</a></th>
						<th><a href="rota?acao=alterarMusica&id=${lista.getId()}">Alterar</a> <a href="rota?acao=excluirMusica&id=${lista.getId()}">Excluir</a></th>
					</tr>
				</c:if>
			</c:forEach>
			
		</table>
		<button type="submit" name="acao" value="adicionarNovaMusica">Adicionar nova música</button>
	</form>
	
</body>
</html>