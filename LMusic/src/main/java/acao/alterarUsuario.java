package acao;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dao.UsuarioDAO;

public class alterarUsuario implements Acao{

	@Override
	public void executar(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String id = req.getParameter("id");
		String nome = req.getParameter("nome");
		String senha = req.getParameter("senha");
		
		UsuarioDAO usuarioDao = new UsuarioDAO();
		usuarioDao.alterar(Long.parseLong(id), nome, senha);
		resp.sendRedirect("index.jsp");
	}

}
