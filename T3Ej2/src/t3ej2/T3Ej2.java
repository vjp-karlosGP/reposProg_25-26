/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package t3ej2;
import java.util.Scanner;
/**
 *
 * @author alumno
 */
public class T3Ej2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int num1, num2, resultado;
        
        Scanner entrada = new Scanner(System.in);
        System.out.println("Introduce el primer numero:");
        
        num1 = entrada.nextInt();
        
        System.out.println("Itroduce el segundo numero");
        num2 = entrada.nextInt();
        
        if (num1 > 10) {
            resultado = num1 * num2;
            System.out.println("Laoperacion que se realizo es producto y el resultado es "+ resultado);
        }else {
            resultado = num1 + num2;
            System.out.println("Laoperacion que se realizo es suma y el resultado es "+ resultado);
        }
    }
    
}
