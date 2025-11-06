/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package t4ej20;
import java.util.Scanner;

public class T4Ej20 {

    // Respuestas correctas definidas como constantes
    public static final String RESPUESTA1 = "Madrid";
    public static final String RESPUESTA2 = "Colón";

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int nota = 0;

        System.out.println("EXAMEN DE CULTURA GENERAL\n");

        // Cada método devuelve true si la respuesta es correcta
        if (preguntaCapital(entrada)) nota++;
        if (preguntaDescubrimiento(entrada)) nota++;

        // Nota final: cada acierto vale 5 puntos
        System.out.println("\nNOTA DEL EXAMEN: " + (nota * 5));

        entrada.close();
    }

    public static boolean preguntaCapital(Scanner entrada) {
        System.out.print("1ª PREGUNTA: ¿Cuál es la capital de España?: ");
        String respuestaUsuario = entrada.nextLine();

        // Comparación sin sensibilidad a mayúsculas
        if (respuestaUsuario.equalsIgnoreCase(RESPUESTA1)) {
            System.out.println("Muy bien, respuesta correcta.");
            return true;
        } else {
            System.out.println("No es correcto. La respuesta correcta sería " + RESPUESTA1);
            return false;
        }
    }

    public static boolean preguntaDescubrimiento(Scanner entrada) {
        System.out.print("2ª PREGUNTA: ¿Quién descubrió América?: ");
        String respuestaUsuario = entrada.nextLine();

        if (respuestaUsuario.equalsIgnoreCase(RESPUESTA2)) {
            System.out.println("Muy bien, respuesta correcta.");
            return true;
        } else {
            System.out.println("No es correcto. La respuesta correcta sería " + RESPUESTA2);
            return false;
        }
    }
}
