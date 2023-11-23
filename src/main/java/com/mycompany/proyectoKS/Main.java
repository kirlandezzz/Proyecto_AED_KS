/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.mycompany.proyectoKS;

import com.mycompany.proyectoKS.vistas.VentanaPrincipal;
import javax.swing.JOptionPane;

/**
 *
 * @author Kirill
 */
public class Main {

    public static void main(String[] args) {
        JOptionPane.showMessageDialog(null, "Bienvenido a Musical Shop!");
        VentanaPrincipal ventana = new VentanaPrincipal();
        ventana.setVisible(true);
    }
}
