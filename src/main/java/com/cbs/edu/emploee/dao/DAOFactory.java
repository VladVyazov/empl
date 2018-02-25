package com.cbs.edu.emploee.dao;

import java.sql.Connection;

public interface DAOFactory {

    Connection getConnection();
    EmployeeDAO getEmpoyeeDao();

}
