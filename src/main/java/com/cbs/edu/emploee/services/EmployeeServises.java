package com.cbs.edu.emploee.services;

import com.cbs.edu.emploee.dao.DAOFactory;
import com.cbs.edu.emploee.dao.EmployeeDAO;
import com.cbs.edu.emploee.entity.Employee;

import java.sql.Connection;
import java.util.List;

public class EmployeeServises implements EmployeeDAO {


    public void add(Employee employee) {
        Connection connection = FactoryServices.getInstance().getConnection();

    }

    public List<Employee> getAll() {
        return null;
    }

    public Employee getById(int id) {
        return null;
    }

    public void update(Employee employee) {

    }

    public void remove(int id) {

    }
}
