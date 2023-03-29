/*
Realizar un programa que complete un vector con los N primeros números de la
sucesión de Fibonacci. Recordar que la sucesión de Fibonacci es la sucesión de
los siguientes números:
1, 1, 2, 3, 5, 8, 13, 21, 34, ...
Donde cada uno de los números se calcula sumando los dos anteriores a él.
Por ejemplo: La sucesión del número 2 se calcula sumando (1+1)
Análogamente, la sucesión del número 3 es (1+2),
Y la del 5 es (2+3),
Y así sucesivamente…
La sucesión de Fibonacci se puede formalizar de acuerdo a la siguiente fórmula:
Fibonaccin = Fibonaccin-1 + Fibonaccin-2 para todo n>1
Fibonaccin = 1 para todo n<=1
Por lo tanto, si queremos calcular el término “n” debemos escribir una función
que reciba como parámetro el valor de “n” y que calcule la serie hasta llegar
a ese valor.
 */
package ArreglosYVectores;

import java.util.Scanner;

public class Ejercicio7_Extras {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("-- Sucesión de Fibonacci --");
        System.out.println("---------------------------");
        System.out.println("Por favor ingrese la cantidad de Fibonacci:");
        int num = leer.nextInt(); //Cantidad de nros en la lista de FIbonacci.
        int[] fibo = new int[num]; //Tamaño del vector.
        Fibonacci(num);
    }
    
    public static void Fibonacci(int num) {
        int[] fibo = new int[num];
        int num1 = 0;
        int num2 = 1;
        for (int i = 0; i < num; i++) {
            if (num == 1) {
                System.out.println("Sucesión de Fibonacci para " + num + " número :");
                System.out.println("[" + num2 + "]");
            }else {
                System.out.print("[" + num1 + "]");
            }
            int num3 = num1 + num2;
            num1 = num2;
            num2 = num3;

        }
        System.out.println("");
    }
}
