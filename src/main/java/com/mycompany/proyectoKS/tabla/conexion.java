/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.proyectoKS.tabla;

/**
 *
 * @author Kirill
 */

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;

public class conexion {

    // Declaramos la conexion a mysql
    public static Connection con;
    // Declaramos los datos de conexion a la bd
    private static final String driver = "com.mysql.jdbc.Driver";
    private static final String user = "sa";
    private static final String pass = "@Contraseña1";
    private static final String url = "jdbc:sqlserver://192.168.56.102:1433;databaseName=MusicInstruments;TrustServerCertificate=true";

    // Funcion que va conectar a mi bd de mysql
    public Connection conectar() {
        con = null;
        try {
            con = (Connection) DriverManager.getConnection(url, user, pass);
            if (con != null) {
                
            }
        } catch (SQLException e) {
           JOptionPane.showMessageDialog(null, "Error" + e.toString());
        }
        return con;
    }
}
