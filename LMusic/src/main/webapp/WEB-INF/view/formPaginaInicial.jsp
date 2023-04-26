<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html lang="pt-br">

<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Página Inicial</title>
    <script src="https://cdn.tailwindcss.com"></script>
    <link rel="icon" href="https://i.ibb.co/z6HxSV3/song.png">
</head>

<body class="bg-white dark:bg-slate-900">
    <div class="m-10">
        <h1 class="inline bg-gradient-to-r from-indigo-200 via-sky-400 to-indigo-200 bg-clip-text font-display text-5xl tracking-tight text-transparent">Página Inicial</h1>

  
        <form action="rota" class="mt-10">
            <p class="inline bg-gradient-to-r from-indigo-200 via-sky-400 to-indigo-200 bg-clip-text font-display text-2xl tracking-tight text-transparent">Lista de músicas:</p>
            <table border="1" class="table-auto rounded-xl border border-slate-200 dark:border-slate-800">
                <tr class=" text-gray-700 uppercase bg-gray-50 dark:bg-gray-700 dark:text-gray-400">
                    <th>ID</th>
                    <th>NOME</th>
                    <th>ARTISTA</th>
                    <th>DATA DO LANÇAMENTO</th>
                    <th>GÊNERO</th>
                    <th>LINK</th>
                    <th>AÇÕES</th>
                </tr>
                <tr class="mt-1 text-xs text-slate-700 dark:text-slate-400">
                    <th class="px-3 py-2">0</th>
                    <th class="px-3 py-2">On & On (feat. Daniel Levi)</th>
                    <th class="px-3 py-2">Cartoon</th>
                    <th class="px-3 py-2">01/01/2015</th>
                    <th class="px-3 py-2">Dance/Eletrônica</th>
                    <th class="px-3 py-2"><a href="https://www.youtube.com/watch?v=K4DyBUG242c&ab_channel=NoCopyrightSounds" target="_blank" class="dark:text-slate-400 dark:before:bg-slate-700 dark:hover:text-slate-300">Acessar</a></th>
                    <th class="px-3 py-2"><a href="" class="dark:text-slate-400 dark:before:bg-slate-700 dark:hover:text-slate-300">Alterar</a> <a
                            href="" class="dark:text-slate-400 dark:before:bg-slate-700 dark:hover:text-slate-300">Excluir</a></th>
                </tr>
    
                <c:forEach items="${lista}" var="lista">
                    <c:if test="${lista.getProprietario().getId() == idPrincipal}">
                        <tr class="mt-1 text-xs text-slate-700 dark:text-slate-400">
                            <th class="px-3 py-2">${lista.getId()}</th>
                            <th class="px-3 py-2">${lista.getNome()}</th>
                            <th class="px-3 py-2">${lista.getArtista()}</th>
                            <th class="px-3 py-2">${lista.getDataLancamento()}</th>
                            <th class="px-3 py-2">${lista.getGenero()}</th>
                            <th class="px-3 py-2"><a href="${lista.getLink()}" target="_blank" class="dark:text-slate-400 dark:before:bg-slate-700 dark:hover:text-slate-300">Acessar</a></th>
                            <th class="px-3 py-2"><a href="rota?acao=alterarMusica&id=${lista.getId()}" class="dark:text-slate-400 dark:before:bg-slate-700 dark:hover:text-slate-300">Alterar</a> <a
                                    href="rota?acao=excluirMusica&id=${lista.getId()}" class="dark:text-slate-400 dark:before:bg-slate-700 dark:hover:text-slate-300">Excluir</a></th>
                        </tr>
                    </c:if>
                </c:forEach>
    
            </table>
            <button type="submit" name="acao" value="adicionarNovaMusica" class="rounded-full bg-sky-300 py-2 px-4 text-sm font-semibold text-slate-900 hover:bg-sky-200 focus:outline-none focus-visible:outline-2 focus-visible:outline-offset-2 focus-visible:outline-sky-300/50 active:bg-sky-500 mt-3">Adicionar nova música</button>
            <button type="submit" name="acao" value="gerenciarUsuario" class="rounded-full bg-slate-800 py-2 px-4 text-sm font-medium text-white hover:bg-slate-700 focus:outline-none focus-visible:outline-2 focus-visible:outline-offset-2 focus-visible:outline-white/50 active:text-slate-400">Configurações do usuário</button>
        </form>
    </div>
    <footer class="p-2 fixed bottom-0 bg-black text-center items-center justify-center w-full">
		<a class="text-sm text-slate-700 dark:text-slate-400 mb-3 dark:text-slate-400 dark:before:bg-slate-700 dark:hover:text-slate-300" href="https://www.linkedin.com/in/ruan-narici/" target="_blank">Desenvolvido por Ruan Narici</a>
	</footer>
</body>

</html>