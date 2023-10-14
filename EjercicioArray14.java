package arrays;

import java.util.Arrays;

public class EjercicioArray14 {
    public static void main(String[] args) {
        
        // 14)	Buscar el valor mayor de un array de N datos utilizando un bucle for mejorado.
       
        int [] valores = {5, 31, 22, 46, 105}; // Creamos y asigamos valores al arreglo.
        int mayor = Integer.MIN_VALUE; // Creamos una variable para almacenar el mayor valor del arreglo.
        
        for(int valor : valores) { // For-each es un for mejorado "atajo: fore" que recorre cada dato del arreglo.
            if(mayor < valor) { // Si mayor es mas chico que el valor actual recorrido en el bucle.
                mayor = valor; // El mayor pasa a ser el valor actual.  
            } 
            // De lo contrario pasa a revisar el siguente valor.   
        }
       
        System.out.println(Arrays.toString(valores));
        System.out.println("Numero mayor: " + mayor);
    }
}
