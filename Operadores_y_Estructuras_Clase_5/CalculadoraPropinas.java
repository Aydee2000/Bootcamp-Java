package Calculadora_de_propinas;

import java.util.Scanner;

public class CalculadoraPropinas {
    public static void main(String[] args){
      System.out.println("Ingresa el total a pagar de la cuenta del restaurante:");

        Scanner pagoCuenta = new Scanner(System.in);
        double totalCuenta = pagoCuenta.nextDouble();

        System.out.println("Ingresa la propinas que deseas dejar:");

        Scanner propinas = new Scanner(System.in);
        int porcentajePropina = propinas.nextInt();

        double propina = totalCuenta * (porcentajePropina / 100);
        System.out.println("Dejaste en el restaurante en total: " + propina);
 }
}
