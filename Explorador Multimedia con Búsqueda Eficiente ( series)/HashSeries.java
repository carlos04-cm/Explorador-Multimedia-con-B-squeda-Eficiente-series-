package com.carlos;

import java.util.HashMap;

// Clase que gestiona las series usando un HashMap (estructura Hashing)
public class HashSeries {
    // Estructura de datos utilizada: HashMap (clave: nombre de la serie)
    private HashMap<String, Serie> tabla;

    // Constructor
    public HashSeries() {
        tabla = new HashMap<>();
    }

    // Insertar una nueva serie en la tabla hash
    public void insertar(Serie serie) {
        tabla.put(serie.getNombre().toLowerCase(), serie);
        System.out.println("Serie registrada correctamente.");
    }

    // Buscar una serie por su nombre
    public Serie buscar(String nombre) {
        return tabla.get(nombre.toLowerCase());
    }

    // Eliminar una serie por su nombre
    public void eliminar(String nombre) {
        if (tabla.remove(nombre.toLowerCase()) != null) {
            System.out.println("Serie eliminada correctamente.");
        } else {
            System.out.println("No se encontró la serie con ese nombre.");
        }
    }

    // Listar todas las series registradas 
    public void listarSeries() {
        System.out.println("--- Lista de Series ---");
        if (tabla.isEmpty()) {
            System.out.println("No hay series registradas.");
        } else {
            for (Serie s : tabla.values()) {
                System.out.println(s);
            }
        }
        System.out.println("\nInternamente, los datos están almacenados en un HashMap.");
    }

    // Mostrar la estructura completa de la tabla hash
    public void mostrarEstructura() {
        System.out.println("--- Estructura Hash ---");
        for (String clave : tabla.keySet()) {
            System.out.println(clave + " -> " + tabla.get(clave));
        }
    }
}
