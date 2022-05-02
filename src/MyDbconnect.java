import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.mysql.cj.protocol.Resultset;
import com.mysql.cj.xdevapi.Statement;

public class MyDbconnect {

	public static void main(String[] args) throws SQLException {

			
			   try  {
				   //1st step
				   Class.forName("com.mysql.cj.jdbc.Driver");
				   System.out.println("Driver loded");
				  
				   //2nd step
				   
				   final String dbname="payroll_services";
				   String url="jdbc:mysql://localhost:3306/payroll_services";
				   System.out.println(url);
				   final String username="root";
				   final String password="Swati27";
				 //  Connection	 connection = DriverManager.getConnection(url,username,password);
				  //2nd Connection DB
					Connection con_w = DriverManager.getConnection(url, username, password);
					System.out.println("connected with db(data base)");
					
					//3nd Create statement
					
					java.sql.Statement stmt = con_w.createStatement();
					String query ="select * from employee_payroll";
					
					//4th execute query and get result
					
					ResultSet rs = stmt.executeQuery(query);
					while(rs.next()) {
						System.out.println("--------------------");
						System.out.println("Id "+ rs.getInt("ID"));
						System.out.println("Name "+ rs.getString("NAME"));
						System.out.println("Phonenum "+ rs.getString("phone_number"));
						System.out.println("Address "+ rs.getString("ADDRESS"));
						//System.out.println("SALARY "+ rs.getBigDecimal("SALARY"));
					}
								
				System.out.println("Connected With database successfully");
				
				} catch (Exception e) {
					System.out.println(e);
					e.printStackTrace();
				
				System.out.println("Error while connecting to the database");
			
					}
			

	}

}
