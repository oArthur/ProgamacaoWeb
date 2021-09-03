package exercicios;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class SaudacoesServlet
 */
@WebServlet("/SaudacoesServlet")
public class SaudacoesServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public SaudacoesServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		PrintWriter saida = response.getWriter();
		
		saida.write("<HTML><Body>");
		saida.write("<form action=SaudacoesServlet method=post>");
		saida.write("<label for=\"nome\">Nome</label>");
		saida.write("<input id=\"nome\" name=\"nome\" type=\"text\">");
		saida.write("<label for=\"lname\">Ultimo Nome</label>");
		saida.write("<input id=\"lname\" name=\"lname\" type=\"text\">");
		saida.write("<input type=\"submit\">");
		saida.write("</form>");
		saida.write("</Body></HTML>");
		saida.close();
		
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter saida = response.getWriter();
		
		String nome = request.getParameter("nome");
		String lname = request.getParameter("lname");

		
		saida.write("<HTML><Body>");
		saida.write("<div style=display:flex;justify-content:center;align-items:center;>");
		saida.write("<h1>Seja Bem-Vindo, "+ nome +" "+ lname + "!! </h1>"); 
		saida.write("</div>");
		saida.write("</Body></HTML>");
		saida.close();
	}

}
