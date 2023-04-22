package acao;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dao.MusicaDAO;
import dao.UsuarioDAO;
import model.Musica;
import model.Usuario;

public class SalvarMusica implements Acao{

	@Override
	public void executar(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String nome = req.getParameter("nome");
		String artista = req.getParameter("artista");
		String dataCa = req.getParameter("data");
		String genero = req.getParameter("genero");
		String link = req.getParameter("link");
		String id = req.getParameter("usuarioId");
		
		UsuarioDAO usuarioDao = new UsuarioDAO();
		Usuario usuario = usuarioDao.buscarPorId(Long.parseLong(id));
		
		Musica musica = new Musica(nome, artista, dataCa, genero, link, usuario);
		
		MusicaDAO musicaDao = new MusicaDAO();
		musicaDao.inserir(musica);
		
		resp.sendRedirect("rota?acao=paginaInicial");
	}

}
