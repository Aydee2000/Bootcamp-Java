package Operadores_aritméticos_y_de_lógica_Clase_6;

import java.util.Scanner;

public class BuscadorConGoogleMaps {
    public static void main(String[] args) {

        /*Arma un buscador de países con Google Maps.
        Primero, pidele al usuario que ingrese un país (Ej: Colombia).
        Después muestra en consola la concatenación de:
        “https://www.google.com/maps/search/” + pais
        Entonces, cuando hagas click en el link que aparece en consola, te abrirá esa ubicación.*/

        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingresa un pais: ");
        String pais = scanner.nextLine();

        String url = "https://www.google.com/maps/search/" + pais;

        System.out.println("https://www.google.com/maps/search/" + url);

    }
}
