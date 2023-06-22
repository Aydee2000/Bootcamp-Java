package Operadores_aritméticos_y_de_lógica_Clase_6;

import java.util.Scanner;

public class BuscadorDeTweets {
    public static void main(String[] args) {
       /* Arma un buscador de tweets para Twitter.com. Es bastante similar al anterior.
        Pídele al usuario que ingrese el nombre de una celebridad (de una sola palabra), por ejemplo:
        “Messi”.
        Después muestra en consola la concatenación de:
        “https://twitter.com/search?q=” + palabra */

       System.out.println("Ingresa el nombre de una celebridad de una sola palabra:");

        Scanner scanner = new Scanner(System.in);
        String palabra = scanner.nextLine();

        String url = "https://twitter.com/search?q=" + palabra;

        System.out.println("https://twitter.com/search?q=" + url);
    }
}
