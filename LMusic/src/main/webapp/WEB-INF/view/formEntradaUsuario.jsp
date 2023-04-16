<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Entrada de usuário</title>
</head>
<body>
<h1>Você está na página de entrada de usuário.</h1>
<p>Faça acesso ao sistema através de suas credenciais.</p>
<p>${erro}</p>
<form action="rota" method="post">
<label>Nome: </label>
<input type="text" name="nome" placeholder="Insira um nome">
<label>Senha: </label>
<input type="password" name="senha" placeholder="Insira uma senha">
<button type="submit" name="acao" value="autenticarUsuario">Confirmar</button>
</form>
</body>
</html>