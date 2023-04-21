package acao;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import dao.UsuarioDAO;
import servlet.Rota;

public class autenticarUsuario implements Acao{

	@Override
	public void executar(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String nome = req.getParameter("nome");
		String senha = req.getParameter("senha");
		
		UsuarioDAO dao = new UsuarioDAO();
		if (dao.autenticar(nome, senha)) {
			HttpSession sessao = req.getSession();
			sessao.setAttribute("sessao", sessao);
			
			RequestDispatcher rd = req.getRequestDispatcher("WEB-INF/view/formPaginaInicial.jsp");
			
			Rota rota = new Rota();
			Long id = dao.buscarPorCredenciais(nome, senha).getId();
			rota.setIdPrincipal(id);
			
			rd.forward(req, resp);
			
			System.out.println("Acesso liberado pelo autenticarUsuario");
			System.out.println("Tela de Pagina inicial sendo executada");
		} else {
			resp.sendRedirect("rota?acao=entrar&erro=Dados invalidos");
			System.out.println("Acesso negado pelo autenticarUsuario");
		}
	}
	
}
