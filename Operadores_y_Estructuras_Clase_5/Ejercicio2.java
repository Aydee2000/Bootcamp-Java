package Conversor_de_millas_a_kilometros;

import java.util.Scanner;

public class Ejercicio2 {
    public static void main (String[] args) {
        System.out.println("Ingresa las millas recorridas: ");
        Scanner ingresarMillas = new Scanner(System.in);
        double millas = ingresarMillas.nextDouble();

         double kilómetros = millas * 1.60934;

         System.out.println("La distincia que recorriste en kilometros son: " + kilómetros);
    }
}
