/*
Construya un programa que lea 5 palabras de mínimo 3 y hasta 5 caracteres y,
a medida que el usuario las va ingresando, construya una “sopa de letras para
niños” de tamaño de 20 x 20 caracteres. Las palabras se ubicarán todas en orden
horizontal en una fila que será seleccionada de manera aleatoria. Una vez
concluida la ubicación de las palabras, rellene los espacios no utilizados
con un número aleatorio del 0 al 9. Finalmente imprima por pantalla la sopa de
letras creada.
Nota: Para resolver el ejercicio deberá investigar cómo se utilizan las
siguientes funciones de Java substring(), Length() y Math.random().
 */
package ArreglosYVectores;

import java.util.Scanner;
import java.util.Random;

public class Ejercicio6_Extras {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        String[] palabras = new String[5];
        int[] aleatorio = new int[5];
        char[][] sopa = new char[20][20];
        Random rand = new Random(); // fila aleatoria donde se ubicarán las palabras
        int columnasUsadas = 0;

        // Leer las palabras
        for (int i = 0; i < 5; i++) {
            do {
                System.out.print("Ingrese la palabra " + (i + 1) + " (entre 3 y 5 caracteres): ");
                palabras[i] = sc.nextLine();
                aleatorio[i] = rand.nextInt(20);
            } while (palabras[i].length() < 3 || palabras[i].length() > 5);
        }

        // Colocar las palabras en la sopa
        for (int i = 0; i < palabras.length; i++) {
            String palabra = palabras[i];
            
            for (int j = 0; j < palabra.length(); j++) {
                if (rand.nextInt(20) < sopa.length && columnasUsadas + j < sopa[rand.nextInt(20)].length) {
                    sopa[aleatorio[i]][columnasUsadas + j] = palabra.charAt(j);
                }
            }
            columnasUsadas += palabra.length() + 1; // sumar la longitud de la palabra más un espacio en blanco
        }

        // Rellenar los espacios vacíos con números aleatorios
        for (int i = 0; i < sopa.length; i++) {
            for (int j = 0; j < sopa[i].length; j++) {
                if (sopa[i][j] == 0) {
                    sopa[i][j] = (char) (Math.random() * 10 + '0'); // número aleatorio entre 0 y 9
                }
            }
        }

        // Imprimir la sopa de letras
        for (int i = 0; i < sopa.length; i++) {
            for (int j = 0; j < sopa[i].length; j++) {
                System.out.print(sopa[i][j] + " ");
            }
            System.out.println();
        }
    }
}

