/*
Los profesores del curso de programación de Egg necesitan llevar un registro
de las notas adquiridas por sus 10 alumnos para luego obtener una cantidad de
aprobados y desaprobados. Durante el período de cursado cada alumno obtiene 4
notas, 2 por trabajos prácticos evaluativos y 2 por parciales. Las ponderaciones
de cada nota son:
Primer trabajo práctico evaluativo 10%
Segundo trabajo práctico evaluativo 15%
Primer Integrador 25%
Segundo integrador 50%
Una vez cargadas las notas, se calcula el promedio y se guarda en el arreglo.
Al final del programa los profesores necesitan obtener por pantalla la cantidad
de aprobados y desaprobados, teniendo en cuenta que solo aprueban los alumnos
con promedio mayor o igual al 7 de sus notas del curso.
 */
package ArreglosYVectores;

import java.util.Random;
import java.util.Scanner;

public class Ejercicio4_Extras_Clase {
    public static void main(String[] args) {
        
        Scanner leer = new Scanner(System.in);
        Random rdm = new Random();
        
        int[] Nota1 = new int[10];
        int[] Nota2 = new int[10];
        int[] Nota3 = new int[10];
        int[] Nota4 = new int[10];
        String[] Nombre = new String[10];
        
        double[] Promedio = new double[10];
        int aprueba = 0;
        int desaprueba = 0;
        
        for (int i = 0; i < Nota1.length; i++) {
            System.out.println("Ingrese el nombre del alumno ");
            Nombre[i] = leer.nextLine();
            Nota1[i] = rdm.nextInt(10);
            Nota2[i] = rdm.nextInt(10);
            Nota3[i] = rdm.nextInt(10);
            Nota4[i] = rdm.nextInt(10);
            
            Promedio[i] =  (Nota1[i]*0.10) + (Nota2[i]*0.15) + (Nota3[i]*0.25) + (Nota4[i]*0.50);
            if (Promedio[i] >= 7) {
                System.out.println(Nombre[i] + " aprobó, Su nota es: " + Promedio[i] );
                aprueba++;
            } else {
                System.out.println(Nombre[i] + " desaprobó, Su nota es: " + Promedio[i]);
                desaprueba++;
            }
        }
        System.out.println("Los aprobados son: " + aprueba + ", los desaprobados son: " + desaprueba);
    }
}