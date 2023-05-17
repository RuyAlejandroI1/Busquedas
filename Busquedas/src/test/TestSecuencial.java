package test;

import java.util.Arrays;

import Busquedas.Secuencial;

public class TestSecuencial {

    public static void main(String[] args) {
    	
        Integer[] datos = {2, 255, 10, 0, 11, 1172, 1};
        System.out.println("Array: " + Arrays.toString(datos));
        
        //Búsqueda de la posición de forma secuencial		
        Integer index = Secuencial.secuencial(datos, 11); // Busca 11
        System.out.println("Buscando 11 ...");
        //Mostrar resultado
        if (index != null) {
            System.out.println("Elemento encontrado en la posición " + index);
        } else {
            System.out.println("Elemento no encontrado");
        }
		
        index = Secuencial.secuencial(datos, 12); // Busca 12
        System.out.println("Buscando 12 ...");
        //Mostrar resultado
        if (index != null) {
            System.out.println("Elemento encontrado en la posición " + index);
        } else {
            System.out.println("Elemento no encontrado");
        }
    }
}

