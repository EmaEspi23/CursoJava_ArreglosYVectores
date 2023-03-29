/*
Realizar un algoritmo que llene un vector con los 100 primeros números
enteros y los muestre por pantalla en orden descendente.
 */


package ArreglosYVectores;

import java.util.Scanner;

public class Ejercicio1_Practica_Clase {

    public static void main(String[] args) {
        
    Scanner leer = new Scanner(System.in);
    int[] vector = new int[100];// dimension vector 
    //vector[0] = 100; // imprime valores al vector
    // asigno valoresvector.length; 
    for (int i = 0; i< vector.length ;i++) {
            vector[i] = 100 - i;
    }

    //se muestra el vector 
    for (int i = 0; i< vector.length ;i++) {
            System.out.println("[" + vector[i] + "]");
    }

}
}
