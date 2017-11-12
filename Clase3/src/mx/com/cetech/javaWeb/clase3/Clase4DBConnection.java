package mx.com.cetech.javaWeb.clase3;

import java.io.IOException;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.log4j.Logger;

public class Clase4DBConnection extends HttpServlet {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = -2631468897146851460L;
	private static final Logger LOG = Logger.getLogger(Clase4DBConnection.class);
	
	@Override
	public void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		Connection conn = DataBaseConnectionFactory.obtainConnection();
		if(conn==null){
			req.setAttribute("error", true);
		}
		else
		{
			req.setAttribute("success", true);
			try {
				Statement st=conn.createStatement();
				StringBuilder builder = new StringBuilder(); //
				ResultSet rs = st.executeQuery("SELECT COUNT(*) FROM Usuarios");
				while(rs.next()){
				int size = rs.getInt(1);
					builder.append(size).append(" - ");
				}
				req.setAttribute("message", builder.toString());//
				rs.close();
				st.close();
				conn.close();				
			} catch (SQLException e) {
				LOG.error(e.getMessage(),e);
				req.setAttribute("error", true);
				req.setAttribute("message", e.getLocalizedMessage());
			}
			
		}
		req.getRequestDispatcher("/info.jsp").forward(req, resp);
	}

}
