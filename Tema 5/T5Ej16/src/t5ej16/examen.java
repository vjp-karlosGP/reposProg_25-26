/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package t5ej16;

/**
 *
 * @author alumno
 */
public class examen {
    private int nota;
    private String alumno;
    
    //Constructores

    public examen(int nota, String alumno) {
        this.nota = nota;
        this.alumno = alumno;
    }
    
    public examen() {
        this.nota = 0;
        this.alumno = "";
    }
    
    //Getters/setters

    public int getNota() {
        return nota;
    }

    public void setNota(int nota) {
        this.nota = nota;
    }

    public String getAlumno() {
        return alumno;
    }

    public void setAlumno(String alumno) {
        this.alumno = alumno;
    }
    
    
    //Mostrar
    public void mostrarExamen(){
        System.out.println("Examen: \n nombre: " +alumno+ "\n nota: "+ nota);
        calificacion();
    }
            
    
    //Otros metodos
    public void calificacion(){
        
        switch (nota) {
            case 1:
            case 2:
            case 3:
            case 4:    
                System.out.println("Suspenso");
                break;
            case 5:
            case 6:
                System.out.println("Bien");
                break;
            case 7:
            case 8:
                System.out.println("Notable");
                break;
            case 9:
            case 10:
                System.out.println("Sobresaliete");
                break;
            
            default:
                System.out.println("Error nota mal introducida");
        }
    }
    
}
