package com.epam.carsharing.entity.model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.ArrayDeque;
import java.util.Queue;

public class ConnectionPool {
    private static volatile ConnectionPool uniqueInstance;
    Queue<Connection> availableConnections = new ArrayDeque<>();
    private String url;

    private ConnectionPool(String url, String driver, int connectionsCount) {
        try {
            Class.forName(driver);
        } catch (Exception e) {
            System.out.println("Connection Driver not found");
        }
        this.url = url;
        for (int i = 0; i < connectionsCount; i++) {
            availableConnections.add(getConnect());
        }
    }

    public Connection getConnect() {
        Connection con = null;
        try {
            con = DriverManager.getConnection(url);
            System.out.println("Connected!");
        } catch (SQLException e) {
            e.printStackTrace();
            System.out.println("Don't connected!");
        }
        return con;
    }

    public static ConnectionPool getUniqueInstance() {
        if(uniqueInstance == null){
            uniqueInstance = new ConnectionPool("jdbc:mysql://localhost:3306/crm?autoReconnect=true&useSSL=false&useLegacyDatetimeCode=false&serverTimezone=UTC root root", "com.mysql.cj.jdbc.Driver", 15);
        }
        return uniqueInstance;
    }
}