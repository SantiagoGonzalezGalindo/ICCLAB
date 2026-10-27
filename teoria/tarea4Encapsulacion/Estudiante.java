class Estudiante {
    String nombre;
    int anioNacimiento;
    char genero;      // M, F, O
    String noCuenta;
    char carrera;     // C = Computación, M = Matemáticas, F = Física, A = Actuaría, B = Biología

    void imprimirInfo() {
        System.out.println("Nombre: " + nombre);
        System.out.println("Año de nacimiento: " + anioNacimiento);
        System.out.println("Género: " + genero);
        System.out.println("No. de cuenta: " + noCuenta);
        System.out.println("Carrera: " + carrera);
        System.out.println();
    }

    // Calcula la edad restando el año de nacimiento al año actual (2026)
    int calcularEdad() {
        return 2026 - anioNacimiento;
    }
}
