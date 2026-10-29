class Estudiante {
    private String nombre;
    private int anioNac;
    private char carrera;     // C = Computación, M = Matemáticas, F = Física, A = Actuaría, B = Biología
    private String noCuenta;
    private char genero;      // M, F, O

    public void imprimirInfo() {
        System.out.println("Nombre: " + nombre);
        System.out.println("Año de nacimiento: " + anioNac);
        System.out.println("Género: " + genero);
        System.out.println("No. de cuenta: " + noCuenta);
        System.out.println("Carrera: " + carrera);
    }

    // Muestra la edad restando el año de nacimiento al año que recibe
    public void calcularEdad(int anio) {
        System.out.println("Edad: " + (anio - anioNac));
    }

    // setters
    public void setNombre(String n) {
        nombre = n;
    }

    public void setAnioNac(int a) {
        anioNac = a;
    }

    public void setCarrera(char c) {
        carrera = c;
    }

    public void setNoCuenta(String nc) {
        noCuenta = nc;
    }

    public void setGenero(char g) {
        genero = g;
    }

    // getters
    public String getNombre() {
        return nombre;
    }

    public int getAnioNac() {
        return anioNac;
    }

    public char getCarrera() {
        return carrera;
    }

    public String getNoCuenta() {
        return noCuenta;
    }

    public char getGenero() {
        return genero;
    }
}
