/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package t5ej15;

/**
 *
 * @author alumno
 */
public class Test {
    
    public static void main(String[] args) {
        Direccion direccion1 = new Direccion();
        direccion1.setCalle("Calle Caparra");
        direccion1.setNumero(4);
        direccion1.setPuerta("4ºC");
        direccion1.setCiudad("Plasencia");
        
        Direccion direccion2 = new Direccion();
        direccion2.setCalle("Calle Cabezuela");
        direccion2.setNumero(8);
        direccion2.setPuerta("3ºD");
        direccion2.setCiudad("Plasencia");
        
        Direccion direccion3 = new Direccion();
        direccion3.setCalle("Calle Luis de Miranda");
        direccion3.setNumero(3);
        direccion3.setPuerta("3º Izq");
        direccion3.setCiudad("Plasencia");
        
        Empleados empleado1 = new Empleados("Juan", 1200, direccion2);
        Empleados empleado2 = new Empleados("Alberto", 1000, direccion3);
        Empleados empleado3 = new Empleados("Fran", 100, direccion3);
        
        System.out.println("Empleado 1:");
        System.out.println(empleado1.toString());
        System.out.println("");
        System.out.println("Empleado 2:");
        System.out.println(empleado2.toString());
        System.out.println("");
        System.out.println("Empleado 3:");
        System.out.println(empleado3.toString());
    }
    
    
    
    
    
}
