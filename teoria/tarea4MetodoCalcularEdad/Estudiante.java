class Estudiante {
    String nombre;
    int anioNac;
    char genero;      // M, F, O
    String noCuenta;
    char carrera;     // C = Computación, M = Matemáticas, F = Física, A = Actuaría, B = Biología

    void imprimirInfo() {
        System.out.println("Nombre: " + nombre);
        System.out.println("Año de nacimiento: " + anioNac);
        System.out.println("Género: " + genero);
        System.out.println("No. de cuenta: " + noCuenta);
        System.out.println("Carrera: " + carrera);
    }

    // Calcula la edad restando el año de nacimiento al año actual (2026)
    int calcularEdad() {
        return 2026 - anioNac;
    }

    // setters
    void setNombre(String nombre) {
        this.nombre = nombre;
    }

    void setAnioNac(int anioNac) {
        this.anioNac = anioNac;
    }

    void setCarrera(char carrera) {
        this.carrera = carrera;
    }

    void setNoCuenta(String noCuenta) {
        this.noCuenta = noCuenta;
    }

    void setGenero(char genero) {
        this.genero = genero;
    }
}
