package org.example;

import org.junit.Assert;

import java.sql.*;

public class MySqlConnection {
    public static void main(String[] args) throws SQLException {

        String dbUrl = "jdbc:mysql://localhost:3306/emp";
        String un = "root";
        String password = "arnob5055";

        Connection connection = DriverManager.getConnection(dbUrl, un, password);
        String query ="select*from employee where name= 'kabir'";
        Statement stm = connection.createStatement();
        ResultSet rst= stm.executeQuery(query);
         String name = null;
        while(rst.next()){
          name = stm.getResultSet().getString("name");
          String age =stm.getResultSet().getString("age");
          System.out.println(name+" "+age);
        }
        connection.close();
        Assert.assertEquals("kabir", name);

    }
}
