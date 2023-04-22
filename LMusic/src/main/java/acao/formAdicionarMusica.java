package acao;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dao.UsuarioDAO;
import model.Usuario;
import servlet.Rota;

public class formAdicionarMusica implements Acao{

	@Override
	public void executar(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		Rota rota = new Rota();
		Long id = rota.getIdPrincipal();
		UsuarioDAO usuarioDao = new UsuarioDAO();
		Usuario usuario = usuarioDao.buscarPorId(id);
		
		req.setAttribute("usuario", usuario);
		
		RequestDispatcher rd = req.getRequestDispatcher("WEB-INF/view/formAdicionarMusica.jsp");
		rd.forward(req, resp);
	}

}
