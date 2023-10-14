package arrays;

import java.util.Scanner;
import java.util.Arrays;

public class EjercicioArray1 {
    public static void main(String[] args) {
        int [] array = new int[5];
        Scanner lector = new Scanner(System.in);
        
        for (int i = 0; i < array.length; i++) {
            System.out.println("Ingrese un valor numerico:");
            array[i] = lector.nextInt();
        }
        
        System.out.println(Arrays.toString(array));
    }
}
