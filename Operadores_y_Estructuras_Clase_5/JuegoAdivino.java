package Juego_de_adivinar_el_numero;

import java.util.Random;
import java.util.Scanner;

public class JuegoAdivino {
    public static void main(String[] args) {
        Random random = new Random();
        int numeroSecreto = random.nextInt(100) + 1;
        int intentos = 0;
        boolean haAdivinado = false;

        System.out.println("¡Bienvenido al juego de adivinar el número!");
        System.out.println("He generado un número entre 1 y 100. ¡Adivina cuál es!");

        Scanner scanner = new Scanner(System.in);

        while (!haAdivinado) {
            System.out.print("Introduce tu suposición: ");
            int suposicion = scanner.nextInt();
            intentos++;

            if (suposicion == numeroSecreto) {
                haAdivinado = true;
                System.out.println("¡Felicidades! Has adivinado el número en " + intentos + " intentos.");
            } else if (suposicion < numeroSecreto) {
                System.out.println("El número secreto es mayor que " + suposicion + ". Sigue intentándolo.");
            } else {
                System.out.println("El número secreto es menor que " + suposicion + ". Sigue intentándolo.");
            }
        }
        System.out.println("Te ganaste.. mi respeto ;)");
        scanner.close();

    }
}
