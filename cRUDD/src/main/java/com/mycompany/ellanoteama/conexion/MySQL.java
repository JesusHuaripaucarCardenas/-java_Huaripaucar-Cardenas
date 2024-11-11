/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.mycompany.ellanoteama.conexion;

import java.sql.Connection;
import java.sql.DriverManager;

/**
 *
 * @author Lab24
 */
public class MySQL {

    public static void main(String[] args) {
        String hostname = "ellanoteama.c98oaoqamb01.us-east-1.rds.amazonaws.com";
        String jdbcUrl = "jdbc:mysql://" + hostname + ":3306/pepito";
        String user = "admin";
        String password = "ellanoteama";
        Connection con = null;
        try {
            con = DriverManager.getConnection(jdbcUrl, user, password);
            if (con != null) {
                System.out.println("conexion exitosa");
            }
        } catch (Exception e) {
            System.out.println("Error de conexion: " + e);
        }
    }

}
