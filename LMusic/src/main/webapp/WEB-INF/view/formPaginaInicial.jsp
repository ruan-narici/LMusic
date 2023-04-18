<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
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
			</tr>
			<tr>
				<th>0</th>
				<th>Teste</th>
				<th>Testando</th>
				<th>18/04/2023</th>
				<th>Rock</th>
				<th><a href="https://www.google.com" target="_blank">Acesse</a></th>
			</tr>
		</table>
		<button type="submit" name="acao" value="adicionarNovaMusica">Adicionar nova música</button>
	</form>
	
</body>
</html>