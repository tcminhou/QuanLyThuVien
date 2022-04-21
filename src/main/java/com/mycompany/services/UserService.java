/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.services;

import com.mycompany.conf.JdbcUtils;
import com.mycompany.conf.Utils;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import javafx.scene.control.Alert;

/**
 *
 * @author PC
 */
public class UserService {
    public static Boolean login(String name, String pass) throws SQLException{
        Boolean log = false;
    
        if(name.equals("") && pass.equals("") || name.equals("") || pass.equals(""))
            return log;
        else{
            try(Connection conn = JdbcUtils.getConn()){
                String sql = new String("SELECT * FROM username_password WHERE UserName=? AND Password=?");
                PreparedStatement stm = conn.prepareStatement(sql);
                stm.setString(1, name);
                stm.setString(2, pass);
                ResultSet rs = stm.executeQuery();
                if(rs.next())
                    log=true;
            }
        }
        return log;
    }
}
