package com.cbs.edu.emploee;

import com.cbs.edu.emploee.dao.DAOFactory;
import com.cbs.edu.emploee.services.FactoryServices;

public class Main {
    public static void main(String[] args) {
        DAOFactory fs = FactoryServices.getInstance();
        fs.getConnection();

    }
}
