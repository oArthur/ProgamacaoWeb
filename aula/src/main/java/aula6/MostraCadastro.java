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
		
		resposta.println("Nome: "+ nome);
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
		resposta.println("Estado Empresa: "+ estado_emp);
	}
}
	