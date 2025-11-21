/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package t5ej20;

import java.util.Scanner;


/**
 *
 * @author alumno
 */
public class Cuenta {
    
    private float saldo;
    
    //Constructores

    public Cuenta(float saldo) {
        this.saldo = saldo;
    }

    public Cuenta() {
        this.saldo = 0;
    }
    
    
    //Getters/Setters

    public float getSaldo() {
        return saldo;
    }

    public void setSaldo(float saldo) {
        this.saldo = saldo;
    }
    
    
    //Mostrar
    
    @Override    
    public String toString(){
        return "Cuenta \n saldo = " + saldo + "€";
    }

    //Otros metodos
    public void ingresar(float c) {
        this.saldo  += c;
    }
    
    public void extraer(float c) {
        this.saldo -= c;
    }
    
    public static float pedirSaldo(){
        Scanner entrada = new Scanner(System.in);
        float s = entrada.nextFloat();
        return  s;
    }
    
   
}
