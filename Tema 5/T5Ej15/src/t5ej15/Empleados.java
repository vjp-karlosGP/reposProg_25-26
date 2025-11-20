/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package t5ej15;

/**
 *
 * @author alumno
 */
public class Empleados {
    
    //Atrubutos
    private String nombre;
    private int salario;
    private Direccion direccion;
    
    //Constructores

    public Empleados(String nombre, int salario, Direccion direccion) {
        this.nombre = nombre;
        this.salario = salario;
        this.direccion = direccion;
    }
    
    public Empleados() {
        this.nombre = "";
        this.salario = 0;
        this.direccion = new Direccion();
    }
    
    //Getter/Setter

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getSalario() {
        return salario;
    }

    public void setSalario(int salario) {
        this.salario = salario;
    }

    public Direccion getDireccion() {
        return direccion;
    }

    public void setDireccion(Direccion direccion) {
        this.direccion = direccion;
    }

    //Mostrar

    @Override
    public String toString() {
        return "Empleados: \n Nombre = " + nombre + "\n Salario = " + salario + "\n Direccion = " + direccion;
    }
    
    
    
    
    
}
