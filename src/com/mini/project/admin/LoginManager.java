/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mini.project.admin;

import com.mini.project.utils.DatabaseUtils;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author AJEESH
 */
public class LoginManager {
    public boolean validateLogin(String username, String password) throws SQLException {
        if(username.isEmpty() || username.equals("") || password.isEmpty() || password.equals("")){
            return false;
        } else{
            DatabaseUtils databaseUtils = new DatabaseUtils();
            Connection connection = databaseUtils.getDbConnection();
            Statement statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery("select * from adminusers where username = '" + username + "' and password = '" + password +"'");
            if(resultSet.next()){
                return true;
            } else{
                return false;
            }
        }
    }
}
