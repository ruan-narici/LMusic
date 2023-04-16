package acao;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class formEntradaUsuario implements Acao {

	@Override
	public void executar(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		try {
			if (!req.getParameter("erro").equals(null)) {
				req.setAttribute("erro", "Dados inválidos");
			}
		} catch (Exception e) {

		} finally {
			RequestDispatcher rd = req.getRequestDispatcher("WEB-INF/view/formEntradaUsuario.jsp");
			rd.forward(req, resp);
		}
	}

}
