/*
Crear una función rellene un vector con números aleatorios, pasándole
un arreglo por parámetro. Después haremos otra función o procedimiento
que imprima el vector.
 */
package ArreglosYVectores;

import java.util.Random;
import java.util.Scanner;

public class Ejercicio3_Extras_Clase {

    public static void main(String[] args) {

        Scanner leer = new Scanner(System.in);
        int[] vector = new int[4];
        rel(vector);
        mostrar(vector);

    }

    public static void rel(int[] vector) { //funcion para rellenar
        Random rdm = new Random();
        for (int i = 0; i < vector.length; i++) {
            vector[i] = rdm.nextInt(10);

        }
    }

    public static void mostrar(int[] vector) { //mostrar vector
        for (int i = 0; i < vector.length; i++) {
            System.out.print("[" + vector[i] + "]");

        }
        System.out.println("");
    }

}
