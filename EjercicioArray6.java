package arrays;

import java.util.Arrays;
import java.util.Scanner;


public class EjercicioArray6 {
    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);
        int n = 0;
        int buscado = 0;
        
        System.out.println("Ingrese la cantidad de números a ingresar:");
        n = lector.nextInt();
        
        int [] array = new int[n];
        
        for (int i = 0; i < array.length; i++) {
            System.out.println("Ingrese un valor:");
            array[i] = lector.nextInt();
        }
        
        System.out.println(Arrays.toString(array));
        
        System.out.println("Que número desea buscar?");
        buscado = lector.nextInt();
        
        
        for (int i = 0; i < array.length; i++) {
            if(buscado == array[i]) {
                System.out.println("El numero " + buscado + " se encuentra en el indice " + i + " del arreglo");
                break;
            }
            
            if(i == array.length - 1) {
                System.out.println("El numero no se encuentra en el arreglo.");
            }
        }  
    }
}
