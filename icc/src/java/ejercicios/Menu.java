package ejercicios;

import java.util.Scanner;

/**
 * Nombre:      Menu.java
 * Autor:       Santiago Gonzalez Galindo
 * Descripcion: Pide el nombre del usuario y muestra un menu de tres opciones.
 * Fecha:       02/11/2026
 */

public class Menu {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        String nombre;
        int opcion;

        // Bienvenida
        System.out.println("Bienvenido al menu de opciones");

        // Pide el nombre y lo usa en un mensaje
        System.out.println("Cual es tu nombre?");
        nombre = teclado.nextLine();
        System.out.println("Hola, " + nombre);

        // Menu de tres opciones
        System.out.println("1. Ver un saludo");
        System.out.println("2. Ver un consejo");
        System.out.println("3. Salir");
        System.out.println("Elige una opcion:");
        opcion = teclado.nextInt();

        // Mensaje segun la opcion elegida
        if (opcion == 1) {
            System.out.println("Que tengas un buen dia, " + nombre);
        } else {
            if (opcion == 2) {
                System.out.println(nombre + ", recuerda hacer commit de tus cambios");
            } else {
                if (opcion == 3) {
                    System.out.println("Hasta luego, " + nombre);
                } else {
                    System.out.println("Opcion no valida, vuelve a intentarlo");
                }
            }
        }

        teclado.close();
    }
}
