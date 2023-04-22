package acao;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dao.UsuarioDAO;
import model.Usuario;
import model.tipoEnum;

public class RegistrarUsuario implements Acao{

	@Override
	public void executar(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String nome = req.getParameter("nome");
		String senha = req.getParameter("senha");
		Usuario usuario;
		
		if (nome.contains("adm")  || nome.contains("ADM")) {
			usuario = new Usuario(nome, senha, tipoEnum.ADMINISTRADOR);
		} else {
			usuario = new Usuario(nome, senha, tipoEnum.VISITANTE);
		}
		UsuarioDAO dao = new UsuarioDAO();
		dao.inserir(usuario);
		
		resp.getWriter().print("<html><script>alert(\"Usuário cadastrado com sucesso!\")</script></html>");
		resp.sendRedirect("index.jsp");
	}
}
