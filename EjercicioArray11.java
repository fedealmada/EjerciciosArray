package arrays;

import java.util.Arrays;
import java.util.Scanner;

public class EjercicioArray11 {
    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);
        
        int opcion;
        
        double [] array = new double [5];
        
        for (int i = 0; i < array.length; i++) {
            array[i] = Math.round(Math.random() * 100);
        }
        
        System.out.println(Arrays.toString(array));
        
        System.out.println("Ingrese una posicion para poner en cero.");
        opcion = lector.nextInt();
        
        array[opcion] = 0;
        
        System.out.println(Arrays.toString(array));
    }
}


