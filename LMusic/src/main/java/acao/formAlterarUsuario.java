package acao;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dao.UsuarioDAO;
import model.Usuario;

public class formAlterarUsuario implements Acao{

	@Override
	public void executar(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String id = req.getParameter("id");
		UsuarioDAO usuarioDao = new UsuarioDAO();
		Usuario usuario = usuarioDao.buscarPorId(Long.parseLong(id));
		String nome = usuario.getNome();
		String senha = usuario.getSenha();
		
		req.setAttribute("id", id);
		req.setAttribute("nome", nome);
		req.setAttribute("senha", senha);
		
		RequestDispatcher rd = req.getRequestDispatcher("WEB-INF/view/formAlterarUsuario.jsp");
		rd.forward(req, resp);
	}

}
