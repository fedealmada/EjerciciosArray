package arrays;

import java.util.Arrays;
import java.util.Scanner;

public class EjercicioArray8 {
    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);
        
        int [] arrayA = new int [5];
        for (int i = 0; i < arrayA.length; i++) {
            System.out.println("Ingrese un valor para el arreglo A:");
            arrayA[i] = lector.nextInt();
        }
        
        int [] arrayB = new int [5];
        for (int i = 0; i < arrayB.length; i++) {
            System.out.println("Ingrese un valor para el arreglo B:");
            arrayB[i] = lector.nextInt();
        }
        
        int [] arrayC = new int [5];
        for (int i = 0; i < arrayC.length; i++) {
            arrayC[i] = arrayA[i] + arrayB[i];
        }
        
        System.out.println(Arrays.toString(arrayA));
        System.out.println(Arrays.toString(arrayB));
        System.out.println(Arrays.toString(arrayC));
    }
}
