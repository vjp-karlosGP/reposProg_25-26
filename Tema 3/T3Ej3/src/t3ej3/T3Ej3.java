/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package t3ej3;
import java.util.Scanner;

/**
 *
 * @author alumno
 */
public class T3Ej3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int numero1, numero2, numero3; 
        
        System.out.println("Introduzca un primer numero");
        numero1 = entrada.nextInt();
        
        System.out.println("Introduzca un segundo numero");
        numero2 = entrada.nextInt();
        
        System.out.println("Introduzca un tercer numero");
        numero3 = entrada.nextInt();
        
      if (numero1 > numero2) {
            if (numero1>numero3) {
                System.out.println("El número mayor de los introducidos es el " + numero1);

            } else {
                System.out.println("El número mayor de los introducidos es el " + numero3);
            }
        } else {
            if (numero2>numero3) {
                System.out.println("El número mayor de los introducidos es el " + numero2);

            } else {
                System.out.println("El número mayor de los introducidos es el " + numero3);

            }
        }

    }
    
}