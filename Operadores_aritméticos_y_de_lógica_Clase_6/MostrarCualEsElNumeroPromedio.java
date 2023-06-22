package Operadores_aritméticos_y_de_lógica_Clase_6;

import java.util.Scanner;

public class MostrarCualEsElNumeroPromedio {
    public static void main(String[] args) {
        /*Armar un programa que permita cargar 3 números y mostrar cual es el número promedio*/
        Scanner scanner = new Scanner(System.in);

        int[] numeros = new int[3];

        for (int i = 0; i < numeros.length; i++){
            System.out.println("Ingresa un numero:");
            numeros[i] = scanner.nextInt();
        }

        int suma = 0;

        for (int i = 0; i < numeros.length; i++){
            int num = numeros[i];
            suma += num;
        }
        double promedio = (double) suma / numeros.length;

        System.out.println("El promedio de los numeros son: " + promedio);
    }
}
