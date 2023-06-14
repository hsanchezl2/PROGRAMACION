/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.gestoreventosboletos;

import java.util.ArrayList;
import java.util.Date;

/**
 *
 * @author PC
 */
public class Evento {
    private String nombre;
    private String sinopsis;
    private Date fechaInicio;
    private Date fechaFin;
    private ArrayList<Seccion> secciones;
    private Responsable responsable;
    private String imagenPublicidad;
    private boolean visiblePublicamente;
    private Date fechaHoraPublicacion;
    private Date fechaHoraDespublicacion;

    // Constructor
    public Evento(String nombre, String sinopsis, Date fechaInicio, Date fechaFin, ArrayList<Seccion> secciones, Responsable responsable, String imagenPublicidad) {
        this.nombre = nombre;
        this.sinopsis = sinopsis;
        this.fechaInicio = fechaInicio;
        this.fechaFin = fechaFin;
        this.secciones = secciones;
        this.responsable = responsable;
        this.imagenPublicidad = imagenPublicidad;
        this.visiblePublicamente = false;
        this.fechaHoraPublicacion = null;
        this.fechaHoraDespublicacion = null;
    }

    Evento(String concierto, String string, String string0) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    // Métodos getters y setters
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getSinopsis() {
        return sinopsis;
    }

    public void setSinopsis(String sinopsis) {
        this.sinopsis = sinopsis;
    }

    public Date getFechaInicio() {
        return fechaInicio;
    }

    public void setFechaInicio(Date fechaInicio) {
        this.fechaInicio = fechaInicio;
    }

    public Date getFechaFin() {
        return fechaFin;
    }

    public void setFechaFin(Date fechaFin) {
        this.fechaFin = fechaFin;
    }

    public ArrayList<Seccion> getSecciones() {
        return secciones;
    }

    public void setSecciones(ArrayList<Seccion> secciones) {
        this.secciones = secciones;
    }

    public Responsable getResponsable() {
        return responsable;
    }

    public void setResponsable(Responsable responsable) {
        this.responsable = responsable;
    }

    public String getImagenPublicidad() {
        return imagenPublicidad;
    }

    public void setImagenPublicidad(String imagenPublicidad) {
        this.imagenPublicidad = imagenPublicidad;
    }

    public boolean isVisiblePublicamente() {
        return visiblePublicamente;
    }

    public void setVisiblePublicamente(boolean visiblePublicamente) {
        this.visiblePublicamente = visiblePublicamente;
    }

    public Date getFechaHoraPublicacion() {
        return fechaHoraPublicacion;
    }

    public void setFechaHoraPublicacion(Date fechaHoraPublicacion) {
        this.fechaHoraPublicacion = fechaHoraPublicacion;
    }

    public Date getFechaHoraDespublicacion() {
        return fechaHoraDespublicacion;
    }

    public void setFechaHoraDespublicacion(Date fechaHoraDespublicacion) {
        this.fechaHoraDespublicacion = fechaHoraDespublicacion;
    }
    // Método para agregar una nueva sección al evento
    public void agregarSeccion(Seccion seccion) {
        secciones.add(seccion);
    }

    // Método para eliminar una sección del evento
    public void eliminarSeccion(Seccion seccion) {
        secciones.remove(seccion);
    }

    // Método para modificar la información de una sección existente
    public void modificarSeccion(Seccion seccion, String nombre, double precio) {
        seccion.setNombre(nombre);
        seccion.setPrecio(precio);
    }

    // Método para publicar el evento y hacerlo visible públicamente
    public void publicarEvento() {
        visiblePublicamente = true;
        fechaHoraPublicacion = new Date();
    }

    // Método para despublicar el evento y ocultarlo de la vista pública
    public void despublicarEvento() {
        visiblePublicamente = false;
        fechaHoraDespublicacion = new Date();
    }

    // Método para verificar si el evento está actualmente publicado o no
    public boolean estaPublicado() {
        return visiblePublicamente;
    }

    String getnombre() {
       
        return null;
       
    }
    
 //método imprime la información del evento en la consola.
    public void imprimirInformacion() {
    System.out.println("Nombre del evento: " + nombre);
    System.out.println("Sinopsis: " + sinopsis);
    System.out.println("Fecha de inicio: " + fechaInicio.toString());
    System.out.println("Fecha de fin: " + fechaFin.toString());
    System.out.println("Responsable: " + responsable.getNombre());
    System.out.println("Imagen de publicidad: " + imagenPublicidad);
    System.out.println("Visible públicamente: " + visiblePublicamente);
    if (visiblePublicamente) {
        System.out.println("Fecha y hora de publicación: " + fechaHoraPublicacion.toString());
    } else {
        System.out.println("Fecha y hora de despublicación: " + fechaHoraDespublicacion.toString());
    }
    System.out.println("Secciones:");
    for (Seccion seccion : secciones) {
        System.out.println("- " + seccion.getNombre() + " (precio: " + seccion.getPrecio() + ")");
    }
}
    //método busca una sección en la lista de secciones del evento por su nombre
    public Seccion buscarSeccion(String nombreSeccion) {
    for (Seccion seccion : secciones) {
        if (seccion.getNombre().equals(nombreSeccion)) {
            return seccion;
        }
    }
    return null;
}
    // método calcula los ingresos totales del evento, sumando los precios de todos los boletos vendidos.
    public double calcularIngresosTotales() {
    double ingresosTotales = 0;
    for (Seccion seccion : secciones) {
        for (Fila fila : seccion.getFilas()) {
            for (Asiento asiento : fila.getAsientos()) {
                if (!asiento.isDisponible()) {
                    ingresosTotales += seccion.getPrecio();
                }
            }
        }
    }
    return ingresosTotales;
}
}



