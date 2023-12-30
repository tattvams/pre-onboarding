import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class JavaDBC {
	//1.11
	public static void main(String[] args) throws SQLException {
	    final String JDBC_URL = "jdbc:mysql://127.0.0.1:3306/webapp?";
	    final String USERNAME = "root";
	    final String PASSWORD = "pass123";
	    
		Connection con = null;
		PreparedStatement pst = null;
        con = DriverManager.getConnection(JDBC_URL, USERNAME, PASSWORD);
        pst = con.prepareStatement("SELECT * FROM users ");
        ResultSet rs = pst.executeQuery();
        while(rs.next()) {
        	System.out.println(rs.getString(2));
        }
        con.close();
	}

}
