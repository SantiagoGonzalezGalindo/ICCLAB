class Main {
    public static void main(String[] args) {
        Estudiante estudiante1 = new Estudiante();
        estudiante1.setNombre("Ana López");
        estudiante1.setAnioNac(2008);
        estudiante1.setGenero('F');
        estudiante1.setNoCuenta("326045812");
        estudiante1.setCarrera('C');

        Estudiante estudiante2 = new Estudiante();
        estudiante2.setNombre("Luis Hernández");
        estudiante2.setAnioNac(2007);
        estudiante2.setGenero('M');
        estudiante2.setNoCuenta("325118734");
        estudiante2.setCarrera('M');

        Estudiante estudiante3 = new Estudiante();
        estudiante3.setNombre("Alex Ramírez");
        estudiante3.setAnioNac(2006);
        estudiante3.setGenero('O');
        estudiante3.setNoCuenta("324097251");
        estudiante3.setCarrera('F');

        System.out.println("Estudiante 1");
        estudiante1.imprimirInfo();
        System.out.println("Edad: " + estudiante1.calcularEdad());
        System.out.println();

        System.out.println("Estudiante 2");
        estudiante2.imprimirInfo();
        System.out.println("Edad: " + estudiante2.calcularEdad());
        System.out.println();

        System.out.println("Estudiante 3");
        estudiante3.imprimirInfo();
        System.out.println("Edad: " + estudiante3.calcularEdad());
        System.out.println();
    }
}
