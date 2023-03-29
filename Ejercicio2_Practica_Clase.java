/*
Realizar un algoritmo que llene un vector de tamaño N con valores aleatorios
y le pida al usuario un número a buscar en el vector. El programa mostrará
dónde se encuentra el numero y si se encuentra repetido
 */
package ArreglosYVectores;

import java.util.Scanner;

public class Ejercicio2_Practica_Clase {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese un tamaño para el Vector");
        int tamanio = leer.nextInt();
        int[] vector = new int[tamanio]; //tamaño vector

        for (int i = 0; i < vector.length; i++) { // llenar vector 
            vector[i] = (int) (Math.random() * 11) + 1;

        }
        for (int i = 0; i < vector.length; i++) { //muestra vector
            System.out.println("[" + vector[i] + "]");
        }
        System.out.println("Ingrese el Nro que quiere buscar :");
        int num = leer.nextInt();

        for (int i = 0; i < vector.length; i++) {
            if (num == vector[i]) {
                System.out.println("El numero repetido es : " + num + " y sus posiciones son : " + (i + 1));

            }
        }
    }
}
