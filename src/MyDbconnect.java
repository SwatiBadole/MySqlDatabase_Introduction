import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class MyDbconnect {

	public static void main(String[] args) throws SQLException {

			
			   try {
				   //1st step
				   Class.forName("com.mysql.cj.jdbc.Driver");
				   System.out.println("Driver loded");
				   Connection	 connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/demodb", "root", "Swati27");
				   
				   
								
				System.out.println("Connected With database successfully");
				
				} catch (Exception e) {
					System.out.println(e);
				
				System.out.println("Error while connecting to the database");
			
					}
			

	}

}
