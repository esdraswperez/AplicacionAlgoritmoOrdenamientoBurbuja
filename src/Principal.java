
import java.util.Scanner;

/* 
Aplicacioón del Algoritmo de Ordenamiento por el Método Burbuja
Por Esdras Pérez
 */
public class Principal {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int posiciones, auxCalificaciones;
        String auxNombres;

        System.out.print("Ingresa la cantidad de registros: ");
        posiciones = entrada.nextInt();

        String nombres[] = new String[posiciones];
        int calificaciones[] = new int[posiciones];

        for (int i = 0; i < posiciones; i++) {
            System.out.print("Ingresa el nombre del alumno #" + (i + 1) + ": ");
            nombres[i] = entrada.next();
            System.out.print("Ingresa la calificacion del alumno " + nombres[i] + ": ");
            calificaciones[i] = entrada.nextInt();
        }

        // Método de Ordenamiento de Burbuja
        for (int i = 0; i < (posiciones - 1); i++) {
            for (int j = 0; j < (posiciones - 1); j++) {
                if (calificaciones[j] > calificaciones[j + 1]) {
                    auxCalificaciones = calificaciones[j]; // Si calificacionActual > calificacionSiguiente
                    auxNombres = nombres[j];
                    calificaciones[j] = calificaciones[j + 1];
                    nombres[j] = nombres[j + 1];
                    calificaciones[j + 1] = auxCalificaciones;
                    nombres[j + 1] = auxNombres;

                }
            }
        }

        // Ciclo para mostrar datos ordenados ascendentemente
        System.out.println("\nMuestra las calificaciones ordenadas ascendentemente");
        for (int i = 0; i < posiciones; i++) {
            if (calificaciones[i] >= 8) {
                System.out.println((i + 1) + ". Alumno: " + nombres[i] + ", Calificacion: " + calificaciones[i] + ", CON DERECHO A BECA");
            } else {
                System.out.println((i + 1) + ". Alumno: " + nombres[i] + ", Calificacion: " + calificaciones[i] + ", SIN BECA");
            }
        }
      
        // Ciclo para mostrar datos ordenados descendentemente
        System.out.println("\nMuestra las calificaciones ordenadas descendentemente");
        for (int i = (posiciones - 1); i >= 0; i--) {
            if (calificaciones[i] >= 8) {
                System.out.println((i + 1) + ". Alumno: " + nombres[i] + ", Calificacion: " + calificaciones[i] + ", CON DERECHO A BECA");
            } else {
                System.out.println((i + 1) + ". Alumno: " + nombres[i] + ", Calificacion: " + calificaciones[i] + ", SIN BECA");
            }
        }
    }
}
