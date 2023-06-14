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
public class VentaBoletos {
    
    private int cantidadBoletos;
    private ArrayList<Asiento> asientosSeleccionados;
    private Comprador comprador;
    private double porcentajeCobroExtra;

    // Constructor
    public VentaBoletos(int cantidadBoletos, ArrayList<Asiento> asientosSeleccionados, Comprador comprador, double porcentajeCobroExtra) {
        this.cantidadBoletos = cantidadBoletos;
        this.asientosSeleccionados = asientosSeleccionados;
        this.comprador = comprador;
        this.porcentajeCobroExtra = porcentajeCobroExtra;
    }

    // Métodos getters y setters
    public int getCantidadBoletos() {
        return cantidadBoletos;
    }

    public void setCantidadBoletos(int cantidadBoletos) {
        this.cantidadBoletos = cantidadBoletos;
    }

    public ArrayList<Asiento> getAsientosSeleccionados() {
        return asientosSeleccionados;
    }

    public void setAsientosSeleccionados(ArrayList<Asiento> asientosSeleccionados) {
        this.asientosSeleccionados = asientosSeleccionados;

    }

    public Comprador getComprador() {
        return comprador;
    }

    public void setComprador(Comprador comprador) {
        this.comprador = comprador;
    }

    public double getPorcentajeCobroExtra() {
        return porcentajeCobroExtra;
    }

    public void setPorcentajeCobroExtra(double porcentajeCobroExtra) {
        this.porcentajeCobroExtra = porcentajeCobroExtra;
    }

    // Método para calcular el precio total de la compra
    public double calcularPrecioTotal() {
        double precioTotal = 0;
        for (Asiento asiento : asientosSeleccionados) {
    
        }
        precioTotal *= cantidadBoletos;
        precioTotal += precioTotal * porcentajeCobroExtra;
        return precioTotal;
    }
    //método calcula el precio total de la compra, teniendo en cuenta la cantidad de boletos, los asientos seleccionados, el comprador y el porcentaje de cobro extra.
    public void calcularPrecioTotal {
    double precioTotal = 0;
    for (Asiento asiento : asientosSeleccionados) {
        precioTotal += asiento.getPrecio();
    }
    precioTotal *= cantidadBoletos;
    precioTotal += precioTotal * porcentajeCobroExtra;
    return precioTotal;
}
}


