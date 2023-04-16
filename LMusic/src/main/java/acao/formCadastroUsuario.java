package acao;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class formCadastroUsuario implements Acao{

	@Override
	public void executar(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		RequestDispatcher rd = req.getRequestDispatcher("WEB-INF/view/formCadastroUsuario.jsp");
		rd.forward(req, resp);
	}

}
