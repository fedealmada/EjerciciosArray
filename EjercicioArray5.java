package arrays;

import java.util.Arrays;
import java.util.Scanner;

public class EjercicioArray5 {
    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);
        int n = 0;
        
        System.out.println("Ingrese la cantidad de nombres a ingresar:");
        n = lector.nextInt();
        
        String [] array = new String[n];
        
        for (int i = 0; i < array.length; i++) {
            System.out.println("Ingrese un nombre:");
            array[i] = lector.next();
        }
        
        System.out.println(Arrays.toString(array));
    }
}
