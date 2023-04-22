package acao;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dao.MusicaDAO;
import model.Musica;

public class formAlterarMusica implements Acao{

	@Override
	public void executar(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

		String id = req.getParameter("id");
		MusicaDAO musicaDao = new MusicaDAO();
		Musica musica = musicaDao.buscarPorId(Long.parseLong(id));
		
		req.setAttribute("idDB", musica.getId());
		req.setAttribute("nomeDB", musica.getNome());
		req.setAttribute("artistaDB", musica.getArtista());
		req.setAttribute("dataDB", musica.getDataLancamento());
		req.setAttribute("generoDB", musica.getGenero());
		req.setAttribute("linkDB", musica.getLink());
		
		RequestDispatcher rd = req.getRequestDispatcher("WEB-INF/view/formAlterarMusica.jsp");
		rd.forward(req, resp);
	}

}
