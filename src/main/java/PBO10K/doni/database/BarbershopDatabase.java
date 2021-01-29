/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PBO10K.doni.database;

import PBO10K.doni.service.PelangganDao;
import PBO10K.doni.impl.PelangganDaoImpl;

import java.sql.DriverManager;
import java.sql.Connection;
import java.sql.SQLException;

/**
 * @author 
 * 
 * Nama : T DONI
 * NIM : 10119907
 * Kelas : IF10K
 * Latihan MVC - DATABASE
 */
public class BarbershopDatabase {
    private static Connection connection;
    private static PelangganDao pelangganDao;
    
    public static Connection getConnection() throws ClassNotFoundException, SQLException {
        if (connection == null){
            Class.forName("com.mysql.jdbc.Driver");
            connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/kingsbarbershop", "root", "");
        }
        return connection;
    }
    
    public static PelangganDao getPelangganDao() throws SQLException, ClassNotFoundException{
        if (pelangganDao==null){
            pelangganDao = new PelangganDaoImpl(getConnection());
        }       
        return pelangganDao;
    }
}
