/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.mycompany.jalaton.Conexion;

import java.sql.Connection;
import java.sql.DriverManager;


/**
 *
 * @author Jesus A
 */
public class Test {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

    String hostname = "ellanoteama.c98oaoqamb01.us-east-1.rds.amazonaws.com";
    String jdbcUrl = "jdbc:mysql://" + hostname + ":3306/prubea";
    String user = "admin";
    String password = "ellanoteama";
    Connection con = null;
    
        try {
            con = DriverManager.getConnection(jdbcUrl, user, password);
            if (con != null){
                System.out.println("test");
            }
        } catch (Exception e) {
            System.out.println("error test" + e);
        }
    
    }
}
