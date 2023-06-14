/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.gestoreventosboletos;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author PC
 */
public class Asiento {
    private String fila;
    private int numero;
    private boolean disponible;
    private double precio;
    private String seccion;
    private String nombre;
    private int numeroBoleto;

    // Constructor
    public Asiento(String fila, int numero, boolean disponible, double precio, String seccion, int numeroBoleto) {
        this.fila = fila;
        this.numero = numero;
        this.disponible = disponible;
        this.precio = precio;
        this.seccion = seccion;
        this.numeroBoleto = numeroBoleto;
}

    Asiento(String nombre, int i, boolean b) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    // Métodos getters y setters
    public String getFila() {
        return fila;
    }

    public void setFila(String fila) {
        this.fila = fila;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public boolean isDisponible() {
        return disponible;
    }

    public void setDisponible(boolean disponible) {
        this.disponible = disponible;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public String getSeccion() {
        return seccion;
    }

    public void setSeccion(String seccion) {
        this.seccion = seccion;
    }

    public String getNombreCliente() {
        return nombre;
    }

    public void setNombreCliente(String nombre) {
        this.nombre = nombre;
    }

    public int getNumeroBoleto() {
        return numeroBoleto;
    }

    public void setNumeroBoleto(int numeroBoleto) {
        this.numeroBoleto = numeroBoleto;
    }

    // Método para reservar el asiento
    public void reservar(String nombreCliente, int numeroBoleto) {
        disponible = false;
        this.nombre = nombreCliente;
        this.numeroBoleto = numeroBoleto;
    }

    // Método para liberar el asiento
    public void liberar() {
        disponible = true;
        nombre = null;
        numeroBoleto = 0;
    }

    // Método para obtener el estado del asiento
    public String getEstado() {
        if (disponible) {
            return "Disponible";
        } else if (nombre != null) {
            return "Reservado por " + nombre;
        } else {
            return "Ocupado";
        }
    }
// Manejar archivos
    public static void guardarAsientosEnArchivo(String Asiento, Asiento[] asientos) {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(Asiento))) {
            for (Asiento asiento : asientos) {
                writer.write(asiento.toString());
                writer.newLine();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static Asiento[] cargarAsientosDesdeArchivo(String Asiento) {
        List<Asiento> asientos = new ArrayList<>();

        try (BufferedReader reader = new BufferedReader(new FileReader(Asiento))) {
            String linea;
            while ((linea = reader.readLine()) != null) {
                // Parsear cada línea y crear objetos Asiento
                // Agregar los objetos Asiento a la lista
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        return asientos.toArray(new Asiento[0]);
    }

    String getInformacion() {
        String informacion = "Fila: " + fila + "\n";
        informacion += "Número: " + numero + "\n";
        informacion += "Disponible: " + disponible + "\n";
        informacion += "Precio: " + precio + "\n";
        informacion += "Sección: " + seccion + "\n";
        informacion += "Nombre del cliente: " + nombre + "\n";
        informacion += "Número de boleto: " + numeroBoleto + "\n";
        informacion += "Estado: " + getEstado() + "\n";

        return informacion;
        
    }

    boolean getCorrelativo() {
        boolean Correlativo = false;
        return Correlativo;
    }
// representa la letra de la fila del asiento.
    public String getLetra() {
        return fila.substring(0, 1);
}
}



    