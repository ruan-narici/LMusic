<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>LMusic</title>
</head>
<body>
<h1>Seja bem-vindo(a) ao LMusic</h1>
<p>Aqui você poderá salvar sua lista de músicas favoritas adicionando várias informações a elas.</p>
<form action="rota" method="get">
<label>Você pode fazer o cadastro e acessa o LMusic clicando no botão cadastrar</label>
<button type="submit" name="acao" value="cadastrar">Cadastrar</button>
</form>
<form action="rota" method="get">
<label>Se já possuir uma conta, acesse agora clicando em entrar</label>
<button type="submit" name="acao" value="entrar">Entrar</button>
</form>
</body>
</html>