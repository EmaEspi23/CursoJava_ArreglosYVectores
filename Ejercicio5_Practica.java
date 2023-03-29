/*
 Realice un programa que compruebe si una matriz dada es antisimétrica.
Se dice que una matriz A es antisimétrica cuando ésta es igual a su propia
traspuesta, pero cambiada de signo. Es decir, A es antisimétrica si A = -AT.
La matriz traspuesta de una matriz A se denota por AT y se obtiene cambiando
sus filas por columnas (o viceversa).
 */
package ArreglosYVectores;


import java.util.Random;

public class Ejercicio5_Practica {
    public static void main(String[] args) {
        Random num = new Random();

        // Matriz aleatoria de 4x4
        int[][] matriz = new int[4][4];
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                matriz[i][j] = num.nextInt(10);
            }
        }

        // Mostrar matriz A
        System.out.println("Matriz original:");
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                System.out.print("[" + matriz[i][j] + "]");
            }
            System.out.println();
        }

        // Matriz B (transpuesta)
        int[][] transpuesta = new int[4][4];
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                transpuesta[i][j] = matriz[j][i];
            }
        }

        // Mostrar matriz B
        System.out.println("Matriz transpuesta:");
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                System.out.print("[" + transpuesta[i][j] + "]");
            }
            System.out.println();
        }

        // Comprobación
        boolean Antisimetrica = true;
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                if (matriz[i][j] != -transpuesta[j][i]) {
                    Antisimetrica = false;
                    break;
                }
            }
            if (!Antisimetrica) {
                break;
            }
        }

        // Mostrar el resultado
        if (Antisimetrica) {
            System.out.println("La matriz es antisimétrica.");
        } else {
            System.out.println("La matriz no es antisimétrica.");
        }
    }
}