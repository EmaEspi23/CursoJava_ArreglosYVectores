/*
Construya un programa que lea 5 palabras de mínimo 3 y hasta 5 caracteres y,
a medida que el usuario las va ingresando, construya una “sopa de letras para
niños” de tamaño de 20 x 20 caracteres. Las palabras se ubicarán todas en orden
horizontal en una fila que será seleccionada de manera aleatoria. Una vez
concluida la ubicación de las palabras, rellene los espacios no utilizados
con un número aleatorio del 0 al 9. Finalmente imprima por pantalla la sopa de
letras creada.
Nota: Para resolver el ejercicio deberá investigar cómo se utilizan las
siguientes funciones de Java substring(), Length() y Math.random().
 */
package ArreglosYVectores;

import java.util.Scanner;

public class Ejercicio6_Extras1 {

    public static void main(String[] args) {

//Este programa ubica al azar en una matriz de 20x20 5 palabras.
        String mat[][] = new String[20][20];
        String palabrasIngresadas[]= new String[5];
        palabrasIngresadas=ingresaPalabras();
        
        //mostrarPalabrasIngresadas(palabrasIngresadas);
        //Falta algoritmo elige posiciones al azar sin repetidos
        int[] posicionesPalabras = new int[5];
        posicionesPalabras=obtenerPosicionesFilas();
        //mostrarPosicion(posicionesPalabras);
        mat= crearMatriz();
        mostrarMatriz(mat);
        colocarPalabras(posicionesPalabras,mat,palabrasIngresadas);
        mostrarMatriz(mat);
        
    }
    
    public static String[] ingresaPalabras(){
        String palabrasIngresadas[]= new String[5];
        Scanner sc = new Scanner(System.in);
        String palabra = "";
        for (int i = 0; i < 5; i++) {
            do {
                System.out.println("Ingrese la palabra a ingresar en la sopa");
                palabra = sc.next();
            } while (!bienEscrita(palabra));
            palabrasIngresadas[i]=palabra;

        }
        return palabrasIngresadas;
        
    }
    
    public static boolean bienEscrita(String palabra){
        return palabra.length()>=3 && palabra.length()<=5;
    }
    
    
    public static String[][]   crearMatriz(){
    String mat[][] = new String[20][20];
        for (int i = 0; i < 20; i++) {
            for (int j = 0; j < 20; j++) {
                mat[i][j]="1";
            }
        }
    return mat;
    }
    
     public static void mostrarPosicion(int[] vector){
        for (int i = 0; i < 5; i++) {
            
            System.out.println(vector[i]);
        }
    }
     
     public static void mostrarPalabrasIngresadas(String[] vector){
        for (int i = 0; i < 5; i++) {
            
            System.out.println(vector[i]);
        }
    }
     
     
    
    public static void mostrarMatriz(String[][] matriz){
        for (int i = 0; i < 20; i++) {
            for (int j = 0; j < 20; j++) {
                System.out.print ("[" +matriz[i][j] +"] ");
            }
            System.out.println("");
        }
    }
    public static int[] obtenerPosicionesFilas(){
     int[] posicionesPalabras = new int[5];
     int candidato= (int) (Math.random()*20+1);
     posicionesPalabras[0]=candidato;
        for (int i = 1; i <= 4; i++) {
            do {
                candidato = (int) (Math.random()*20+1);
            } while (estaAnteriorMente(posicionesPalabras,i,candidato));
            posicionesPalabras[i]=candidato;
        }
    
     return posicionesPalabras;
     
    }
    
    public static boolean estaAnteriorMente(int[] posiciones, int posicionActual,int nroBuscado){
        boolean encontrado=false;
        for (int i = 0; i < posicionActual ; i++) {
             if (posiciones[i]==nroBuscado) {
                encontrado=true;
            }
        }
        return encontrado;
    }
    
    public static void colocarPalabras(int[] posicionesPalabras,String mat[][],String[] palabrasIngresadas){
        for (int p = 0; p < 5; p++) { //posicion fila de las palabras
            for (int i = 0; i < 20; i++) {
                for (int j = 0; j < 20; j++) {
                    if (posicionesPalabras[p] == i) {
                        for (int k = 0; k < palabrasIngresadas[p].length(); k++) {
                            mat[i][k] = String.valueOf(palabrasIngresadas[p].charAt(k));
                        }
                    }

                }
            }
        }

            
        }
    
       
        
    }
