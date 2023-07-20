package Ejercicios_de_POO_Clase_16.Ejercicio_2;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean menu = true;

        do {
            System.out.println("--------- WELCOME TO GAMEPLAY ---------");
            System.out.println("1) Choose or create a character");
            System.out.println("2) Choose armor");
            System.out.println("3) Play solo");
            System.out.println("0) Go out");
            System.out.print("Enter an option: ");

            int opcions = scanner.nextInt();
            System.out.println("---------------------------------------");

            switch (opcions) {
                case 1:
                    chooseCharacter();
                    break;

                case 2:
                    Item item = new Item("0", 0);
                    item.elegirItem();
                    break;

                case 3:
                    System.out.println("-----------------");
                    Personaje personaje = chooseCharacter();
                    personaje.agregarDefensaItem();
                    System.out.println("-----------------------------");
                    Enemy enemy = new Enemy("");
                    System.out.println(personaje.getName() + " VS " + enemy.getName());

                    // Iniciar el combate
                    enemy.atacarAlEnemigo();


                    break;

                case 0:
                    menu = false;
                    break;

                default:
                    System.out.println("Invalid option. Closing the game...");

            }
        } while (menu);
    }

    private static Personaje chooseCharacter() {
            Personaje personajeElegido = null;

            System.out.println("---------------------------------------");
            System.out.println("Choose which character you want to be!");
            System.out.println("Opcions:");
            System.out.println("1) Guerrero");
            System.out.println("2) Mago");
            System.out.println("3) Arquero");
            Scanner teclado = new Scanner(System.in);
            int opcion = teclado.nextInt();

            if (opcion == 1) {
                Guerrero guerrero = new Guerrero(90, 30, 56);
                System.out.println("------------------------------------------------");
                System.out.println("You have chosen the warrior, his properties are:");
                guerrero.showSkills();
                personajeElegido = guerrero;
            }

            if (opcion == 2) {
                Mago mago = new Mago(100, 50, 80);
                System.out.println("------------------------------------------------");
                System.out.println("You have chosen the magician his properties are:");
                mago.showSkills();
                personajeElegido = mago;
            }

            if (opcion == 3) {
                Arquero arquero = new Arquero(80, 98, 70);
                System.out.println("-------------------------------------");
                System.out.println("You have chosen the magician his properties are:");
                arquero.showSkills();
                personajeElegido = arquero;
            }
            return personajeElegido;
        }
    }




