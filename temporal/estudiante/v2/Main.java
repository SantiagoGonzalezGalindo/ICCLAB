class Main {
    public static void main(String[] args) {
        Estudiante estudiante1 = new Estudiante();
        estudiante1.nombre = "Ana López";
        estudiante1.edad = 18;
        estudiante1.genero = 'F';
        estudiante1.noCuenta = "326045812";
        estudiante1.carrera = 'C';

        Estudiante estudiante2 = new Estudiante();
        estudiante2.nombre = "Luis Hernández";
        estudiante2.edad = 19;
        estudiante2.genero = 'M';
        estudiante2.noCuenta = "325118734";
        estudiante2.carrera = 'M';

        Estudiante estudiante3 = new Estudiante();
        estudiante3.nombre = "Alex Ramírez";
        estudiante3.edad = 20;
        estudiante3.genero = 'O';
        estudiante3.noCuenta = "324097251";
        estudiante3.carrera = 'F';

        System.out.println("Estudiante 1");
        System.out.println("Nombre: " + estudiante1.nombre);
        System.out.println("Edad: " + estudiante1.edad);
        System.out.println("Género: " + estudiante1.genero);
        System.out.println("No. de cuenta: " + estudiante1.noCuenta);
        System.out.println("Carrera: " + estudiante1.carrera);
        System.out.println();

        System.out.println("Estudiante 2");
        System.out.println("Nombre: " + estudiante2.nombre);
        System.out.println("Edad: " + estudiante2.edad);
        System.out.println("Género: " + estudiante2.genero);
        System.out.println("No. de cuenta: " + estudiante2.noCuenta);
        System.out.println("Carrera: " + estudiante2.carrera);
        System.out.println();

        System.out.println("Estudiante 3");
        System.out.println("Nombre: " + estudiante3.nombre);
        System.out.println("Edad: " + estudiante3.edad);
        System.out.println("Género: " + estudiante3.genero);
        System.out.println("No. de cuenta: " + estudiante3.noCuenta);
        System.out.println("Carrera: " + estudiante3.carrera);
    }
}
