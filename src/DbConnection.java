import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;




public class DbConnection {
	
	public static void main(String[] args) {
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			System.out.println("Driver loded");
			final String url="jdbc:mysql://localhost:3306/management";
			final String username="root";
			final String password="Swati27";
			
			Connection connection=DriverManager.getConnection(url,username, password);
			System.out.println("connected with database");
			
			Statement stmt=connection.createStatement();
			String query="select * from customer";
			
			ResultSet rs=stmt.executeQuery(query);
			while(rs.next()){
				System.out.println("id"+ rs.getInt("cust_id"));
				System.out.println("name"+ rs.getString("cust_name"));
				System.out.println("mobnum"+ rs.getString("cust_mob"));
				
			}
			
			
			
		}catch(Exception e){
			System.out.println(e);
			
		}
	}

}
