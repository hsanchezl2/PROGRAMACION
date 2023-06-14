/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.gestoreventosboletos;

/**
 *
 * @author PC
 */
public class Responsable {
    private String nombre;
    private String email;
    private String telefono;

    // Constructor
    public Responsable(String nombre, String email, String telefono) {
        this.nombre = nombre;
        this.email = email;
        this.telefono = telefono;
    }

    // Métodos getters y setters
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }
    //método envía un correo electrónico al responsable.
    public void enviarCorreo(String asunto, String mensaje) {
    // Código para enviar correo electrónico al responsable
    
   
}
}


