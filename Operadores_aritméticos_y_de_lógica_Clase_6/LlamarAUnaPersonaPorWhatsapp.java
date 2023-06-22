package Operadores_aritméticos_y_de_lógica_Clase_6;

import java.util.Scanner;

public class LlamarAUnaPersonaPorWhatsapp {
    public static void main(String[] args) {
        /*Arma un programa que permita llamar a una persona por Whatsapp. Es similar al
        anterior.
                Pídele al usuario que ingrese un número de telefono sin espacios, por ejemplo: 5493541539405
        Después muestra en consola la concatenación de:
        “https://api.whatsapp.com/send?phone=” + telefono*/

        System.out.println("Ingresa un numero de telefono sin estacios:");

        Scanner numer = new Scanner(System.in);
        String telefono = numer.nextLine();

        String url = "https://api.whatsapp.com/send?phone=" + telefono;

        System.out.println("https://api.whatsapp.com/send?phone=" + url);
    }
}
