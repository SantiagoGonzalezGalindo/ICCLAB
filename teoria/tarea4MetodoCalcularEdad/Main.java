class Main {
    public static void main(String[] args) {
        Estudiante estudiante1 = new Estudiante();
        estudiante1.nombre = "Ana López";
        estudiante1.anioNacimiento = 2008;
        estudiante1.genero = 'F';
        estudiante1.noCuenta = "326045812";
        estudiante1.carrera = 'C';

        Estudiante estudiante2 = new Estudiante();
        estudiante2.nombre = "Luis Hernández";
        estudiante2.anioNacimiento = 2007;
        estudiante2.genero = 'M';
        estudiante2.noCuenta = "325118734";
        estudiante2.carrera = 'M';

        Estudiante estudiante3 = new Estudiante();
        estudiante3.nombre = "Alex Ramírez";
        estudiante3.anioNacimiento = 2006;
        estudiante3.genero = 'O';
        estudiante3.noCuenta = "324097251";
        estudiante3.carrera = 'F';

        System.out.println("Estudiante 1");
        estudiante1.imprimirInfo();

        System.out.println("Estudiante 2");
        estudiante2.imprimirInfo();

        System.out.println("Estudiante 3");
        estudiante3.imprimirInfo();
    }
}
