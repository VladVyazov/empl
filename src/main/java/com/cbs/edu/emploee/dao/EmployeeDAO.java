package com.cbs.edu.emploee.dao;

import com.cbs.edu.emploee.entity.Employee;

import java.util.List;

public interface EmployeeDAO {
    //Create
    void add(Employee employee);
    //Read
    List<Employee> getAll();
    Employee getById(int id);
    //Update
    void update(Employee employee);
    //Delete
    void remove(int id);
}
