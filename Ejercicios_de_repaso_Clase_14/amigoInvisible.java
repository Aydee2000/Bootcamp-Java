package Ejercicios_de_repaso_Clase_14;

import java.util.Scanner;
public class amigoInvisible {
    public static void main(String[] args){
        /* Armar un programa para organizar un "amigo invisible": Este programa debe permitir a los
        participantes ingresar sus nombres. Luego, cada participante debe sentarse frente a la
        computadora, escribir su nombre y recibir una indicación sobre a quién debe darle un regalo. El
        programa también debe limpiar la consola después de que cada participante haya visto su
        indicación. */

        jugarAlAmigoInvisible();
    }

    private static void jugarAlAmigoInvisible() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("¿Cuantas personas van a jugar al Amigo Invisible?");
        int cantidadPersonas = scanner.nextInt();
        String[] listaDeNombres = new String[cantidadPersonas];

        ingresarNombresDeJugadores(scanner, cantidadPersonas, listaDeNombres);

        String[] agasajados = new String[cantidadPersonas];
        asignarAgasajadorAPersonas(cantidadPersonas, listaDeNombres, agasajados);

        muestraLosResultados(scanner, cantidadPersonas, listaDeNombres, agasajados);
    }

    private static void muestraLosResultados(Scanner scanner, int cantidadPersonas, String[] listaDeNombres, String[] agasajados) {
        for (int i = 0; i < cantidadPersonas; i++){
            String nombreDeLaPersona = listaDeNombres[i];
            System.out.println("--------------------------------------------------------------------------");
            System.out.println("Que " + nombreDeLaPersona +" se acerque a la computadora y escriba LISTO");
            scanner.next();
            String nombreDelAgasajado = agasajados[i];
            System.out.println("--------------------------------------------------------------------------");
            System.out.println(nombreDeLaPersona + " tienes que hacerle un regalo a " + nombreDelAgasajado +". Escribe LISTO");
            scanner.next();
            System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n");
        }
    }
    private static void asignarAgasajadorAPersonas(int cantidadPersonas, String[] listaDeNombres, String[] agasajados) {
        for (int i = 0; i < cantidadPersonas; i++) {
            int indice = i + 1;
            if (indice >= cantidadPersonas) {
                indice = 0;
            }
            agasajados[i] = listaDeNombres[indice];
        }
    }
    private static void ingresarNombresDeJugadores(Scanner scanner, int cantidadPersonas, String[] listaDeNombres) {
        for (int i = 0; i < cantidadPersonas; i++){
            System.out.println("Ingrese el nombre de una persona:");
            String nombreDeLaPersona = scanner.next();
            listaDeNombres[i] = nombreDeLaPersona;
        }
    }
}



