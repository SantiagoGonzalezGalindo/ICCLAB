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

    // Solo retira si hay saldo suficiente
    public String retirar(float cantidad) {
        if (cantidad > saldo) {
            return "Saldo insuficiente, solo tienes " + saldo;
        } else {
            saldo = saldo - cantidad;
            return "Retiro exitoso, tu saldo es " + saldo;
        }
    }
}
