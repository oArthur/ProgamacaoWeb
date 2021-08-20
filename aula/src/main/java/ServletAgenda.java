

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class ServletAgenda
 */
@WebServlet("/ServletAgenda")
public class ServletAgenda extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ServletAgenda() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * Crie um Servlet chamado ServletAgenda que receba parâmetros de uma entrada de agenda 
	 * (nome, telefone do usuário e data de nascimento) e que retorna uma página HTML 
	 * apresentando os dados recebidos. Crie também uma classe chamada ServletPaginaAgenda
	 *  que retorna uma página HTML com um formulário para enviar os dados para o ServletAgenda criado anteriormente.
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		/*
		String nome = "Arthur";
		int telefone = 982723123;
		String dta_nascimento = "25/11/2001";
		
		
		*/
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter saida = response.getWriter();
		
		String nome = request.getParameter("nome");
		String telefone = request.getParameter("telefone");
		String nascimento = request.getParameter("nascimento");
		
		saida.write("<HTML><Body>");
		saida.write("<h1 style=text-align:center;>Agenda</h1>");
		saida.write("<div style=display:flex;justify-content:center;align-items:center;>");
		saida.write("<br>Nome: "+ nome);
		saida.write("<br>Telefone: "+ telefone);
		saida.write("<br>Data de nascimento: "+ nascimento);
		saida.write("</div>");
		saida.write("</Body></HTML>");
		saida.close();
	}

}
