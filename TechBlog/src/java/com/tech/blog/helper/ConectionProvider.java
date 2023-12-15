
package com.tech.blog.helper;
import java.sql.*;

/**
 *
 * @author 91850
 */
public class ConectionProvider {
    private static Connection con;
    public static Connection getConnection(){
      try{
      //driver class load
      if(con==null){
          Class.forName("com.mysql.jdbc.Driver");
          //create a connection
      con=DriverManager.getConnection("jdbc:mysql://localhost:3306/techblog","root","root");
      }
      }catch(Exception e){
          e.printStackTrace();
          
      }
      return con;
    }
    
}
