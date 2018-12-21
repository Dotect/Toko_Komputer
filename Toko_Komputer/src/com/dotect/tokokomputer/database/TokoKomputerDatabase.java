/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.dotect.tokokomputer.database;

import com.mysql.jdbc.Connection;
import com.mysql.jdbc.jdbc2.optional.MysqlDataSource;
import java.sql.SQLException;


/**
 *
 * @author YOGA
 */
public class TokoKomputerDatabase {
    private static Connection connection;
    
    public static Connection getConnection() throws SQLException{
        if (connection==null) {
            
            MysqlDataSource dataSource = new MysqlDataSource();
            dataSource.setURL("jdbc:mysql://localhost:3306/toko_komputer");
            dataSource.setUser("root");
            dataSource.setPassword("");
            connection = (Connection) dataSource.getConnection();
        }
        
        return connection;
    }
}
