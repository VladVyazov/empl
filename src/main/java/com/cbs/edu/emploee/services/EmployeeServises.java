package com.cbs.edu.emploee.services;

import com.cbs.edu.emploee.dao.EmployeeDAO;
import com.cbs.edu.emploee.entity.Employee;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

public class EmployeeServises implements EmployeeDAO {


    public void add(Employee employee) {
        Connection connection = FactoryServices.getInstance().getConnection();
        PreparedStatement preparedStatement;


    }

    public List<Employee> getAll() {
        return null;
    }

    public Employee getByLogin(String login) {
        Connection connection = FactoryServices.getInstance().getConnection();
        Employee employee = new Employee();
        try (PreparedStatement preparedStatement = connection.prepareStatement(
                "SELECT id FROM emploee WHERE login = ?")){
            preparedStatement.setString(1, login);
            ResultSet resultSet = preparedStatement.executeQuery();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;
    }

    public void update(Employee employee) {

    }

    public void remove(int id) {

    }
}
