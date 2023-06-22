package Operadores_aritméticos_y_de_lógica_Clase_6;

import java.util.Locale;
import java.util.Random;
import java.util.Scanner;

public class JuegoPiedraPapelTijeras {
    public static void main(String[] args) {
        /*Escribe un programa que permita al usuario jugar el juego clásico de "piedra, papel,
        tijeras" contra la computadora. El programa debe solicitar al usuario que ingrese su
        elección (piedra, papel o tijeras) y luego generar una elección aleatoria para la
        computadora. Después de eso, el programa debe determinar el ganador según las reglas
        del juego y mostrar el resultado*/
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        System.out.println("Bienvenido al juego Piedra, Papel o Tijeras");
        System.out.println("--------------------------------------------");
        System.out.println("Ingrese su eleccion: piedra, papel o tijeras");
        String jugador = scanner.nextLine().toLowerCase();

        int computadora = random.nextInt(3);

        String opcionComputadora;
        switch (computadora){
            case 0:
                opcionComputadora = "piedra";
                break;
            case 1: opcionComputadora = "papel";
                break;
            case 2: opcionComputadora = "tijeras";
                break;
            default:
                opcionComputadora = " ";
                break;
        }
        System.out.println("La computadora eligio: " + opcionComputadora);

        if (jugador.equals(opcionComputadora)){
            System.out.println("Empate!");
        } else if ((jugador.equals("piedra") && opcionComputadora.equals("tijeras")) ||
                (jugador.equals("papel") && opcionComputadora.equals("piedra")) ||
                (jugador.equals("tijeras") && opcionComputadora.equals("papel"))) {
            System.out.println("Ganaste!");
        } else {
            System.out.println("La computadora gana");
        }
    }
}
