class Cuenta {
    private float saldo;
    private char tipo;              // A = Ahorro, C = Cheques, N = Nómina
    private String cliente;
    private String fechaApertura;   // mm/dd/aaaa

    public void imprimirInfo() {
        System.out.println("Saldo: " + saldo);
        System.out.println("Tipo: " + tipo);
        System.out.println("Cliente: " + cliente);
        System.out.println("Fecha de apertura: " + fechaApertura);
    }
}
