package servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import acao.autenticarUsuario;
import acao.formCadastroUsuario;
import acao.formEntradaUsuario;
import acao.registrarUsuario;

@WebServlet(urlPatterns = "/rota")
public class Rota extends HttpServlet {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		HttpSession sessao = req.getSession();
		boolean statusSessao = (sessao.getAttribute("sessao") != null);
		String acao = req.getParameter("acao");

		switch (acao) {
		case "cadastrar": {
			formCadastroUsuario form = new formCadastroUsuario();
			form.executar(req, resp);
			System.out.println("Tela de cadastro de usuario sendo executada");
			break;
		}
		case "registrarUsuario": {
			registrarUsuario registrar = new registrarUsuario();
			registrar.executar(req, resp);
			System.out.println("Executando o registro do usuario no banco de dados");
			break;
		}
		case "entrar": {
			formEntradaUsuario form = new formEntradaUsuario();
			form.executar(req, resp);
			System.out.println("Tela de entrada de usuario sendo executada");
			break;
		}
		case "autenticarUsuario": {
			autenticarUsuario autenticar = new autenticarUsuario();
			autenticar.executar(req, resp);
			System.out.println("Executando a autenticacao do usuario no banco de dados");
			break;
		}
		
		}
	}
}
