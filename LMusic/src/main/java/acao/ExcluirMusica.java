package acao;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dao.MusicaDAO;

public class ExcluirMusica implements Acao{

	@Override
	public void executar(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String id = req.getParameter("id");
		
		MusicaDAO musicaDao = new MusicaDAO();
		musicaDao.excluir(Long.parseLong(id));
		
		resp.sendRedirect("rota?acao=paginaInicial");
	}

}
