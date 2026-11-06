class Main {
    public static void main(String[] args) {
        Cuenta cuenta1 = new Cuenta(1500, 'A', "Ana López", "03/15/2020");
        Cuenta cuenta2 = new Cuenta(300, 'N', "Luis Hernández", "08/01/2024");

        System.out.println("Cuenta 1");
        cuenta1.imprimirInfo();
        System.out.println(cuenta1.depositar(500));
        System.out.println(cuenta1.retirar(800));
        System.out.println();

        System.out.println("Cuenta 2");
        cuenta2.imprimirInfo();
        System.out.println(cuenta2.retirar(1000));
        System.out.println(cuenta2.depositar(0));
        System.out.println();
    }
}
