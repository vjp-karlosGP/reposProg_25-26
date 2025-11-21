/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package t5ej20;

import java.util.Scanner;

/**
 *
 * @author alumno
 */
public class T5Ej20 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        Cuenta c = null;
        int opcion = 0;

        do {
            System.out.println("1. Crear cuenta vacia");
            System.out.println("2. Crear cuenta con saldo inicial");
            System.out.println("3. Ingresar dinero");
            System.out.println("4. Sacar dinero");
            System.out.println("5. Ver saldo");
            System.out.println("6. Salir");
            opcion = entrada.nextInt();
            switch (opcion) {
                case 1:
                    c = new Cuenta();
                    System.out.println("Se ha creado la cuenta con saldo: 0€");
                    break;

                case 2:
                    System.out.println("Introduce el saldo principal: ");
                    float saldo = Cuenta.pedirSaldo();
                    c = new Cuenta(saldo);
                    System.out.println("Se ha creado la cuenta con el saldo: " + saldo + "€");
                    break;

                case 3:
                    if (c == null) {
                        System.out.println("Debes crear una cuenta primero");
                    } else {
                        System.out.println("Introduce la cantidad a ingresar");
                        float ingreso = entrada.nextFloat();
                        c.ingresar(ingreso);
                    }

                    break;
                case 4:
                    if (c == null) {
                        System.out.println("Debes crear una cuenta primero");
                    } else {
                        System.out.println("Introduce la cantidad a extraer");
                        float ext = entrada.nextFloat();
                        c.extraer(ext);
                    }
                    break;
                case 5:
                    if (c == null) {
                        System.out.println("Debes crear una cuenta primero");
                    } else {
                        System.out.println("EL saldo es: "+ c.getSaldo());
                        
                    }
                    break;
                case 6:
                    System.out.println("Adios");
                    break;

                default:
                    System.out.println("Valor introducido incorrecto");
            }

        } while (opcion != 6);

    }

}
