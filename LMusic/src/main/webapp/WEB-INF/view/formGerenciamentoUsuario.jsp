<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html lang="pt-br">

<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Configurações do Usuário</title>
    <script src="https://cdn.tailwindcss.com"></script>
    <link rel="icon" href="https://i.ibb.co/z6HxSV3/song.png">
</head>

<body class="bg-white dark:bg-slate-900 grid grid-cols-2">
    <header class="block col-span-2 bg-black h-10 flex items-center justify-center">
        <nav>
            <ul>
                <li><a href="rota?acao=paginaInicial" class="text-white uppercase dark:hover:text-slate-300">Início</a></li>
            </ul>
        </nav>
    </header>
    <div class="m-10">
        <h1 class="bg-gradient-to-r from-indigo-200 via-sky-400 to-indigo-200 bg-clip-text font-display text-5xl tracking-tight text-transparent">Configurações do Usuário</h1>
        <p class="mt-10 bg-gradient-to-r from-indigo-200 via-sky-400 to-indigo-200 bg-clip-text font-display text-2xl tracking-tight text-transparent">Lista de usuários:</p>
        <table border="1" class="table-auto rounded-xl border border-slate-200 dark:border-slate-800">
            <tr class=" text-gray-700 uppercase bg-gray-50 dark:bg-gray-700 dark:text-gray-400">
                <th>ID</th>
                <th>NOME</th>
                <th>TIPO</th>
                <th>AÇÕES</th>
            </tr>
            <c:forEach items="${lista}" var="lista">
                <tr  class="text-xs text-slate-700 dark:text-slate-400">
                    <th class="px-3 py-2">${lista.getId()}</th>
                    <th class="px-3 py-2">${lista.getNome()}</th>
                    <th class="px-3 py-2">${lista.getTipo()}</th>
    
                    <!-- 				Verificando se o usuario é um administrador -->
                    <c:if test="${usuario.getTipo() == \"ADMINISTRADOR\"}">
                        <th class="px-3 py-2"><a href="rota?acao=alterarUsuario&id=${lista.getId()}" class="dark:text-slate-400 dark:before:bg-slate-700 dark:hover:text-slate-300">Alterar</a>
                            <a href="rota?acao=excluir&id=${lista.getId()}" class="dark:text-slate-400 dark:before:bg-slate-700 dark:hover:text-slate-300">Excluir</a>
                        </th>
                    </c:if>
                    <!-- 				Habilitando a alteração para o usuario -->
                    <c:if test="${lista.getId() == idPrincipal && lista.getTipo() == \"VISITANTE\"}">
                        <th class="px-3 py-2"><a href="rota?acao=alterarUsuario&id=${lista.getId()}" class="dark:text-slate-400 dark:before:bg-slate-700 dark:hover:text-slate-300">Alterar</a></th>
                    </c:if>
                </tr>
            </c:forEach>
        </table>
    </div>
    <div class="flex items-center justify-center items-center mt-20">
		<img src="https://i.ibb.co/z6HxSV3/song.png" alt="">
	</div>
    <footer class="p-2 fixed bottom-0 bg-black text-center items-center justify-center w-full">
		<a class="text-sm text-slate-700 dark:text-slate-400 mb-3 dark:text-slate-400 dark:before:bg-slate-700 dark:hover:text-slate-300" href="https://www.linkedin.com/in/ruan-narici/" target="_blank">Desenvolvido por Ruan Narici</a>
	</footer>
</body>

</html>