package org.example.endmodule3_3.database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DbConnect {
    private final static String jdbcURL = "jdbc:mysql://localhost:3306/library?useSSL=false";
    private final static String jdbcUserName = "root";
    private final static String jdbcPassword = "rambolun190";

    public Connection getConnection(){
        Connection connection = null;
        try {
            Class.forName("com.mysql.jdbc.Driver");
            connection = DriverManager.getConnection(jdbcURL,jdbcUserName,jdbcPassword);
        } catch (ClassNotFoundException e) {
            System.out.println("----------loi ket noi----------");
        } catch (SQLException e) {
            System.out.println("----------loi ket noi============");
        }
        return connection;
    }
}
