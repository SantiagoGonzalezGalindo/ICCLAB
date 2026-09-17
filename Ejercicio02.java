import java.util.Scanner;


public class Ejercicio02 {
    public static void main( String[] args){
        Scanner teclado = new Scanner()
        String variable;

        System.out.println("Introduce tu nombre:");

        String nombre = teclado.nextLine();

        System.out.print("Tu nombre es:" + nombre);
    
        
        teclado.close();
    }
}    
