package Ejemplos;

public class Ejemplo5 {


    // Definir la función para la cual se busca la raíz
    static double funcion(double x) {
        return Math.pow(x, 8) - 9;
    }

    // Método de bisección
    static double biseccion(double a, double b, double tolerancia) {
        double c;
        do {
            // Calcular el punto medio
            c = (a + b) / 2;

            // Verificar si la raíz está en la izquierda o derecha del punto medio
            if (funcion(c) == 0.0)
                break;
            else if (funcion(c) * funcion(a) < 0)
                b = c;
            else
                a = c;

        } while ((b - a) >= tolerancia);

        return c;
    }

    public static void main(String[] args) {
        // Especificar el intervalo [a, b] y la tolerancia
        double a = 1.0;
        double b = 2.0;
        double tolerancia = 0.0001;

        // Llamar al método de bisección
        double raiz = biseccion(a, b, tolerancia);

        // Imprimir la raíz aproximada
        System.out.println("La raíz aproximada es: " + raiz);
    }
}