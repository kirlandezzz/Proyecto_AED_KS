/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.proyectoKS.modelo;

import com.mycompany.proyectoKS.persistencia.ControladorGeneralPersistencia;
import com.mycompany.proyectoKS.persistencia.exceptions.NonexistentEntityException;

/**
 *
 * @author Kirill
 */
public class ControladorGeneralModelo {
    ControladorGeneralPersistencia enlaceModeloPersistencia = new ControladorGeneralPersistencia();
    
    public void crearUsuario(Usuario usuario) {
        enlaceModeloPersistencia.crearUsuario(usuario);
    }
    
    public void eliminarUsuario(int usuario) throws NonexistentEntityException {
        enlaceModeloPersistencia.eliminarUsuario(usuario);
    }
    
    public boolean verificarUsuarioClave(String nombre, String clave) {
        return enlaceModeloPersistencia.vereficarUsuarioClave(nombre, clave);
    }
}
