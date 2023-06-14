/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.gestoreventosboletos;

/**
 *
 * @author PC
 */
public class GestorEventosBoletos {

    public static void main(String[] args) {
    
        
        
        GestorEventos gestorEventos = new GestorEventos();
        
        Evento evento1 = new Evento("Concierto", "2023-06-15", "2023-06-16");
        Evento evento2 = new Evento("Festival", "2023-07-20", "2023-07-22");
        
        gestorEventos.agregarEvento(evento1);
        gestorEventos.agregarEvento(evento2);
        
        // Agregar secciones, filas y asientos a los eventos
        Seccion seccion1Evento1 = new Seccion("VIP");
        Seccion seccion2Evento1 = new Seccion("General");
        
        Seccion seccion1Evento2 = new Seccion("Platinum");
        Seccion seccion2Evento2 = new Seccion("Gold");
        
        evento1.agregarSeccion(seccion1Evento1);
        evento1.agregarSeccion(seccion2Evento1);
        
        evento2.agregarSeccion(seccion1Evento2);
        evento2.agregarSeccion(seccion2Evento2);
        
        // Agregar usuarios al gestor de eventos
        Usuario usuario1 = new Usuario("user1", "Admin", true);
        Usuario usuario2 = new Usuario("user2", "User", true);
        
        gestorEventos.agregarUsuario(usuario1);
        gestorEventos.agregarUsuario(usuario2);
        
        // Realizar operaciones con el gestor de eventos
        
        // Buscar evento por nombre
        Evento eventoEncontrado = gestorEventos.buscarEvento("Concierto");
        if (eventoEncontrado != null) {
            System.out.println("Evento encontrado: " + eventoEncontrado.getNombre());
        } else {
            System.out.println("Evento no encontrado");
        }
        
        // Generar listado de eventos
        gestorEventos.generarListadoEventos();
        
        // Vender boleto
        Boleto boleto = new Boleto("12345", "Juan Perez");
        gestorEventos.venderBoleto("Concierto", "VIP", "Fila 1", 1, boleto);
        
        // Cancelar venta de boleto
        gestorEventos.cancelarBoleto("Concierto", "VIP", "Fila 1", 1);
        
        // Generar listado de boletos y usuarios
        Evento evento = gestorEventos.buscarEvento("Concierto");
        if (evento != null) {
            gestorEventos.generarListadoBoletos(evento);
            gestorEventos.generarDetalleBoletos(evento);
        }
        
        gestorEventos.generarListadoUsuarios();
    }
}

