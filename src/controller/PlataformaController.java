package controller;

import java.io.IOException;
import java.sql.Connection;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


import dao.PlataformaDao;
import dao.util.Conexao;
import model.Plataforma;

/**
 * Servlet implementation class PlataformaController
 */
@WebServlet("/PlataformaController")
public class PlataformaController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public PlataformaController() {
        super();
        // TODO Auto-generated constructor stub
    }
    protected void processarRequisicao(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
    	String s = request.getParameter("chave");
    	
    	if(s.equals("cadastro_plataforma")){
			cadastrar(request, response);
		} 
    	
    }
	
    
    
    private void cadastrar(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		String localizacao = request.getParameter("localizacao");
		
		Plataforma plataforma = new Plataforma(localizacao);

		Connection con = Conexao.conseguirConexao();
		PlataformaDao dao = new PlataformaDao();
		dao.setConnection(con);

		try {
			dao.salvar(plataforma);
			RequestDispatcher rd = request.getRequestDispatcher("fazenda.jsp");
			rd.forward(request, response);
		} catch (Exception e) {
			request.setAttribute("deucerto", "0");
			RequestDispatcher rd = request.getRequestDispatcher("cadastroPlataformas.jsp");
			rd.forward(request, response);
		} 	


	}
    
    
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
