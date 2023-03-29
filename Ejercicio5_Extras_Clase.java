/*
Realizar un programa que llene una matriz de tamaño NxM con valores
aleatorios y muestre la suma de sus elementos.
 */
package ArreglosYVectores;

import java.util.Scanner;
import java.util.Random;

public class Ejercicio5_Extras_Clase {

    public static void main(String[] args) {
        Scanner fila = new Scanner(System.in);
        Scanner col = new Scanner(System.in);
        System.out.println("Ingrese el tamaño de las filas");
        int filas = fila.nextInt();
        System.out.println("Ingrese el tamaño de las columnas");
        int columnas = col.nextInt();        
        Random rdm = new Random();
        int[][] matriz = new int[filas][columnas];
        int suma = 0;

        for (int i = 0; i < filas; i++) { // lleno matriz
            for (int j = 0; j < columnas; j++) {
                matriz[i][j] = rdm.nextInt(5);
                suma += matriz[i][j];

            }

        }

        for (int i = 0; i < filas; i++) { // mostrar matriz
            for (int j = 0; j < columnas; j++) {
                System.out.print("[" + matriz[i][j] + "]");
            }
            System.out.println("");
        }
        System.out.println("La suma de la matriz es : " + suma);
    }

}