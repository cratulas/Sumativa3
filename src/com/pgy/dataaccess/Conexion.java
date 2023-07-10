/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.pgy.dataaccess;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Conexion {
    
    public static Connection getConexion() {
        
        try{
            Connection con = (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/westbank","root","Cratulas2021.");
            return con;
        } catch (SQLException e){
            System.out.println(e.toString());
            return null;
        }
    }
}