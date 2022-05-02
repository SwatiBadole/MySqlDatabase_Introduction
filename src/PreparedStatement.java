import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
public class PreparedStatement {
	public static void main(String[] args) {
	      String JdbcURL = "jdbc:mysql://localhost:3306/sample?useSSL=false";
	      String Username = "root";
	      String password = "Swati27";
	      Connection con = null;
	      AutoCloseable pstmt = null;
	      ResultSet rst = null;
	      String myQuery = "select Id,Name,Age from JavaPreparedStatement";
	      try {
	         con = DriverManager.getConnection(JdbcURL, Username, password);
	         pstmt = con.prepareStatement(myQuery);
	         rst = ((java.sql.PreparedStatement) pstmt).executeQuery();
	         System.out.println("Id\t\tName\t\tAge\n");
	         while(rst.next()) {
	            System.out.print(rst.getInt(1));
	            System.out.print("\t\t"+rst.getString(2));
	            System.out.print("\t\t"+rst.getInt(3));
	            System.out.println();
	         }
	      } catch(Exception exec) {
	         exec.printStackTrace();
	      }
	   }

	private ResultSet executeQuery() {
		// TODO Auto-generated method stub
		return null;
	}

}
