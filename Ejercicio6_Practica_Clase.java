/*
Un cuadrado mágico 3 x 3 es una matriz 3 x 3 formada por números del 1 al 9
donde la suma de sus filas, sus columnas y sus diagonales son idénticas.
Crear un programa que permita introducir un cuadrado por teclado y determine
si este cuadrado es mágico o no. El programa deberá comprobar que los números
introducidos son correctos, es decir, están entre el 1 y el 9.
 */
package ArreglosYVectores;

import java.util.Scanner;

public class Ejercicio6_Practica_Clase {

    public static void main(String[] args) {

        Scanner leer = new Scanner(System.in);
        int[][] matriz = new int[3][3];
        int num = 0;
        
//        Rellenar Matriz con Nros Ingresados comprobando que sean entre 1 y 9       
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                do {
                    System.out.println("Ingrese un Nro para la ubicación " + i + "-" + j);
                    num = leer.nextInt();
                } while (num < 1 || num > 9);
                matriz[i][j] += num;
            }
        }

        // Mostrar Matriz
        
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print("[" + matriz[i][j] + "]");
            }
            System.out.println("");
        }
       
        // Suma filas, columnas y diagonales
        int fila1 = 0, fila2 = 0, fila3 = 0;
        for (int j = 0; j < 3; j++) {
            fila1 += matriz[0][j];
            fila2 += matriz[1][j];
            fila3 += matriz[2][j];                        
        }

        int col1 = 0, col2 = 0, col3 = 0;
        for (int i = 0; i < 3; i++) {
            col1 += matriz[i][0];
            col2 += matriz[i][1];
            col3 += matriz[i][2];                        
        }

        int diag1 = 0;
        int diag2 = 0;
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (i == j) {
                    diag1 += matriz[i][j];
                }
                diag2 = (matriz[2][0])+(matriz[1][1])+(matriz[0][2]);
            }
                     
        }

     if(fila1==col1&col1==diag1&diag1==diag2 ){
         System.out.println("Es un cuadrado magico");
     }else{
         System.out.println("No es un cuadrado magico");
     }
    }

}