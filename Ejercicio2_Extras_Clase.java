/*
Escriba un programa que averigüe si dos vectores de N enteros son iguales
(la comparación deberá detenerse en cuanto se detecte alguna diferencia
entre los elementos).
 */
package ArreglosYVectores;

import java.util.Random;
import java.util.Scanner;


public class Ejercicio2_Extras_Clase {


    public static void main(String[] args) {
        
Scanner leer = new Scanner(System.in);
        Random rdm = new Random();
        System.out.println("Ingrese el tamaño de los vectores");
        int tamanio = leer.nextInt();
        int [] vec = new int [tamanio];
       int [] vec2 = new int [tamanio];
       
        for (int i = 0; i < vec.length; i++) {
            vec[i] = rdm.nextInt(5);
            vec2[i] = rdm.nextInt(5);
            
                
            }
            for (int i = 0; i < vec.length; i++) { //muestra vec1
                System.out.print("[" + vec[i] + "]");
                
                }
            System.out.println("");
            
            for (int i = 0; i < vec.length; i++) {
                System.out.print("[" + vec2[i] + "]"); // muestra vec2
            
        }
            System.out.println("");
            
          for (int i = 0; i < vec.length; i++) {
            if (vec[i] == vec2[i]) {
                System.out.println("Se repite el Vector");
            } else {
                System.out.println("No se repite el Vector");
                break;         
            }
           
        }
            
        }
        }