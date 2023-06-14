/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.gestoreventosboletos;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author PC
 */
public class Seccion {
  private String nombre;
    private double precio;
    private int capacidad;
    private ArrayList<Fila> filas;

    // Constructor
    public Seccion(String nombre, double precio, int capacidad) {
        this.nombre = nombre;
        this.precio = precio;
        this.capacidad = capacidad;
        this.filas = new ArrayList<>();
    }

    Seccion(String platinum) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    // Métodos getters y setters
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public int getCapacidad() {
        return capacidad;
    }

    public void setCapacidad(int capacidad) {
        this.capacidad = capacidad;
    }

    public ArrayList<Fila> getFilas() {
        return filas;
    }

    public void setFilas(ArrayList<Fila> filas) {
        this.filas = filas;
    }

    // Método para agregar una nueva fila a la sección
    public void agregarFila(Fila fila) {
        filas.add(fila);
    }

    // Método para eliminar una fila de la sección
    public void eliminarFila(Fila fila) {
        filas.remove(fila);
    }

    // Método para modificar la información de una fila existente
    public void modificarFila(Fila fila, String nombre, int capacidad) {
        fila.setNombre(nombre);
        fila.setCapacidad(capacidad);
    }

    // Método para verificar si la sección tiene asientos disponibles o no
    public boolean hayAsientosDisponibles() {
        for (Fila fila : filas) {
            if (fila.hayAsientosDisponibles()) {
                return true;
            }
        }
        return false;
    }

    // Método para obtener el precio total de la sección
    public double obtenerPrecioTotal() {
        return precio * capacidad;
    }

    // Método para buscar una fila específica en la sección
    public Fila buscarFila(String nombreFila) {
        for (Fila fila : filas) {
            if (fila.getNombre().equals(nombreFila)) {
                return fila;
            }
        }
        return null;
    }

    // Método para obtener una lista de los asientos disponibles en la sección
    public ArrayList<Asiento> obtenerAsientosDisponibles() {
        ArrayList<Asiento> asientosDisponibles = new ArrayList<>();
        for (Fila fila : filas) {
            ArrayList<Asiento> asientosFila = fila.obtenerAsientosDisponibles();
            asientosDisponibles.addAll(asientosFila);
        }
        return asientosDisponibles;
    }

    // Método para obtener una lista de los asientos ocupados en la sección
    public ArrayList<Asiento> obtenerAsientosOcupados() {
        ArrayList<Asiento> asientosOcupados = new ArrayList<>();
        for (Fila fila : filas) {
            ArrayList<Asiento> asientosFila = fila.obtenerAsientosOcupados();
            asientosOcupados.addAll(asientosFila);
        }
        return asientosOcupados;
    }

    // Método para obtener el porcentaje de ocupación de la sección
    public double obtenerPorcentajeOcupacion() {
        int asientosOcupados = obtenerAsientosOcupados().size();
        int asientosTotales = capacidad * filas.size();
        double porcentajeOcupacion = ((double) asientosOcupados / asientosTotales) * 100;
        return porcentajeOcupacion;
    }

    Iterable<Fila> getFilas(String nombreFila) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    Object getFila(int numeroFila) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}