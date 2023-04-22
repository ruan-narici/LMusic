package acao;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dao.MusicaDAO;

public class SalvarAlteracaoMusica implements Acao{

	@Override
	public void executar(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

		String id = req.getParameter("id");
		String nome = req.getParameter("nome");
		String artista = req.getParameter("artista");
		String data = req.getParameter("data");
		String genero = req.getParameter("genero");
		String link = req.getParameter("link");
		
		MusicaDAO musicaDao = new MusicaDAO();
		musicaDao.alterar(Long.parseLong(id), nome, artista, data, genero, link);
		
		resp.sendRedirect("rota?acao=paginaInicial");
		
	}

}
