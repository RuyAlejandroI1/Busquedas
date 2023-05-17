package Busquedas;

public class Secuencial {
	
    public static Integer secuencial(Integer[] data, int valor) {
        Integer pos = null;
        for (int i = 0; i < data.length; i++) {
            if (valor == data[i]) {
                pos = i;
                break;
            }
        }
        return pos;
    }
}

