package acao;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dao.MusicaDAO;
import model.Musica;
import servlet.Rota;

public class formPaginaInicial implements Acao{

	@Override
	public void executar(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		MusicaDAO musicaDao = new MusicaDAO();
		List<Musica> lista = musicaDao.listar();
		
		Rota rota = new Rota();
		Long id = rota.getIdPrincipal();
		
		req.setAttribute("lista", lista);
		req.setAttribute("idPrincipal", id);
		
		RequestDispatcher rd = req.getRequestDispatcher("WEB-INF/view/formPaginaInicial.jsp");
		rd.forward(req, resp);
	}

}
