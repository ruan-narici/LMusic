<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Alterar musica</title>
</head>
<body>
<h1>Altere sua música e salve a modificação</h1>
<form action="rota" method="post">
<label>Nome</label>
<input type="text" name="nome" placeholder="ex: Chop Suey!"  value="${nomeDB}">
<label>Artista</label>
<input type="text" name="artista" placeholder="ex: System of a Down"  value="${artistaDB}">
<label>Data do lançamento</label>
<input type="text" name="data" placeholder="ex: 01/01/1900"  value="${dataDB}">
<label>Gênero</label>
<input type="text" name="genero" placeholder="ex: NuMetal"  value="${generoDB}">
<label>Link</label>
<input type="text" name="link" placeholder="ex: https://www.youtube.com"  value="${linkDB}">
<input type="hidden" name="id" value="${idDB}">
<button type="submit" name="acao" value="salvarAlteracaoMusica">Salvar</button>
</form>
</body>
</html>