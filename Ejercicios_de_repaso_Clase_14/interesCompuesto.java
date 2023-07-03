package Ejercicios_de_repaso_Clase_14;

import java.util.Scanner;

public class interesCompuesto {
    public static void main(String[] args){
      /*  Crear un programa para calcular el interés compuesto: Este programa debe permitir al usuario
        ingresar el capital inicial, la tasa de interés y el tiempo en años. Utilizando la fórmula del interés
        compuesto, el programa debe calcular el monto total acumulado y mostrarlo al usuario. */

        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese la Capital Inicial:");
        float inicial = scanner.nextFloat();
        System.out.println("Ingrese la Adicion Anual:");
        float adicionAnual = scanner.nextFloat();
        System.out.println("Ingrese la cantidad de Años:");
        float cantidadDeAnos = scanner.nextFloat();
        System.out.println("Ingrese la tasa de interes (%):");
        float interes = scanner.nextFloat();

        float cantidadFinal = inicial;

        for (int i = 0; i < cantidadDeAnos; i++){
            cantidadFinal += adicionAnual;
            cantidadFinal += cantidadFinal * interes / 100;
        }

        System.out.println("Al finalizar vas a tener: $ " + cantidadFinal);
    }
}
