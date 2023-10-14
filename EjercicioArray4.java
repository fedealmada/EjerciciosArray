package arrays;

import java.util.Arrays;
import java.util.Scanner;


public class EjercicioArray4 {
    public static void main(String[] args) {
        double [] array = new double[10];
        Scanner lector = new Scanner(System.in);
        
        for (int i = 0; i < array.length; i++) {
            array[i] = Math.round(Math.random()*1000);
        }
        
        System.out.println(Arrays.toString(array));
    }
}
