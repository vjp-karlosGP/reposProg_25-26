/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package t4ej7;
import java.util.Scanner;

public class t4ej7 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int[] numeros = new int[4];

        String[] mensajes = {
            "Por favor, introduzca el primer número: ",
            "Ahora, introduzca un segundo número: ",
            "Ahora, introduzca el tercer número: ",
            "Por último, introduzca un cuarto número: "
        };

        for (int i = 0; i < 4; i++) {
            System.out.print(mensajes[i]);
            numeros[i] = entrada.nextInt();
        }

        ordenarBurbuja(numeros);
        mostrarOrdenados(numeros);
    }

    public static void ordenarBurbuja(int[] array) {
        for (int i = 0; i < array.length - 1; i++) {
            for (int j = 0; j < array.length - i - 1; j++) {
                if (array[j] > array[j + 1]) {
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
            }
        }
    }

    public static void mostrarOrdenados(int[] array) {
        System.out.print("El orden de los números introducidos es el ");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i]);
            if (i < array.length - 1) {
                System.out.print(" - ");
            }
        }
        System.out.println();
    }
}
