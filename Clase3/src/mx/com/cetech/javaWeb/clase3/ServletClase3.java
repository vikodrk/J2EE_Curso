package mx.com.cetech.javaWeb.clase3;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.log4j.Logger;

public class ServletClase3 extends HttpServlet {


	/**
	 * 
	 */
	private static final long serialVersionUID = 2302347724301043922L;
	
	private static final Logger LOG = Logger.getLogger(ServletClase3.class);

	@Override
	public void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

		LOG.info("Entrando a metodo get");
		LOG.info("Incoming info.. \nUsuario:\t" + req.getParameter("user") + "\nPassword:\t"
				+ req.getParameter("password"));

	}

}
