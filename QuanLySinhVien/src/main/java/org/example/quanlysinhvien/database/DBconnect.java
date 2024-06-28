package org.example.quanlysinhvien.database;

import java.sql.Connection;
import java.sql.DriverManager;

public class DBconnect {
    private static final String url = "jdbc:mysql://localhost:3306/StudentManager";
    private static final String userName = "root";
    private static final String passWord = "abc";

    public static Connection getConnection() {
        try {
            Class.forName("com.mysql.jdbc.Driver");
            return DriverManager.getConnection(url, userName, passWord);
        } catch (Exception e) {
            return null;
        }
    }
}
