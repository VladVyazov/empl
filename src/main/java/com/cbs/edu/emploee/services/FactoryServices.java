package com.cbs.edu.emploee.services;

import com.cbs.edu.emploee.dao.DAOFactory;
import com.cbs.edu.emploee.dao.EmployeeDAO;

import java.sql.*;
import java.sql.DriverManager;
import java.sql.SQLException;

public class FactoryServices implements DAOFactory {
    private static final String DB_DRIVER = "com.mysql.jdbc.Driver";
    private static final String DB_URL = "jdbc:mysql://localhost:3306/work";
    private static final String DB_LOGIN = "root";
    private static final String DB_PASSWORD = "root";

    private static DAOFactory factory;


    private FactoryServices() {
        try {
            Class.forName(DB_DRIVER);
            System.out.println("Driver OK");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }

    public static synchronized DAOFactory getInstance() {
        if (factory == null) {
            factory = new FactoryServices();
        }
        return factory;
    }

    public Connection getConnection() {
        Connection connection = null;

        try {
            connection = DriverManager.getConnection(DB_URL, DB_LOGIN, DB_PASSWORD);
            System.out.println("Connection OK!");
            return connection;
        } catch(SQLException e) {
            e.printStackTrace();
        }

        return connection;
    }



    public EmployeeDAO getEmpoyeeDao() {
        return new  EmployeeServises();
    }
}
