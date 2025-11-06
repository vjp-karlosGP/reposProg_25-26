/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package t4ej17;
import java.util.Scanner; // Importa la clase Scanner para leer entrada del usuario
import java.util.Random;  // Importa la clase Random para generar valores aleatorios

public class T4Ej17 {

    public static void main(String[] args) {
        jugarAdivinanza(); 
    }

    
    public static void jugarAdivinanza() {
        Scanner entrada = new Scanner(System.in); 
        Random generador = new Random();          // Crea un objeto Random para generar letras aleatorias

        char letraObjetivo = (char) (generador.nextInt(26) + 97);

        int intentos = 0;       // Inicializa el contador de intentos
        char letraUsuario;      // Variable para almacenar la letra introducida por el usuario

        System.out.println("Adivina la letra minúscula entre 'a' y 'z'."); // Mensaje inicial

        do {
            System.out.print("Introduce una letra: ");
            letraUsuario = entrada.nextLine().charAt(0); // Captura el primer carácter introducido por el usuario
            intentos++; 

            if (letraUsuario < letraObjetivo) {
                System.out.println("La letra es posterior en el alfabeto."); 
            } else if (letraUsuario > letraObjetivo) {
                System.out.println("La letra es anterior en el alfabeto.");
            } else {
                System.out.println("¡Correcto! Has adivinado la letra '" + letraObjetivo + "' en " + intentos + " intentos.");
            }

        } while (letraUsuario != letraObjetivo); 

        entrada.close(); // Cierra el objeto Scanner para liberar recursos
    }
}