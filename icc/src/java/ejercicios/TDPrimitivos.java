import java.util.Scanner;

public class TDPrimitivos {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        byte enteroPequenio = 10;
        short enteroCorto = 100;
        int entero = 1000;
        long enteroGrande = 10000;
        int valor1;
        int valor2;
        int suma;

        System.out.println("Entero pequeño: " + enteroPequenio);
        System.out.println("Entero corto: " + enteroCorto);
        System.out.println("Entero: " + entero);
        System.out.println("Entero grande: " + enteroGrande);

        System.out.println("ingresa un número entero: ");
        valor1 = sc.nextInt();

        System.out.println("ingresa un segundo número entero: ");
        valor2 = sc.nextInt();

        suma = valor1 + valor2;
        System.out.println("La suma de esos números es: " + suma);


    }

}
