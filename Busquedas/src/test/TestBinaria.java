package test;

import java.util.Arrays;

import Busquedas.Binaria;

public class TestBinaria {
    public static void main(String[] args) {
        Integer[] datos = {2, 255, 10, 0, 11, 1172, 1};
        System.out.println("Array: " + Arrays.toString(datos));
        
        //Búsqueda de la posición por búsqueda binaria
        Arrays.sort(datos); // Ordenamiento de datos
        System.out.println("Array ordenado: " + Arrays.toString(datos));
        
        Integer index = Binaria.binario(datos, 11);
        System.out.println("Buscando 172 ..."); 
        //Mostrar resultado
        if (index != null) {
            System.out.println("Elemento encontrado en la posición " + index);
        } else {
            System.out.println("Elemento no encontrado");
        }
        
        index = Binaria.binario(datos, 255);
        System.out.println("Buscando 255 ...");
        //Mostrar resultado
        if (index != null) {
            System.out.println("Elemento encontrado en la posición " + index);
        } else {
            System.out.println("Elemento no encontrado");
        }
    }
}
