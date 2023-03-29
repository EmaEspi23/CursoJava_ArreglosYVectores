/*
Realizar un programa que rellene un matriz de 4 x 4 de valores aleatorios
y muestre la traspuesta de la matriz. La matriz traspuesta de una matriz A
se denota por B y se obtiene cambiando sus filas por columnas (o viceversa).
 */
package ArreglosYVectores;

import java.util.Random;
import java.util.Scanner;

public class Ejercicio4_Practica_Clase {

   public static void main(String[] args) {

        Scanner leer = new Scanner(System.in);
        Random rdm = new Random();
        int[][] matriz = new int[4][4];
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz.length; j++) {
                matriz[i][j] = rdm.nextInt(11);
            }
        }
        String aux = " ";
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz.length; j++) {
                // aux += matriz[i][j];
                System.out.print("[" + matriz[i][j] + "]");
            }
            System.out.println(" ");
        }
        System.out.println("   ");

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz.length; j++) {
                // aux += matriz[i][j];
                System.out.print("[" + matriz[j][i] + "]");
            }
            System.out.println(" ");
        }

    }
}
