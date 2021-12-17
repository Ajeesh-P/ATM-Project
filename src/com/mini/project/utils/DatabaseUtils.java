/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mini.project.utils;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author AJEESH
 */
public class DatabaseUtils {
    private Connection dbConnection;
    
    public Connection getDbConnection() {
        try {
            dbConnection = DriverManager.getConnection("jdbc:mysql://localhost:3306/atm-system", "root", null);
        } catch (SQLException ex) {
            System.out.println("Exception in SQL Connection");
            ex.printStackTrace();
        }
        return dbConnection;
    }
}
