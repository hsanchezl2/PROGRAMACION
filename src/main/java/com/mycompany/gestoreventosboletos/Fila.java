/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.gestoreventosboletos;

import java.util.ArrayList;

/**
 *
 * @author PC
 */
public class Fila {
    private String nombre;
    private int capacidad;
    private ArrayList<Asiento> asientos;

    // Constructor
    public Fila(String nombre, int capacidad) {
        this.nombre = nombre;
        this.capacidad = capacidad;
        this.asientos = new ArrayList<Asiento>();
        for (int i = 1; i <= capacidad; i++) {
            Asiento asiento = new Asiento(nombre, i, true);
            asientos.add(asiento);
        }
    }

    // Métodos getters y setters
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getCapacidad() {
        return capacidad;
    }

    public void setCapacidad(int capacidad) {
        this.capacidad = capacidad;
    }

    public ArrayList<Asiento> getAsientos() {
        return asientos;
    }

    public void setAsientos(ArrayList<Asiento> asientos) {
        this.asientos = asientos;
    }

    // Método para agregar un nuevo asiento a la fila
    public void agregarAsiento(Asiento asiento) {
        asientos.add(asiento);
    }

    // Método para eliminar un asiento de la fila
    public void eliminarAsiento(Asiento asiento) {
        asientos.remove(asiento);
    }

    // Método para modificar la información de un asiento existente
    public void modificarAsiento(Asiento asiento, int numero, boolean disponible) {
        asiento.setNumero(numero);
        asiento.setDisponible(disponible);
    }

    // Método para verificar si hay asientos disponibles en la fila
    public boolean hayAsientosDisponibles() {
        for (Asiento asiento : asientos) {
            if (asiento.isDisponible()) {
                return true;
            }
        }
        return false;
    }

    // Método para obtener la cantidad de asientos disponibles en la fila
    public int cantidadAsientosDisponibles() {
        int cantidad = 0;
        for (Asiento asiento : asientos) {
            if (asiento.isDisponible()) {
                cantidad++;
            }
        }
        return cantidad;
    }

    String getnombre() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    //método imprime la información de la fila en la consola.
    public void imprimirInformacion() {
    System.out.println("Nombre de la fila: " + nombre);
    System.out.println("Capacidad: " + capacidad);
    System.out.println("Asientos:");
    for (Asiento asiento : asientos) {
        System.out.println("- Número: " + asiento.getNumero() + ", disponible: " + asiento.isDisponible());
    }
}
    //método busca un asiento en la lista de asientos de la fila por su número
    public Asiento buscarAsiento(int numeroAsiento) {
    for (Asiento asiento : asientos) {
        if (asiento.getNumero() == numeroAsiento) {
            return asiento;
        }
    }
    return null;
}
    //método reserva un asiento en la fila, cambiando su estado de disponible a no disponible
    public void reservarAsiento(int numeroAsiento) {
    Asiento asiento = buscarAsiento(numeroAsiento);
    if (asiento != null && asiento.isDisponible()) {
        asiento.setDisponible(false);
    }
}
    //método libera un asiento en la fila, cambiando su estado de no disponible a disponible.
    public void liberarAsiento(int numeroAsiento) {
    Asiento asiento = buscarAsiento(numeroAsiento);
    if (asiento != null && !asiento.isDisponible()) {
        asiento.setDisponible(true);
    }
}

    ArrayList<Asiento> obtenerAsientosDisponibles() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    ArrayList<Asiento> obtenerAsientosOcupados() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}