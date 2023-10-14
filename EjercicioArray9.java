package arrays;

import java.util.Scanner;

public class EjercicioArray9 {
    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);
        int positivos = 0, negativos = 0;
        int [] array = new int [5];
        
        for (int i = 0; i < array.length; i++) {
            System.out.println("Ingrese un numero positivo o negativo:");
            array[i] = lector.nextInt();
            
            if(array[i] > 0) {
                positivos++;
            }
            
            else if(array[i] < 0) {
                negativos++;
            }
        }
        
        System.out.println("Hay " + positivos + " numeros positivos");
        System.out.println("Hay " + negativos + " numeros negativos");
    }
}
