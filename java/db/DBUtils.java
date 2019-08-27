package db;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class DBUtils {
	 public static PreparedStatement getPreparedStatement(String sql) throws ClassNotFoundException, SQLException{

	        Class.forName("com.microsoft.jdbc.sqlserver.SQLServerDriver");
	        String url = "jdbc:sqlserver://localhost:3306;databaseName=Employee";
	        String user = "root";
	        String pass = "root";
	        
	        Connection con = DriverManager.getConnection(url, user, pass);
	        PreparedStatement ps = con.prepareStatement(sql);
	        return ps;
	    }
	    
	    //Check connections.
    public static void main(String[] args) throws ClassNotFoundException, SQLException {
	       getPreparedStatement("select * form Employee");
	   }
}
