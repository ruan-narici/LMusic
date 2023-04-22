<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Adicionar musica</title>
</head>
<body>
<h1>Adicione uma música em sua lista ${usuario.getNome()}</h1>
<form action="rota" method="post">
<label>Nome</label>
<input type="text" name="nome" placeholder="ex: Chop Suey!">
<label>Artista</label>
<input type="text" name="artista" placeholder="ex: System of a Down">
<label>Data do lançamento</label>
<input type="text" name="data" placeholder="ex: 01/01/1900">
<label>Gênero</label>
<input type="text" name="genero" placeholder="ex: NuMetal">
<label>Link</label>
<input type="text" name="link" placeholder="ex: https://www.youtube.com">
<input type="hidden" name="usuarioId" value="${usuario.getId()}">
<button type="submit" name="acao" value="salvarMusica">Adicionar</button>
</form>
</body>
</html>