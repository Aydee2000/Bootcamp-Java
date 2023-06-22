package Calculadora_de_descuento;

import java.util.Scanner;

public class CalculadoraDescuento {
    public static void main(String[] args) {
    System.out.println("Ingrese el precio original del producto: ");

    Scanner precioOrigin = new Scanner(System.in);
    double precioOriginal = precioOrigin.nextDouble();

    System.out.println("Ingrese el descuento que tiene el producto: ");
    Scanner miniDescuento = new Scanner(System.in);
    int descuento = miniDescuento.nextInt();

    double precioFinal = precioOriginal - (precioOriginal * descuento / 100);

    System.out.println("El precio final del producto es: " + precioFinal);
  }
}
