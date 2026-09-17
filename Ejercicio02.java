import java.util.Scanner;


public class Ejercicio02 {
    public static void main( String[] args){
        Scanner teclado = new Scanner(System.in);
        String nombre;

        System.out.print("Introduce tu nombre: ");
        nombre = teclado.nextLine();

        System.out.println("Tu nombre es: " + nombre);
        
        teclado.close();
    }
}    
