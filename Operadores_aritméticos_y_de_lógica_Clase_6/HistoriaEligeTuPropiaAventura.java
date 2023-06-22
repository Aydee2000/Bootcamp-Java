package Operadores_aritméticos_y_de_lógica_Clase_6;

import java.util.Scanner;

public class HistoriaEligeTuPropiaAventura {
    public static void main(String[] args) {
        /*Crear un programa que cuente una historia al estilo de “Elige tu propia Aventura”.
        Los libros de “Elige tu propia aventura” eran historias interactivas, en el que el lector en
        un momento podía elegir a qué página ir. El ejercicio consiste en hacer un pequeño
        cuento de este estilo */
        Scanner scanner = new Scanner(System.in);
        int opcion;

        System.out.println("Es una noche estrellada, te encuentras en un bosque misterioso:");
        opcion = mostrarOpciones(scanner,
                "Exploras la oscuridad en busca de la fuente de un susurro escalofriante",
                "Sigues el sendero iluminado hacia una pequeña cabaña acogedora");

        if (opcion == 1) {
            System.out.println("Exploras la oscuridad en busca de la fuente de un susurro escalofriante.");
            System.out.println("Te adentras más en el bosque y encuentras un antiguo templo.");
            opcion = mostrarOpciones(scanner,
                    "Entras al templo en busca de respuestas",
                    "Decides volver al sendero iluminado");

            if (opcion == 1) {
                System.out.println("Entras al templo y descubres que está lleno de trampas mortales.");
                System.out.println("No logras sobrevivir y tu aventura llega a su fin.");
            } else if (opcion == 2) {
                continuarHistoria(scanner);
            }
        } else if (opcion == 2) {
            System.out.println("Decides seguir el sendero iluminado hacia la pequeña cabaña acogedora.");
            continuarHistoria(scanner);
        }

        scanner.close();
    }

    private static int mostrarOpciones(Scanner scanner, String opcion1, String opcion2) {
        System.out.println("1) " + opcion1);
        System.out.println("2) " + opcion2);
        return scanner.nextInt();
    }

    private static void continuarHistoria(Scanner scanner) {
        int opcion;

        System.out.println("Al llegar a la cabaña, te das cuenta de que hay dos puertas:");
        opcion = mostrarOpciones(scanner,
                "Entras por la puerta de la izquierda",
                "Optas por la puerta de la derecha");

        if (opcion == 1) {
            System.out.println("Al abrir la puerta de la izquierda, te encuentras con una habitación llena de tesoros brillantes y mágicos.");
            System.out.println("Te maravillas con las joyas y los objetos preciosos que llenan la sala.");
            System.out.println("Te das cuenta de que has encontrado el legendario tesoro perdido del bosque.");
            System.out.println("Con tu corazón lleno de emoción y riquezas, decides regresar a casa para compartir tu increíble aventura con el mundo.");
            System.out.println("¡Felicidades, has tenido un final exitoso en tu búsqueda!");
        } else if (opcion == 2) {
            System.out.println("Al abrir la puerta de la derecha, te encuentras en una habitación oscura y vacía.");
            System.out.println("De repente, la puerta se cierra detrás de ti y quedas atrapado.");
            System.out.println("No logras escapar y tu aventura llega a su fin.");
        }
    }
}