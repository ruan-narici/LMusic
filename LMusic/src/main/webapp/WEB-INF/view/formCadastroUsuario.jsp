<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Cadastrar usuário</title>
</head>
<body>
<h1>Você está na página de cadastro de usuário.</h1>
<p>Preencha os campos abaixo e em seguida confirme as informações para poder se registrar em nosso sistema.</p>
<form action="rota" method="post">
<label>Nome: </label>
<input type="text" name="nome" placeholder="Insira um nome">
<label>Senha: </label>
<input type="password" name="senha" placeholder="Insira uma senha">
<button type="submit" name="acao" value="registrarUsuario">Confirmar</button>
</form>
</body>
</html>