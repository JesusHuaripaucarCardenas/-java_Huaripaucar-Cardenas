/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package db;

import java.sql.Connection;
import java.sql.DriverManager;

/**
 *
 * @author User17
 */
public class Conexion {
    
        String hostname = "ellanoteama.c98oaoqamb01.us-east-1.rds.amazonaws.com";
        String jdbcUrl = "jdbc:mysql://" + hostname + ":3306/CODESOLUTIONS";
        String user = "admin";
        String password = "ellanoteama";

        Connection con;
    
        public Conexion() {
        
            try {
                con = DriverManager.getConnection(jdbcUrl, user, password);
            } catch (Exception e) {
                System.out.println("error coenxion");
            }
            
        }
    
        public Connection getConexion() {
            return con;
        
        }
}
