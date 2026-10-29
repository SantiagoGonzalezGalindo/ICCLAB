class Main {
    public static void main(String[] args) {
        Cuenta cuenta1 = new Cuenta();
        cuenta1.setSaldo(1500);
        cuenta1.setTipo('A');
        cuenta1.setCliente("Ana López");
        cuenta1.setFechaApertura("03/15/2020");

        Cuenta cuenta2 = new Cuenta();
        cuenta2.setSaldo(300);
        cuenta2.setTipo('N');
        cuenta2.setCliente("Luis Hernández");
        cuenta2.setFechaApertura("08/01/2024");

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
