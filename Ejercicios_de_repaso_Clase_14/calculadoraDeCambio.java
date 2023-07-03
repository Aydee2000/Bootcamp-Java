package Ejercicios_de_repaso_Clase_14;

import java.util.Scanner;
public class calculadoraDeCambio {
    public static void main(String[] args){
       /* Crear un programa que funcione como una calculadora de cambio: Este programa debe recibir
        como entrada una cantidad de dinero y el costo de un producto. Utilizando la resta, el programa
        debe calcular el cambio que se debe entregar al cliente y mostrar la cantidad de billetes y
        monedas necesarios para el cambio. */

        System.out.println("Ingrese el costo del preducto:");
        Scanner costo = new Scanner(System.in);
        float costoDelProducto = costo.nextFloat();

        System.out.println("Ingrese la cantidad de dinero para pagar el producto:");
        float cantidadDedinero = costo.nextFloat();

        if (cantidadDedinero < costoDelProducto){
            float cantidadFaltante = costoDelProducto - cantidadDedinero;
            System.out.println("Falta abonar: $" + cantidadFaltante);
        } else {
            float cambioTotal = cantidadDedinero - costoDelProducto;
            System.out.println("El cambio total es: $" + cambioTotal);
        }

    }
}
