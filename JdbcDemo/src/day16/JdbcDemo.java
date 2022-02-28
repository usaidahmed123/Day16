package day16;

import java.sql.*; // Step 1 import 

public class JdbcDemo {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		Class.forName("com.mysql.cj.jdbc.Driver");// step 2  class loader 
		
		
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/asd","root", "usaid");//step 3 create connection
		
		Statement st = con.createStatement();// step 4
		//String query = "create table student(ID int primary key,SName varchar(20), SMarks int)";//step 6
		
		//String query = "insert into student values(1,'yuv',20)";
		//String query = "insert into student values(456,'jawad',28)";
		//String query = "insert into student values(6,'nadeem',2)";
		String query = "UPDATE student SET SName = 'Aaliyar', SMarks = 555 WHERE ID = 6";
		 
		st.executeUpdate(query);//steps 7
		System.out.println("Student Table created successfully");
		
		//System.out.println("Row inserted successfully");
		
	st.close();
	con.close();
	}

}


