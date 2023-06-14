/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.gestoreventosboletos;

import java.util.Date;
import java.util.List;


/**
 *
 * @author PC
 */
public class Boleto {
 private String numeroBoleto;
    private String nombreEvento;
    private String nombreCliente;
    private Seccion seccion;
    private Asiento asiento;
    private Date fechaHoraEvento;
    private String direccionVenue;
    private double precio;
    private double porcentajeCobroExtra;
    private String fecha;
    private String hora;

    // Constructor
    public Boleto(String numeroBoleto, String nombreEvento, String nombreCliente, Seccion seccion, Asiento asiento, Date fechaHoraEvento, String direccionVenue, double precio, double porcentajeCobroExtra) {
        this.numeroBoleto = numeroBoleto;
        this.nombreEvento = nombreEvento;
        this.nombreCliente = nombreCliente;
        this.seccion = seccion;
        this.asiento = asiento;
        this.fechaHoraEvento = fechaHoraEvento;
        this.direccionVenue = direccionVenue;
        this.precio = precio;
        this.porcentajeCobroExtra = porcentajeCobroExtra;
    }

    Boleto(String string, String juan_Perez) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    // Métodos getters y setters
    public String getNumeroBoleto() {
        return numeroBoleto;
    }

    public void setNumeroBoleto(String numeroBoleto) {
        this.numeroBoleto = numeroBoleto;
    }

    public String getNombreEvento() {
        return nombreEvento;
    }

    public void setNombreEvento(String nombreEvento) {
        this.nombreEvento = nombreEvento;
    }

    public String getNombreCliente() {
        return nombreCliente;
    }

    public void setNombreCliente(String nombreCliente) {
        this.nombreCliente = nombreCliente;
    }

    public Seccion getSeccion() {
        return seccion;
    }

    public void setSeccion(Seccion seccion) {
        this.seccion = seccion;
    }

    public Asiento getAsiento() {
        return asiento;
    }

    public void setAsiento(Asiento asiento) {
        this.asiento = asiento;
    }

    public Date getFechaHoraEvento() {
        return fechaHoraEvento;
    }

    public void setFechaHoraEvento(Date fechaHoraEvento) {
        this.fechaHoraEvento = fechaHoraEvento;
    }

    public String getDireccionVenue() {
        return direccionVenue;
    }

    public void setDireccionVenue(String direccionVenue) {
        this.direccionVenue = direccionVenue;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public double getPorcentajeCobroExtra() {
        return porcentajeCobroExtra;
    }

    public void setPorcentajeCobroExtra(double porcentajeCobroExtra) {
        this.porcentajeCobroExtra = porcentajeCobroExtra;
    }

    public double calcularPrecioTotal() {
        double precioTotal = precio;
        if (porcentajeCobroExtra > 0) {
            precioTotal += precio * (porcentajeCobroExtra / 100);
        }
        return precioTotal;
    }
//polimorfimo el cual puede ser utilizado para imprimir la información de cualquier objeto de la clase Boleto
    public void imprimirBoleto() {
        System.out.println("Número de boleto: " + numeroBoleto);
        System.out.println("Nombre del evento: " + nombreEvento);
        System.out.println("Nombre del cliente: " + nombreCliente);
        System.out.println("Sección: " + seccion.getNombre());
        System.out.println("Asiento: " + asiento.getLetra() + "-" + asiento.getCorrelativo());
        System.out.println("Precio: " + precio);
        System.out.println("Porcentaje de cobro extra: " + porcentajeCobroExtra);
        System.out.println("Precio total: " + calcularPrecioTotal());
    }

    public void cambiarAsiento() {
        List<Fila> filas = seccion.getFilas();
        for (Fila fila : filas) {
            List<Asiento> asientos = fila.getAsientos();
            for (Asiento nuevoAsiento : asientos) {
                if (nuevoAsiento.isDisponible()) {
                    asiento.setDisponible(true);
                    asiento = nuevoAsiento;
                    asiento.setDisponible(false);
                    return;
                }
            }
        }
        System.out.println("No hay asientos disponibles en la misma sección.");
    } 

    String getInformacion() {
        String informacion = "Número de boleto: " + numeroBoleto + "\n";
        informacion += "Fecha: " + fecha + "\n";
        informacion += "Hora: " + hora + "\n";
        informacion += "Precio: " + precio + "\n";
        informacion += "Asiento: " + asiento.getInformacion() + "\n";
        return informacion;
    }
}
 

