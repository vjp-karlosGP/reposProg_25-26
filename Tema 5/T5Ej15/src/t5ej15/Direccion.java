/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package t5ej15;

/**
 *
 * @author alumno
 */
public class Direccion {

    //Atrubutos
    private String calle;
    private int numero;
    private String puerta;
    private String ciudad;
    
    //Constructores

    public Direccion(String calle, int numero, String puerta, String ciudad) {
        this.calle = calle;
        this.numero = numero;
        this.puerta = puerta;
        this.ciudad = ciudad;
    }
    
    public Direccion() {
        this.calle = "";
        this.numero = 0;
        this.puerta = "";
        this.ciudad = "";
    }
    
    //Getters/Setters

    public String getCalle() {
        return calle;
    }

    public void setCalle(String calle) {
        this.calle = calle;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getPuerta() {
        return puerta;
    }

    public void setPuerta(String puerta) {
        this.puerta = puerta;
    }

    public String getCiudad() {
        return ciudad;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }
    
    //Mostrar

    @Override
    public String toString() {
        return "\n Calle = " + calle + "\n Número = " + numero + "\n Puerta = " + puerta + "\n Ciudad = " + ciudad;
    }
    






}
