package aula5;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class ServletTela1Cadastro
 */
@WebServlet("/ServletTela1Cadastro")
public class ServletTela1Cadastro extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ServletTela1Cadastro() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter resposta = response.getWriter();
		
		resposta.write("<html>");
		resposta.write("<head>");
		resposta.write("<title>Dados Profissionais</title>");
		resposta.write("</head>");
		resposta.write("<body>");
		resposta.write("<p>Preencha seus dados profissionais</p>");
		resposta.write("<form action=\"ServletTela1Cadastro\">");
		resposta.write("<label for=\"empresa\">Empresa</label>");
		resposta.write("<input type=\"text\" id=\"empresa\" name=\"empresa\"> <br>");
		resposta.write("<p>Endereco Profissional</p>");
		resposta.write("<label for=\"rua\">Rua</label>");
		resposta.write("<input type=\"text\" id=\"rua\" name=\"rua\"> <br>");
		resposta.write("<label for=\"complemento\">Complemento</label>");
		resposta.write("<input type=\"text\" id=\"complemento\" name=\"complemento\"> <br>");
		resposta.write("<label for=\"cidade\">Cidade</label>");
		resposta.write("<input type=\"text\" id=\"cidade\" name=\"cidade\"> <br>");
		resposta.write("<label for=\"cep\">Cep</label>");
		resposta.write("<input type=\"text\" id=\"cep\" name=\"cep\"> <br>");
		resposta.write("<label for=\"estado\">Estado</label>");
		resposta.write("<input type=\"text\" id=\"estado\" name=\"estado\"> <br>");
		resposta.write("<input type=\"submit\" value=\"Confirmar\">");
		resposta.write("</form>");
		
		resposta.write("</body></html>");
	}

}
