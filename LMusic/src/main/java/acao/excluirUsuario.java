package acao;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dao.UsuarioDAO;
import model.Usuario;

public class excluirUsuario implements Acao{

	@Override
	public void executar(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String id = req.getParameter("id");
		UsuarioDAO usuarioDao = new UsuarioDAO();
		usuarioDao.excluir(Long.parseLong(id));
		
		resp.sendRedirect("rota?acao=gerenciarUsuario");
	}

}
