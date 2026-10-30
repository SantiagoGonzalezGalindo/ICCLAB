/*
 * Nombre:      Estudiante.java
 * Autor:       Santiago Gonzalez Galindo
 * Descripción: Clase que representa a un estudiante y muestra su información.
 * Fecha:       22/10/2026
 */

class Estudiante {
    String nombre;
    int edad;
    char genero;      // M, F, O
    String noCuenta;
    char carrera;     // C = Computación, M = Matemáticas, F = Física, A = Actuaría, B = Biología

    void imprimirInfo() {
        System.out.println("Nombre: " + nombre);
        System.out.println("Edad: " + edad);
        System.out.println("Género: " + genero);
        System.out.println("No. de cuenta: " + noCuenta);
        System.out.println("Carrera: " + carrera);
        System.out.println();
    }
}
