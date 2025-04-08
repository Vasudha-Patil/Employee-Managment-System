package employee.management.system;

import java.sql.*;
import java.sql.Statement;


public class conn {
       Connection connection;
       Statement statement;
       public conn(){
              try{
                     Class.forName("com.mysql.cj.jdbc.Driver");
                     connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/employeemanagement","root","PHW#84#jeor");
                     statement = connection.createStatement();

              }catch(Exception e){
                     e.printStackTrace();
              }
       }

}
