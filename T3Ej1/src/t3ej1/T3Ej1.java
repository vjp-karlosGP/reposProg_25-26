/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package t3ej1;

import java.util.Scanner;

/**
 *
 * @author alumno
 */
public class T3Ej1 {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int num;
        Scanner entrada = new Scanner(System.in);
        System.out.println("Introduce un numero");
        
        num = entrada.nextInt();
        
        if (num >= 0) {
            System.out.println("Tu numero es positivo");
            
        } else {
            System.out.println("Tu numero es negativo");
        }
        
        
    }
    
}
