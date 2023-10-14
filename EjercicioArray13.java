package arrays;

import java.util.Arrays;
import java.util.Scanner;

public class EjercicioArray13 {
    public static void main(String[] args) {
       Scanner lector = new Scanner(System.in);
       
        int n; // Esta variable va a almacenar el tamaño máximo del arreglo que será ingresado por teclado.
        int mayor1 =  Integer.MIN_VALUE, mayor2 = Integer.MIN_VALUE;
        
        System.out.println("Ingrese un valor para el tamaño del arreglo:");
        n = lector.nextInt(); 
        
        int [] array = new int [n];
       
        for (int i = 0; i < array.length; i++) {
            System.out.println("Ingrese un valor:");
            array[i] = lector.nextInt();
           
            if(mayor1 < array[i]) {
                mayor2 = mayor1;
                mayor1 = array[i];
            }
            else if (array[i] > mayor2) { 
                mayor2 = array[i];
            }
        }
   
        System.out.println(Arrays.toString(array));
        System.out.println("El primer numero mayor es " + mayor1);
        System.out.println("El segundo numero mayor es " + mayor2);
    }
}
