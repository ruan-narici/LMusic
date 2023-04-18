package servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import acao.alterarUsuario;
import acao.autenticarUsuario;
import acao.excluirUsuario;
import acao.formAlterarUsuario;
import acao.formCadastroUsuario;
import acao.formEntradaUsuario;
import acao.formGerenciamentoUsuario;
import acao.registrarUsuario;

@WebServlet(urlPatterns = "/rota")
public class Rota extends HttpServlet {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private static Long idUsuario = null;

	public Long getIdPrincipal() {
		return Rota.idUsuario;
	}

	public void setIdPrincipal(Long id) {
		Rota.idUsuario = id;
	}

	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		HttpSession sessao = req.getSession();
		boolean statusSessao = (sessao.getAttribute("sessao") == null);
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

		//Verificando se o usuário já está logado no sistema
		//Se não estiver, ele vai ser redirecionado para a pagina principal para que ele possa entrar ou se cadastrar.
		if (!statusSessao) {
			switch (acao) {
			case "gerenciarUsuario": {
				formGerenciamentoUsuario form = new formGerenciamentoUsuario();
				form.executar(req, resp);
				System.out.println("Tela de gerenciamento de usuario sendo executada");
				break;
			}
			case "alterarUsuario": {
				formAlterarUsuario form = new formAlterarUsuario();
				form.executar(req, resp);
				System.out.println("Tela de alteracao de usuario sendo executada");
				break;
			}
			case "alterar": {
				alterarUsuario alterarUsuario = new alterarUsuario();
				alterarUsuario.executar(req, resp);
				System.out.println("Executando a alteracao do usuario no banco de dados");
				break;
			}
			case "excluir": {
				excluirUsuario excluirUsuario = new excluirUsuario();
				excluirUsuario.executar(req, resp);
				System.out.println("Executando a exclusao do usuario no banco de dados");
			}

			}
		} else {
			resp.sendRedirect("index.jsp");
		}

	}
}
