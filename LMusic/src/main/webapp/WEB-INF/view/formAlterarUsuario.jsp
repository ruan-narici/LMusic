<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Alterar usuário</title>
</head>
<body>
<h1>Você está na página de alteração de usuário.</h1>
<p>Preencha os campos abaixo e em seguida confirme as informações para poder salvar as alterações em nosso sistema.</p>
<form action="rota" method="post">
<label>Nome: </label>
<input type="text" name="nome" placeholder="Insira um nome" value="${nome}" readonly="readonly">
<label>Senha: </label>
<input type="password" name="senha" placeholder="Insira uma senha" value="${senha}">
<input type="hidden" name="id" value="${id}">
<button type="submit" name="acao" value=alterar>Confirmar</button>
</form>
</body>
</html>