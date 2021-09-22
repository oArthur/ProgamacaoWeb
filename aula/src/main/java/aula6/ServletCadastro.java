package aula6;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;


@WebServlet("/ServletCadastro")
public class ServletCadastro extends HttpServlet {
	private static final long serialVersionUID = 1L;
       

    public ServletCadastro() {
        super();
        
    }
    /*Dados Pessoais*/
    public static final String NOME = "nome";
    public static final String SOBRENOME = "sobrenome";
    public static final String RUA = "rua";
    public static final String COMPLEMENTO = "complemento";
    public static final String CIDADE = "cidade";
    public static final String CEP = "cep";
    public static final String ESTADO = "estado";
    
    /*Dados Empresa*/
    public static final String EMPRESA = "empresa";
    public static final String RUA_EMP = "rua_emp";
    public static final String COMPLEMENTO_EMP = "complemento_emp";
    public static final String CIDADE_EMP = "cidade_emp";
    public static final String CEP_EMP = "cep_emp";
    public static final String ESTADO_EMP = "estado_emp";

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter resposta = response.getWriter();
				
		String nomeUsuario = request.getParameter(NOME);
		String sobrenomeUsuario = request.getParameter(SOBRENOME);
		String ruaUsuario = request.getParameter(RUA);
		String complementoUsuario = request.getParameter(COMPLEMENTO);
		String cidadeUsuario = request.getParameter(CIDADE);
		String cepUsuario = request.getParameter(CEP);
		String estadoUsuario = request.getParameter(ESTADO);
		
		String empresa = request.getParameter(EMPRESA);
		String ruaEmpresa = request.getParameter(RUA_EMP);
		String complementoEmpresa = request.getParameter(COMPLEMENTO_EMP);
		String cidadeEmpresa = request.getParameter(CIDADE_EMP);
		String cepEmpresa = request.getParameter(CEP_EMP);
		String estadoEmpresa = request.getParameter(ESTADO_EMP);
		
		
			HttpSession sessao = request.getSession();
			/*Verificando se os atributos de dados pessoais ja foram preenchidos*/
			if (nomeUsuario != null && sobrenomeUsuario != null && ruaUsuario != null && complementoUsuario != null 
					&& !nomeUsuario.isEmpty() && !sobrenomeUsuario.isEmpty() && !ruaUsuario.isEmpty() && !complementoUsuario.isEmpty()) {
				sessao.setAttribute(NOME, nomeUsuario);
				sessao.setAttribute(SOBRENOME, sobrenomeUsuario);
				sessao.setAttribute(RUA, ruaUsuario);
				sessao.setAttribute(COMPLEMENTO, complementoUsuario);
				sessao.setAttribute(CIDADE, cidadeUsuario);
				sessao.setAttribute(CEP, cepUsuario);
				sessao.setAttribute(ESTADO, estadoUsuario);
			}
			/*Verificando se os dados da empresa foram preenchidos, 
			 * caso nao tenham sido preenchidos ira redirecionar para cadastro1.jsp*/
			if (empresa != null && ruaEmpresa != null && complementoEmpresa != null 
					&& !empresa.isEmpty() && !ruaEmpresa.isEmpty() && !complementoEmpresa.isEmpty()) {
				sessao.setAttribute(EMPRESA, empresa);
				sessao.setAttribute(RUA_EMP, ruaEmpresa);
				sessao.setAttribute(COMPLEMENTO_EMP, complementoEmpresa);
				sessao.setAttribute(CIDADE_EMP, cidadeEmpresa);
				sessao.setAttribute(CEP_EMP, cepEmpresa);
				sessao.setAttribute(ESTADO_EMP, estadoEmpresa);
				
				response.sendRedirect(request.getContextPath()+ "/MostraCadastro");
			}else {
				response.sendRedirect(request.getContextPath()+ "/cadastro1.jsp");
			}
			
	}

}
