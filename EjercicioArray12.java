package arrays;

import java.util.Arrays;
import java.util.Scanner;

public class EjercicioArray12 {
    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);
        int n, m;
        
        System.out.println("Ingrese el tamaño el arreglo:");
        n= lector.nextInt();
        
        System.out.println("Ingrese un valor para usarlo como multiplo:");
        m = lector.nextInt();
        
        int [] array = new int [n];
        
        for (int i = 0; i < array.length; i++) {
            array[i] = m * (i + 1);
        }
        
        System.out.println(Arrays.toString(array));
    }
}

