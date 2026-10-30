class Main {
    public static void main(String[] args) {
        Estudiante estudiante1 = new Estudiante("Ana López", 2008, 'C', "326045812", 'F');

        Estudiante estudiante2 = new Estudiante("Luis Hernández", 2007, 'M', "325118734", 'M');

        Estudiante estudiante3 = new Estudiante("Alex Ramírez", 2006, 'F', "324097251", 'O');

        System.out.println("Estudiante 1");
        estudiante1.imprimirInfo();
        estudiante1.calcularEdad(2026);
        System.out.println();

        System.out.println("Estudiante 2");
        estudiante2.imprimirInfo();
        estudiante2.calcularEdad(2026);
        System.out.println();

        System.out.println("Estudiante 3");
        estudiante3.imprimirInfo();
        estudiante3.calcularEdad(2026);
        System.out.println();
    }
}
