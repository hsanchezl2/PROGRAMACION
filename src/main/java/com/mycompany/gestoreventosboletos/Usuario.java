/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.gestoreventosboletos;

/**
 *
 * @author PC
 */
public class Usuario {
    private String nombreUsuario;
    private String contrasena;
    private String rol;
    private boolean estado;

    // Constructor
    public Usuario(String nombreUsuario, String contrasena, String rol, boolean estado) {
        this.nombreUsuario = nombreUsuario;
        this.contrasena = contrasena;
        this.rol = rol;
        this.estado = estado;
    }

    Usuario(String user1, String admin, boolean b) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    // Métodos getters y setters
    public String getNombreUsuario() {
        return nombreUsuario;
    }

    public void setNombreUsuario(String nombreUsuario) {
        this.nombreUsuario = nombreUsuario;
    }

    public String getContrasena() {
        return contrasena;
    }

    public void setContrasena(String contrasena) {
        this.contrasena = contrasena;
    }

    public String getRol() {
        return rol;
    }

    public void setRol(String rol) {
        this.rol = rol;
    }

    public boolean isEstado() {
        return estado;
    }

    public void setEstado(boolean estado) {
        this.estado = estado;
    }
    //método permite cambiar la contraseña del usuario.
    public void cambiarContrasena(String nuevaContrasena) {
    this.contrasena = nuevaContrasena;
}
    //método permite cambiar el rol del usuario.
    public void cambiarRol(String nuevoRol) {
    this.rol = nuevoRol;
}
    //método permite cambiar el estado del usuario (activo o inactivo).
    public void cambiarEstado(boolean nuevoEstado) {
    this.estado = nuevoEstado;
}
    //método valida si la contraseña del usuario es válida.
    public boolean validarContrasena(String contrasenaIngresada) {
    if (contrasenaIngresada.equals(this.contrasena)) {
        return true;
    } else {
        return false;
    }
}
}
