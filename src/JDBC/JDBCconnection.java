package JDBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class JDBCconnection {
    //private static String username;

    public static void main(String[] args) {
        // Database URl
        String url="jdbc:mysql://localhost:3306/students";
        // Database credentials
        String user ="root";
        String password="2005";

        try(Connection connection = DriverManager.getConnection(url,user,password)){

            System.out.println("connected to the mysql is successfully");
            System.out.println(connection);
        }
        catch(SQLException e){
            System.err.println("Connection failed:" + e.getMessage());
        }
    }
}
