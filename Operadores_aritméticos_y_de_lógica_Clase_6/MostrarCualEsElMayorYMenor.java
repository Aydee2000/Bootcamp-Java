package Operadores_aritméticos_y_de_lógica_Clase_6;

import java.util.Scanner;

public class MostrarCualEsElMayorYMenor {
    public static void main(String[] args) {
        /*Armar un programa que permita cargar 3 números y mostrar cual es el mayor y cual es
        el menor.*/

        Scanner scanner = new Scanner(System.in);
        int[] numeros = new int[3];

        for (int i = 0; i < numeros.length; i++){
            System.out.println("Ingresa un numero:");
            numeros[i] = scanner.nextInt();
        }

        int mayor = 0;
        int menor = 0;

        for (int numReales = 0; numReales < numeros.length; numReales++){
            int num = numeros[numReales];

            if (num >= mayor || numReales == 0){
                mayor = num;
            } if (num <= menor || numReales == 0){
                menor = num;
            }
        }

        System.out.println("El numero mayor es: " + mayor);
        System.out.println("El numero menor es: " + menor);
    }
}
