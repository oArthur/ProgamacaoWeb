package exercicios;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Calculadora
 */
@WebServlet("/Calculadora")
public class Calculadora extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Calculadora() {
        super();
        // TODO Auto-generated constructor stub
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter saida = response.getWriter();
		saida.write("<HTML><Body>");
		saida.write("<form action=Calculadora method=post>");
		saida.write("<label for=\"vlr2\">Valor 1</label>");
		saida.write("<input id=\"vlr1\" name=\"vlr1\" type=\"text\"> <br> <br>");
		saida.write("<label for=\"vlr2\">Valor 2</label>");
		saida.write("<input id=\"vlr2\" name=\"vlr2\" type=\"text\"> <br> <br>");
		saida.write("<input type=\"submit\">");
		saida.write("</form>");
		saida.write("</Body></HTML>");
		saida.close();
		
		
	}


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter saida = response.getWriter();
		String vlr1 = request.getParameter("vlr1");
		String vlr2 = request.getParameter("vlr2");
		
		double valor1 = Double.parseDouble(vlr1);
		double valor2 = Double.parseDouble(vlr2);
		double resultado = 0;
		
		resultado = valor1 + valor2;
		
		saida.print("Resultado = " + resultado);
	}

}
