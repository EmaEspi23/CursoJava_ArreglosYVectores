/*
Crear una función rellene un vector con números aleatorios, pasándole
un arreglo por parámetro. Después haremos otra función o procedimiento
que imprima el vector.
 */
package ArreglosYVectores;

import java.util.Random;


public class Ejercicio3_Extras {


    public static void main(String[] args) {
    
        int vector[] = new int[10];
        llenarVector(vector);
        imprimirVector(vector);
    }

    public static void llenarVector(int[] vector) {
        Random rand = new Random();
        for (int i = 0; i < vector.length; i++) {
            int numero = (int) (Math.random() * 10 + 1);
            vector[i] = rand.nextInt(100);
        }
    }

    public static void imprimirVector(int[] vector) {
        for (int i = 0; i < vector.length; i++) {
            System.out.println(vector[i]);
        }
    }
}