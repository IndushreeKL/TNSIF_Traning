package org.tnsif.acce.c2tc.JdbcDemo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class postgreJDBC {

    public static void main(String[] args) {

        String jdbcUrl = "jdbc:postgresql://localhost:5432/postgres";
        String username = "postgres";
        String password = "kannu";

        try (Connection conn = DriverManager.getConnection(
                jdbcUrl, username, password)) {

            System.out.println("Connected to the database!");

        } catch (SQLException e) {

            System.out.println("Connection failed!");
            e.printStackTrace();
        }
    }
}