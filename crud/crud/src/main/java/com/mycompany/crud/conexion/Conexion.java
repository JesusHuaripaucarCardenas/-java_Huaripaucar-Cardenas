/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.crud.conexion;

import java.sql.Connection;
import java.sql.DriverManager;

/**
 *
 * @author USUARIO
 */
public class Conexion {

    String hostname = "poocrud.c98oaoqamb01.us-east-1.rds.amazonaws.com";
    String jdbcUrl = "jdbc:mysql://" + hostname + ":3306/Basedata";
    String user = "admin";
    String password = "angelo2024";
    Connection con;

    public Conexion() {

        try {
            con = DriverManager.getConnection(jdbcUrl, user, password);
        } catch (Exception e) {
            System.out.println("Error en la clase conexion: " + e);
        }
    }

    public Connection getConexion() {
        return con;
    }
}
