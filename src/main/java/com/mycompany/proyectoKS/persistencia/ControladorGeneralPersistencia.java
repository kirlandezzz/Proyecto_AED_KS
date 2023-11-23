/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.proyectoKS.persistencia;

import com.mycompany.proyectoKS.modelo.Usuario;
import com.mycompany.proyectoKS.persistencia.exceptions.NonexistentEntityException;
import java.util.List;

/**
 *
 * @author Kirill
 */
public class ControladorGeneralPersistencia {
    UsuarioJpaController jpaUsuario = new UsuarioJpaController();

    public void crearUsuario(Usuario usuario) {
        jpaUsuario.create(usuario);
    }
    
    public void eliminarUsuario(int usuario) throws NonexistentEntityException {
        jpaUsuario.destroy(usuario);
    }
    
    public boolean vereficarUsuarioClave(String nombre, String clave) {
        List<Usuario> usuarios = jpaUsuario.findUsuarioEntities();
        for (Usuario usuario : usuarios) {
            if (nombre.equals(usuario.getNombreU()) && clave.equals(usuario.getClave())) {
                return true;
            }
        }
        return false;
    }
}
