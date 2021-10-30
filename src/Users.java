import java.sql.*;  
public class Users {

	public static void main(String[] args) {
		try{ 
			
			Class.forName("com.mysql.cj.jdbc.Driver");
		//	Class.forName("com.mysql.jdbc.Driver");  
			Connection con= DriverManager.getConnection(  
			"jdbc:mysql://localhost:3306/collectionhub","Dallington","Dallington100");  
	
			Statement stmt = con.createStatement();  
			ResultSet rs=stmt.executeQuery("select * from users");  
			while(rs.next()) {
				
			int id = rs.getInt("id");
	        String firstName = rs.getString("first_name");
	        String lastName = rs.getString("last_name");
	        
	        String name = rs.getString("name");
	        String username = rs.getString("username");
	        String telephone_no = rs.getString("tel_no");
	        String address = rs.getString("address");
	      
	        
	        Date dateCreated = rs.getDate("created_at");
	        boolean isActive = rs.getBoolean("isActive");
	        int user_role = rs.getInt("user_role");
	        
	        System.out.format("%s, %s, %s, %s, %s, %s, %s, %s, %s\n", id, 
	        		firstName, lastName, dateCreated, isActive, user_role, name, username, telephone_no, address);
		  }
				
			System.out.println(rs.getInt(1)+"  "
					+ ""+rs.getString(2)+"  "+rs.getString(3));  
			con.close();  
			}catch(Exception e){ System.out.println(e);}  
			}  

	}


