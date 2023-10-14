package arrays;

import java.util.Arrays;
import java.util.Scanner;

public class EjercicioArray10 {
    public static void main(String[] args) {
        int n, opcion;
        
        Scanner lector = new Scanner(System.in);
        
        System.out.println("Ingrese la cantidad de paises a guardar en el arreglo:");
        n = lector.nextInt();
       
        String [] array = new String[n];
        
        for (int i = 0; i < array.length; i++) {
            System.out.println("Ingrese un nombre de pais:");
            array[i] = lector.next();
        }
        
        System.out.println(Arrays.toString(array));
        
        System.out.println("Ingrese una posicion para buscar el dato:");
        opcion = lector.nextInt();
        
        System.out.println(array[opcion]);
        
    }
}
