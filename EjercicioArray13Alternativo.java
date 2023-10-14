package arrays;

import java.util.Arrays;
import java.util.Scanner;

public class Ejercicio13B {
    
    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);
        int n = 5;  // Variable que almacena el tamaño del arreglo.
        int [] array = new int[n];
        
        for (int i = 0; i < array.length; i++) { // Creamos un bucle for para añadir datos al arreglo.
            System.out.println("Ingrese un valor:");
            array[i] = lector.nextInt();
        }
        
        System.out.println("Sin ordenar " + Arrays.toString(array)); 
        Arrays.sort(array); // Este metodo lo usamos para ordenar el array de menor a mayor.
        System.out.println("Ordenado " + Arrays.toString(array));
        System.out.println("Primer mayor:" + array[array.length-1]);
        System.out.println("Segundo mayor:" + array[array.length-2]);
    }
}


