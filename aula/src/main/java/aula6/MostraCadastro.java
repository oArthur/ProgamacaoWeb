package aula6;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet("/MostraCadastro")
public class MostraCadastro extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public MostraCadastro() {
        super();
    }


	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter resposta = response.getWriter();
		
		HttpSession sessao = request.getSession(true);
		
		String nome = (String) sessao.getAttribute("nome");
		String sobrenome = (String) sessao.getAttribute("sobrenome");
		String rua = (String) sessao.getAttribute("rua");
		String complemento = (String) sessao.getAttribute("complemento");
		String cidade = (String) sessao.getAttribute("cidade");
		String cep = (String) sessao.getAttribute("cep");
		String estado = (String) sessao.getAttribute("estado");
		
		
		String empresa = (String) sessao.getAttribute("empresa");
		String rua_emp = (String) sessao.getAttribute("rua_emp");
		String complemento_emp = (String) sessao.getAttribute("complemento_emp");
		String cidade_emp = (String) sessao.getAttribute("cidade_emp");
		String cep_emp = (String) sessao.getAttribute("cep_emp");
		String estado_emp = (String) sessao.getAttribute("estado_emp");
		
		resposta.write("<html><head><title>Dados Do Usuario</title></head>");
		resposta.write("<h1 style=text-align:center;>Dados do Usuario</h1>");
		resposta.write("<div style=display:flex;justify-content:center;align-items:center;>");
		resposta.write("<br>Nome: "+ nome);
		resposta.write("<br>Sobrenome: "+ sobrenome);
		resposta.write("<br>Rua: "+ rua);
		resposta.write("<br>Complemento: "+ complemento);
		resposta.write("<br>Cidade: "+ cidade);
		resposta.write("<br>CEP: "+ cep);
		resposta.write("<br>Estado: "+ estado +"<br>");
		resposta.write("<br>Dados da Empresa:<br>");
		resposta.write("<br>Empresa: "+ empresa);
		resposta.write("<br>Rua: "+ rua_emp);
		resposta.write("<br>Complemento: "+ complemento);
		resposta.write("<br>Cidade: "+ cidade_emp);
		resposta.write("<br>Estado: "+ estado_emp);
		resposta.write("</div>");
		resposta.write("</body></html>");
		resposta.close();
		
		
		
		
		
		
		/*resposta.println("Nome: "+ nome);
		resposta.println("Sobrenome: "+ sobrenome);
		resposta.println("Rua: "+ rua);
		resposta.println("Complemento: "+ complemento);
		resposta.println("Cidade: "+ cidade);
		resposta.println("Cep: "+ cep);
		resposta.println("Estado: "+ estado);
		
		resposta.println("---------*---------*----------");
		
		resposta.println("Empresa: "+ empresa);
		resposta.println("Rua Empresa: "+ rua_emp);
		resposta.println("Complemento Empresa: "+ complemento_emp);
		resposta.println("Cidade Empresa: "+ cidade_emp);
		resposta.println("CEP empresa: "+ cep_emp);
		resposta.println("Estado Empresa: "+ estado_emp);*/
	}
}
	