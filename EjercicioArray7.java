package arrays;

import java.util.Arrays;
import java.util.Scanner;

public class EjercicioArray7 {
    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);
        int t, m;
        
        System.out.println("Ingrese un valor para T:");
        t = lector.nextInt();
        
        System.out.println("Ingrese un valor para M:");
        m = lector.nextInt();
        
        int [] array = new int [t];
        
        for (int i = 0; i < array.length; i++) {
            array[i] = m * i;
        }
        
        System.out.println(Arrays.toString(array));
    }
}
