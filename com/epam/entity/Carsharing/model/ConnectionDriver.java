package com.epam.carsharing.entity.model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

class ConnectionDriver {
    private String username = "root";
    private String password = "root";
    private String url = "jdbc:mysql://localhost:3306/crm?autoReconnect=true&useSSL=false&useLegacyDatetimeCode=false&serverTimezone=UTC";
    private String driver = "com.mysql.cj.jdbc.Driver";

    public Connection getConnect() {
        Connection con = null;
        try {
            con = DriverManager.getConnection(url, username, password);
            System.out.println("Connected!");
        } catch (SQLException e) {
            e.printStackTrace();
            System.out.println("Don't connected!");
        }
        return con;
    }
}

