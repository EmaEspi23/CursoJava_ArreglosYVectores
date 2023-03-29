/*
Recorrer un vector de N enteros contabilizando cuántos números son de 1
dígito, cuántos de 2 dígitos, etcétera (hasta 5 dígitos).
 */
package ArreglosYVectores;

import java.util.Scanner;

public class Ejercicio3_Practica {

    public static void main(String[] args) {
        
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese el tamaño del vector");
        int n = leer.nextInt();
        int[] vector = new int[n];
        for (int i = 0; i < vector.length; i++) {
            vector[i] = (int) (Math.random() * 10000) + 1;
        }
        for (int i = 0; i < vector.length; i++) {
            System.out.println(" [" + vector[i] + "] ");
        }
        String numeroD;
        int a = 0, b = 0, c = 0, d = 0, e = 0;
        for (int i = 0; i < vector.length; i++) {
            numeroD = String.valueOf(vector[i]);
            switch (numeroD.length()) {
                case 1:
                    a = a + 1;
                    break;
                case 2:
                    b = b + 1;
                    break;
                case 3:
                    c = c + 1;
                    break;
                case 4:
                    d = d + 1;
                    break;
                case 5:
                    e = e + 1;
                    break;
            }
        }
        System.out.println(" ");
        System.out.println("Los Nros de 1 digito son " + a);
        System.out.println("Los Nros de 2 digitos son " + b);
        System.out.println("Los Nros de 3 digitos son " + c);
        System.out.println("Los Nros de 4 digitos son " + d);
        System.out.println("Los Nros de 5 digitos son " + e);

    }

}
