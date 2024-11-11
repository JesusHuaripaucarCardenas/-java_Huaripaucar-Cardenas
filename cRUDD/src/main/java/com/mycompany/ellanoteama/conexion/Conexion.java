/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ellanoteama.conexion;

import java.sql.Connection;
import java.sql.DriverManager;

/**
 *
 * @author Lab24
 */
public class Conexion {
    
    Connection con;
    
    String hostname = "ellanoteama.c98oaoqamb01.us-east-1.rds.amazonaws.com";
    String jdbcUrl = "jdbc:mysql://" + hostname + ":3306/pepito";
    String user = "admin";
    String password = "ellanoteama";

    public Conexion() {

        try {
            con = DriverManager.getConnection(jdbcUrl, user, password);
        } catch (Exception e) {
            System.out.println("Error en la clase conexion: " + e);
        }
    }

    public Connection getConnection() {
        return con;
    }
}