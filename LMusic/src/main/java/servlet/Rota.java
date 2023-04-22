package servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import acao.AlterarUsuario;
import acao.AutenticarUsuario;
import acao.ExcluirMusica;
import acao.ExcluirUsuario;
import acao.formAdicionarMusica;
import acao.formAlterarMusica;
import acao.formAlterarUsuario;
import acao.formCadastroUsuario;
import acao.formEntradaUsuario;
import acao.formGerenciamentoUsuario;
import acao.formPaginaInicial;
import acao.RegistrarUsuario;
import acao.SalvarAlteracaoMusica;
import acao.SalvarMusica;

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
			RegistrarUsuario registrar = new RegistrarUsuario();
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
			AutenticarUsuario autenticar = new AutenticarUsuario();
			autenticar.executar(req, resp);
			System.out.println("Executando a autenticacao do usuario no banco de dados");
			break;
		}
		}

		// Verificando se o usuário já está logado no sistema
		// Se não estiver, ele vai ser redirecionado para a pagina principal para que
		// ele possa entrar ou se cadastrar.
		if (!statusSessao) {
			switch (acao) {
			case "paginaInicial": {
				formPaginaInicial form = new formPaginaInicial();
				form.executar(req, resp);
				System.out.println("Tela da pagina inicial sendo executada");
				break;
			}
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
				AlterarUsuario alterarUsuario = new AlterarUsuario();
				alterarUsuario.executar(req, resp);
				System.out.println("Executando a alteracao do usuario no banco de dados");
				break;
			}
			case "excluir": {
				ExcluirUsuario excluirUsuario = new ExcluirUsuario();
				excluirUsuario.executar(req, resp);
				System.out.println("Executando a exclusao do usuario no banco de dados");
				break;
			}
			
			
			
			//Musica
			case "adicionarNovaMusica": {
				formAdicionarMusica form = new formAdicionarMusica();
				form.executar(req, resp);
				System.out.println("Tela de adicao de musica sendo executada");
				break;
			}
			case "salvarMusica": {
				SalvarMusica salvarMusica = new SalvarMusica();
				salvarMusica.executar(req, resp);
				System.out.println("Executando o salvarMusica no banco de dados");
				break;
			}
			case "alterarMusica": {
				formAlterarMusica form = new formAlterarMusica();
				form.executar(req, resp);
				System.out.println("Tela de alteracao de musica sendo executada");
				break;
			}
			case "salvarAlteracaoMusica": {
				SalvarAlteracaoMusica salvarAlteracaoMusica = new SalvarAlteracaoMusica();
				salvarAlteracaoMusica.executar(req, resp);
				System.out.println("Executando o salvarAlteracaoMusica no banco de dados");
				break;
			}
			case "excluirMusica": {
				ExcluirMusica excluirMusica = new ExcluirMusica();
				excluirMusica.executar(req, resp);
				System.out.println("Executando o excluirMusica no banco de dados");
				break;
			}
			

			}
		} else {
			if (!acao.equals("entrar") && !acao.equals("cadastrar") && !acao.equals("autenticarUsuario") && !acao.equals("registrarUsuario")) {
				System.out.println("O usuario precisa entrar no sistema para ter acesso a esta area");
				resp.sendRedirect("index.jsp");
			}
		}
	}
}
