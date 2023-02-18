package com.example.pruebaNahuel;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

    public class H2Database {

        public static Connection getConnection() throws SQLException {
            return DriverManager.getConnection("jdbc:h2:mem:test");
        }

    }


