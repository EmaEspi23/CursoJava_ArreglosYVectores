/*
Realizar un algoritmo que calcule la suma de todos los elementos de un
vector de tamaño N, con los valores ingresados por el usuario.
 */
package ArreglosYVectores;

import java.util.Scanner;

public class Ejercicio1_Extras_Clase {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese un tamaño para el Vector");
        int tamanio = leer.nextInt();
        int[] vector = new int[tamanio];
        int num = 0;
        int suma = 0;
        
        for (int i = 0; i < tamanio; i++) { // llenar vector 
            System.out.println("Ingrese un Nro :");
            num = leer.nextInt();
            vector[i] += num;
            suma += num;
        }
        
                    System.out.println("El vector es :");
        for (int i = 0; i < tamanio; i++) { //muestra vector

            System.out.print("[" + vector[i] + "]");
        
    }  
        System.out.println("");
        
        System.out.println("La suma de los Nros Ingresados es : " + suma);
        }
}
