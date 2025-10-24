package com.carlos;

import java.util.Scanner;

// Clase principal que contiene el menú del programa
public class ExploradorSeries {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        HashSeries hashSeries = new HashSeries();
        int opcion;

        // Menú principal
        do {
            System.out.println("\n=== EXPLORADOR DE SERIES DE CARLOS ===");
            System.out.println("1. Registrar nueva serie");
            System.out.println("2. Buscar serie por nombre");
            System.out.println("3. Listar todas las series");
            System.out.println("4. Eliminar una serie");
            System.out.println("5. Mostrar estructura hash");
            System.out.println("0. Salir");
            System.out.print("Seleccione una opción: ");
            opcion = sc.nextInt();
            sc.nextLine();

            switch (opcion) {
                case 1:
                    // Registrar una nueva serie
                    System.out.print("Ingrese nombre: ");
                    String nombre = sc.nextLine();
                    System.out.print("Ingrese género: ");
                    String genero = sc.nextLine();
                    System.out.print("Ingrese plataforma: ");
                    String plataforma = sc.nextLine();
                    System.out.print("Ingrese región: ");
                    String region = sc.nextLine();
                    hashSeries.insertar(new Serie(nombre, genero, plataforma, region));
                    break;

                case 2:
                    // Buscar serie
                    System.out.print("Ingrese nombre a buscar: ");
                    String nombreBuscar = sc.nextLine();
                    Serie encontrada = hashSeries.buscar(nombreBuscar);
                    if (encontrada != null) {
                        System.out.println("Encontrada: " + encontrada);
                    } else {
                        System.out.println("No se encontró esa serie.");
                    }
                    break;

                case 3:
                    // Listar todas las series
                    hashSeries.listarSeries();
                    break;

                case 4:
                    // Eliminar una serie
                    System.out.print("Ingrese nombre a eliminar: ");
                    String nombreEliminar = sc.nextLine();
                    hashSeries.eliminar(nombreEliminar);
                    break;

                case 5:
                    // Mostrar estructura hash completa
                    hashSeries.mostrarEstructura();
                    break;

                case 0:
                    // Salida del programa
                    System.out.println("Saliendo del programa...");
                    break;

                default:
                    System.out.println("Opción no válida. Intente nuevamente.");
                    break;
            }

        } while (opcion != 0);

        sc.close();
    }
}
