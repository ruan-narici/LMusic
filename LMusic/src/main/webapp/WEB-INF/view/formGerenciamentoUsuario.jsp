<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Configurações</title>
</head>
<body>
	<h1>Configurações do Usuário</h1>


	<p>Lista de usuários:</p>

	<table border="1">
		<tr>
			<th>ID</th>
			<th>NOME</th>
			<th>AÇÕES</th>
		</tr>
		<c:forEach items="${lista}" var="lista">
			<tr>
				<th>${lista.getId()}</th>
				<th>${lista.getNome()}</th>

<!-- 				Verificando se o usuario é um administrador -->
				<c:if test="${idPrincipal == 1}">
					<th><a href="rota?acao=alterarUsuario&id=${lista.getId()}">Alterar</a>
						<a href="rota?acao=excluir&id=${lista.getId()}">Excluir</a></th>
				</c:if>
<!-- 				Habilitando a alteração para o usuario -->
				<c:if test="${lista.getId() == idPrincipal && idPrincipal != 1}">
					<th><a href="rota?acao=alterarUsuario&id=${lista.getId()}">Alterar</a></th>
				</c:if>
			</tr>
		</c:forEach>
	</table>
</body>
</html>