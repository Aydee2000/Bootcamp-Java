package Programacion_Orientada_a_Objetos_Clase_10;

import java.util.Scanner;

public class Cuenta {
    public static void main(String[] args) {
        /* Crea una clase llamada Cuenta que tendrá los siguientes atributos: titular (que es una
                persona) y cantidad (puede tener decimales). Construye los siguientes métodos para la
        clase:

        ● Un constructor, donde los datos pueden estar vacíos.
        ● Los setters y getters para cada uno de los atributos. El atributo no se puede
          modificar directamente, sólo ingresando o retirando dinero.
        ● mostrar(): Muestra los datos de la cuenta.
        ● ingresar(cantidad): se ingresa una cantidad a la cuenta, si la cantidad introducida
          es negativa, no se hará nada.
        ● retirar(cantidad): se retira una cantidad a la cuenta. La cuenta puede estar en
          números rojos.
         */

        Cliente cuenta = new Cliente("Dylan Wos", 1000.0);
        cuenta.mostrar();

        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese el monto a ingresar: ");
        double montoIngreso = scanner.nextDouble();
        cuenta.ingresar(montoIngreso);

        System.out.print("Ingrese el monto a retirar: ");
        double montoRetiro = scanner.nextDouble();
        cuenta.retirar(montoRetiro);

        System.out.println("----------------------------");
        System.out.println("---- Datos de la cuenta ----");
        System.out.println("----------------------------");
        cuenta.mostrar();

        scanner.close();
    }
}

