package Arreglos_Clase_7;

import java.util.Scanner;

public class Numeros {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] numeros = new int[5];

        for (int contador = 0; contador < numeros.length; contador++) {
            System.out.println("Ingresa un numero: ");
            numeros[contador] = scanner.nextInt();
        }

        System.out.print("Los numeros que ingresaste son: ");

        for (int contador = 0; contador < numeros.length; contador++) {
            System.out.print(numeros[contador]+ " ");
        }

        int mayor = 0;
        int menor = 0;
        int suma = 0;
        for (int contador = 0; contador < numeros.length; contador++) {
            int num = numeros[contador];
            suma+= num;

            if (num >= mayor || contador == 0 ){
                mayor = num;
            } if (num <= menor || contador == 0){
                menor = num;
            }
        }
        double promedio = (double) suma / numeros.length;

        System.out.println("\nEl número mayor que ingresaste es: " + mayor);
        System.out.println("El número menor que ingresaste es: " + menor);
        System.out.println("El promedio de los números es: " + promedio);
        }
    }

