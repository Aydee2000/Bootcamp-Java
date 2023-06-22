package EdadDePerros;

import java.util.Scanner;

public class EdadDePerros {
    public static void main(String[] args) {
        //Pide al usuario que ingrese su edad
        System.out.println("Coloca la edad que tienes:");

        // Se crea el Scanner para que el usuario pueda ingresar el dato correspondiente
        Scanner edadDeUsuario = new Scanner(System.in);
        int edadUser = edadDeUsuario.nextInt();

        // Le muestra al usuario un mensaje y al mismo tiempo hace el calculo
        System.out.println("La edad de tu perro es: " + (edadUser * 7) + " años");
    }
}
