/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package t5ej16;

/**
 *
 * @author alumno
 */
public class T5Ej16 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        examen examen1 = new examen();
        examen1.setNota(3);
        examen1.setAlumno("Juan");
        
        examen examen2 = new examen(10, "Alberto");
        examen examen3 = new examen(6, "Luis");
        
        examen1.mostrarExamen();
        System.out.println("");
        examen2.mostrarExamen();
        System.out.println("");
        examen3.mostrarExamen();
        
        
        
        
    }
    
    
    
}
