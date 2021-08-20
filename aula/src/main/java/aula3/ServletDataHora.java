package aula3;

import java.util.Date;
import java.io.IOException;
import java.io.PrintWriter;
import java.text.SimpleDateFormat;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class DataEHora
 */
@WebServlet("/DataEHora")
public class ServletDataHora extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	private SimpleDateFormat format = new SimpleDateFormat("dd/MM/yyyy - hh:mm:ss");
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ServletDataHora() {
        super();
        // TODO Auto-generated constructor stub
    }
    
    @Override
    public void init() throws ServletException {
    	// TODO Auto-generated method stub
    	super.init();
    	log("ServletDataEHora iniciado as: " + format.format(new Date()));
    }
    
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
    	
    	PrintWriter saida = response.getWriter();
		
		saida.write("<HTML><Body>A data/hora atual e: ");
		saida.write(format.format(new Date()));
		saida.write("</Body></HTML>");
		saida.close();
    }
    @Override
    public void destroy() {
    	log("ServletDataEHora finalizado as: " + format.format(new Date()));
    	super.destroy();
    }

}
