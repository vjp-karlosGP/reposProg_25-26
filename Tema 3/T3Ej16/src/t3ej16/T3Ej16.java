/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package t3ej16;

/**
 *
 * @author alumno
 */
public class T3Ej16 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
     int contador = 0;

        System.out.println("Los numeros impares existentes entre el numero 20 y el 160 son:");

        for (int i = 21; i < 160; i += 2) { // unsamos un bucle for que cuente e 2 en dos hasta llegar a 160 y asi nos da los numeros impares
            System.out.print(i + ", ");
            contador++;
        }

        System.out.println("\nLa cantidad de numeros impares impresos han sido: " + contador);
    }
}