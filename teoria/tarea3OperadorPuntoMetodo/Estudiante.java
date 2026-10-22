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
