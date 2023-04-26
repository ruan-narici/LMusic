<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html lang="pt-br">

<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Entrada de usuário</title>
    <script src="https://cdn.tailwindcss.com"></script>
    <link rel="icon" href="https://i.ibb.co/z6HxSV3/song.png">
</head>

<body class="bg-white dark:bg-slate-900">
    <div class="m-10">
        <h1 class="inline bg-gradient-to-r from-indigo-200 via-sky-400 to-indigo-200 bg-clip-text font-display text-5xl tracking-tight text-transparent">Você está na página de entrada de usuário.</h1>
        <p class="mt-3 text-2xl tracking-tight text-slate-400">Acesse o sistema através de suas credenciais.</p>
        <p class="mt-3 text-2xl tracking-tight text-slate-400">${erro}</p>
        <form action="rota" method="post" class="mt-3">
            <label class="font-display font-medium text-slate-900 dark:text-white">Nome: </label>
            <input type="text" name="nome" placeholder="Insira um nome" class="group flex h-6 w-6 items-center justify-center sm:justify-start md:h-auto md:w-80 md:flex-none md:rounded-lg md:py-2.5 md:pl-4 md:pr-3.5 md:text-sm md:ring-1 md:ring-slate-200 md:hover:ring-slate-300 dark:md:bg-slate-800/75 dark:md:ring-inset dark:md:ring-white/5 dark:md:hover:bg-slate-700/40 dark:md:hover:ring-slate-500 lg:w-96 text-white mb-2">
            <label class="font-display font-medium text-slate-900 dark:text-white">Senha: </label>
            <input type="password" name="senha" placeholder="Insira uma senha"  class="group flex h-6 w-6 items-center justify-center sm:justify-start md:h-auto md:w-80 md:flex-none md:rounded-lg md:py-2.5 md:pl-4 md:pr-3.5 md:text-sm md:ring-1 md:ring-slate-200 md:hover:ring-slate-300 dark:md:bg-slate-800/75 dark:md:ring-inset dark:md:ring-white/5 dark:md:hover:bg-slate-700/40 dark:md:hover:ring-slate-500 lg:w-96 text-white mb-2">
            <button type="submit" name="acao" value="autenticarUsuario"  class="rounded-full bg-sky-300 py-2 px-4 text-sm font-semibold text-slate-900 hover:bg-sky-200 focus:outline-none focus-visible:outline-2 focus-visible:outline-offset-2 focus-visible:outline-sky-300/50 active:bg-sky-500 mt-3">Confirmar</button>
        </form>
    </div>
    <footer class="p-2 fixed bottom-0 bg-black text-center items-center justify-center w-full">
		<a class="text-sm text-slate-700 dark:text-slate-400 mb-3 dark:text-slate-400 dark:before:bg-slate-700 dark:hover:text-slate-300" href="https://www.linkedin.com/in/ruan-narici/" target="_blank">Desenvolvido por Ruan Narici</a>
	</footer>
</body>

</html>