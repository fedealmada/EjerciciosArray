package arrays;

import java.util.Arrays;

public class EjercicioArray2 {
    public static void main(String[] args) {
        int [] array = {1, 2, 3, 4};
        double [] arrayAux = new double [4];
       
        System.out.println(Arrays.toString(array));
        
        for (int i = 0; i < array.length; i++) {
            arrayAux[i] = (double)array[i] / 2; 
        }
        
        System.out.println(Arrays.toString(arrayAux));
    }
}
