package com.carlos;

// Clase que representa una serie con sus atributos básicos
public class Serie {
    // Atributos principales de una serie
    private String nombre;
    private String genero;
    private String plataforma;
    private String region;

    // Constructor: inicializa los atributos al crear una nueva serie
    public Serie(String nombre, String genero, String plataforma, String region) {
        this.nombre = nombre;
        this.genero = genero;
        this.plataforma = plataforma;
        this.region = region;
    }

    // Métodos getter: permiten acceder a los atributos desde otras clases
    public String getNombre() { return nombre; }
    public String getGenero() { return genero; }
    public String getPlataforma() { return plataforma; }
    public String getRegion() { return region; }

    // Método toString: devuelve una representación en texto de la serie
    @Override
    public String toString() {
        return nombre + " (" + genero + ") - " + plataforma + " [" + region + "]";
    }
}
