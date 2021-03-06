package Database;
//STEP 1. Import required packages
import ClassFiles.*;
import ClassFiles.Time;

import java.sql.*;

public class AccessStudent {
 // JDBC driver name and database URL
	static  String JDBC_DRIVER=null;
	static  String DB_URL=null;
	static  String USER=null;
	static  String PASS =null;
	Connection conn = null;
	 Statement stmt = null;
	public AccessStudent(){
JDBC_DRIVER = "com.mysql.jdbc.Driver";  
 DB_URL = "jdbc:mysql://localhost/students";

 //  Database credentials
 USER = "root";
PASS = "Dvaib2207";
//STEP 2: Register JDBC driver
try{
Class.forName("com.mysql.jdbc.Driver");

//STEP 3: Open a connection
// System.out.println("Connecting to a selected database...");
conn = DriverManager.getConnection(DB_URL, USER, PASS);
// System.out.println("Connected database successfully...");

//STEP 4: Execute a query
//System.out.println("Creating statement...");
stmt = conn.createStatement();
}
catch(Exception e){
	
}
	}
public int getYear(int id, Student_Profile student) {
	int enroll =0;
 
 try{
    String sql = "SELECT enrolled_year FROM student WHERE  id="+id;
    //System.out.println(sql);
   // System.out.println(sql);
    ResultSet rs = stmt.executeQuery(sql);
    //STEP 5: Extract data from result set
    
    while(rs.next()){
        //Retrieve by column name
    	enroll =  rs.getInt("enrolled_year");
     }
   // rs.close();
 }catch(SQLException se){
    //Handle errors for JDBC
    se.printStackTrace();
 }catch(Exception e){
    //Handle errors for Class.forName
    e.printStackTrace();
 }finally{
    //finally block used to close resources
	 return enroll;
 }//end try
 //System.out.println("Goodbye!");
}//end main
}//end AccessStudent