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

    // Calcula la edad restando el año de nacimiento al año actual (2026)
    public int calcularEdad() {
        return 2026 - anioNac;
    }

    // setters
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setAnioNac(int anioNac) {
        this.anioNac = anioNac;
    }

    public void setCarrera(char carrera) {
        this.carrera = carrera;
    }

    public void setNoCuenta(String noCuenta) {
        this.noCuenta = noCuenta;
    }

    public void setGenero(char genero) {
        this.genero = genero;
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
