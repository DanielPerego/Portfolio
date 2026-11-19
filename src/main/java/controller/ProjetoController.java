package controller;

import java.io.IOException;
import java.util.Map;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class ProjetoController
 */
@WebServlet(name = "/ProjetoController", urlPatterns = {"/ProjetoController", "/cadastroProjeto", "/listaProjeto", "/editarProjeto", "/selecaoProjeto", "/excluirProjeto"})
public class ProjetoController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * Mapa utilizado para associar as rotas às páginas .jsp
	 */
	
	private Map<String, String> rotas;
	
    /**
     * Default constructor. 
     */
    public ProjetoController() {
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

}
