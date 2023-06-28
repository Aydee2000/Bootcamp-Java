package Funciones_y_primeros_pasos_con_Springboot_Clase_8;

import java.util.Scanner;

public class Ejercicio_5 {
    public static void main(String[] args) {
        /* Hacer nuevamente el juego de Piedra, Papel o Tijeras pero utilizando funciones, arreglos
        y bucles */

       String[] opciones = {"piedra", "papel", "tijeras"};

        Scanner scanner = new Scanner(System.in);

        Boolean jugar = true;

        while(jugar) {

            System.out.println("Ingresa tu eleccion (piedra, papel o tijeras):");
            String eleccionJugador = scanner.nextLine().toLowerCase();

            String eleccionComputadora = generadorDeOpcionesCompu(opciones);

            System.out.println("La eleccion de la computadora es: " + eleccionComputadora);
            String resultado = determinandoGanadador(eleccionJugador, eleccionComputadora);
            System.out.println(resultado);

            System.out.print("¿Quieres jugar de nuevo? (s/n): ");
            String opcion = scanner.nextLine().toLowerCase();

            if (opcion.equals("n")) {
                jugar = false;
            }
        }
        scanner.close();
    }
      public static String generadorDeOpcionesCompu(String[] opciones){
            int indice = (int) (Math.random() * opciones.length);
            return opciones[indice];
      }

      public static String determinandoGanadador(String eleccionJugador, String eleccionComputadora){
        if (eleccionJugador.equals(eleccionComputadora)){
            return "Empate";
        } else if ((eleccionJugador.equals("piedra") && eleccionComputadora.equals("tijeras"))
                || (eleccionJugador.equals("papel") && eleccionComputadora.equals("piedra"))
                || (eleccionJugador.equals("tijeras") && eleccionComputadora.equals("papel"))) {
            return "Ganaste";
        } else {
            return "Perdiste";
        }
    }
}
