package mx.com.cetech.javaWeb.clase3;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import org.apache.log4j.Logger;

public final class DataBaseConnectionFactory {
	
	private static final Logger LOG = Logger.getLogger(DataBaseConnectionFactory.class);
	
	private static final String DB_URL = "jdbc:mysql://107.180.50.237:3306/gymControl";
	
	private static final String DB_USER="adminSystem";
	
	private static final String DB_PWD="adminSystem91";
	
	private DataBaseConnectionFactory()
	{
		
	}
	
	public static final Connection obtainConnection(){
		Connection con = null;
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");//
			con = DriverManager.getConnection(DB_URL, DB_USER, DB_PWD);
		} catch (SQLException e) {
			LOG.error("Error while creating DB Connection...\n", e);
		} catch (ClassNotFoundException e) {
			LOG.error("Error loading driver...\n",e);
		}
		
		return con;
	}
	

}
