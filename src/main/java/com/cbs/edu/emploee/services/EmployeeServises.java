package com.cbs.edu.emploee.services;

import com.cbs.edu.emploee.dao.DAOFactory;
import com.cbs.edu.emploee.dao.EmployeeDAO;
import com.cbs.edu.emploee.entity.Employee;

import java.sql.Connection;
import java.sql.PreparedStatement;
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
        PreparedStatement preparedStatement;
        return null;
    }

    public void update(Employee employee) {

    }

    public void remove(int id) {

    }
}
