package acao;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dao.UsuarioDAO;
import model.Usuario;
import servlet.Rota;

public class formGerenciamentoUsuario implements Acao{

	@Override
	public void executar(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		UsuarioDAO usuarioDao = new UsuarioDAO();
		List<Usuario> lista = usuarioDao.listar();
		
		Long id = new Rota().getIdPrincipal();
		
		Usuario usuario = usuarioDao.buscarPorId(id);
		
		req.setAttribute("lista", lista);
		req.setAttribute("idPrincipal", id);
		req.setAttribute("usuario", usuario);
		
		RequestDispatcher rd = req.getRequestDispatcher("WEB-INF/view/formGerenciamentoUsuario.jsp");
		rd.forward(req, resp);
	}

}
