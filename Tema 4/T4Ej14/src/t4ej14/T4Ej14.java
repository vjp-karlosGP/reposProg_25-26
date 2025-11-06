/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package t4ej14;
import java.util.Scanner;

public class T4Ej14 {

    public static void main(String[] args) {
        int numero = pedirNumero();
        mostrarMultiplosDeTres(numero);
    }

    // Método para pedir el número al usuario
    public static int pedirNumero() {
        Scanner scanner = new Scanner(System.in);
        int numero;
        do {
            System.out.print("Introduce un número mayor que 0: ");
            numero = scanner.nextInt();
        } while (!esMayorQueCero(numero));
        return numero;
    }

    // Método para comprobar que el número es mayor que 0
    public static boolean esMayorQueCero(int numero) {
        if (numero <= 0) {
            System.out.println("Error: el número debe ser mayor que 0.");
            return false;
        }
        return true;
    }

    // Método para mostrar los múltiplos de 3 y contar cuántos hay
    public static void mostrarMultiplosDeTres(int limite) {
        int contador = 0;
        System.out.println("Múltiplos de 3 entre 1 y " + limite + ":");
        for (int i = 1; i <= limite; i++) {
            if (i % 3 == 0) {
                System.out.println(i);
                contador++;
            }
        }
        System.out.println("Total de múltiplos mostrados: " + contador);
    }
}