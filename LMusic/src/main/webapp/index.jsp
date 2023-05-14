<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="pt-br">

<head>
	<meta charset="UTF-8">
	<meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
	<title>LMusic</title>
	<script src="https://cdn.tailwindcss.com"></script>
    <link rel="icon" href="https://i.ibb.co/z6HxSV3/song.png">
</head>

<body class="bg-white dark:bg-slate-900 grid grid-cols-2">
	<div class="m-10">
		<h1
			class="inline bg-gradient-to-r from-indigo-200 via-sky-400 to-indigo-200 bg-clip-text font-display text-5xl tracking-tight text-transparent">
			Seja bem-vindo(a) ao LMusic!</h1>
		<p class="mt-3 text-2xl tracking-tight text-slate-400">Aqui você poderá salvar sua lista de músicas favoritas
			adicionando várias informações a elas.</p>
		<p class="mt-1 text-sm text-slate-700 dark:text-slate-400">Você pode fazer o cadastro e acessa o LMusic
			clicando no botão cadastrar. Se já possuir uma conta, acesse agora clicando em entrar.</p>
			<form action="rota" method="get" class="mt-3">
				<button type="submit" name="acao" value="entrar"
					class="mt-10 mr-2 rounded-full bg-sky-300 py-2 px-4 text-sm font-semibold text-slate-900 hover:bg-sky-200 focus:outline-none focus-visible:outline-2 focus-visible:outline-offset-2 focus-visible:outline-sky-300/50 active:bg-sky-500">Entrar</button>
				<button type="submit" name="acao" value="cadastrar"
					class="rounded-full bg-slate-800 py-2 px-4 text-sm font-medium text-white hover:bg-slate-700 focus:outline-none focus-visible:outline-2 focus-visible:outline-offset-2 focus-visible:outline-white/50 active:text-slate-400">Cadastrar</button>
			</form>
	</div>
	<div class="flex items-center justify-center items-center mt-20">
		<img src="https://i.ibb.co/z6HxSV3/song.png" alt="">
	</div>
	<footer class="p-2 fixed bottom-0 bg-black text-center items-center justify-center w-full">
		<a class="text-sm text-slate-700 dark:text-slate-400 mb-3 dark:text-slate-400 dark:before:bg-slate-700 dark:hover:text-slate-300" href="https://www.linkedin.com/in/ruan-narici/" target="_blank">Desenvolvido por Ruan Narici</a>
	</footer>
</body>

</html>