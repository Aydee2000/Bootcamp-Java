package Ejercicios_de_POO_Clase_16.Ejercicio_2;

import java.util.Scanner;

public class Item {
    private String name;
    private int defense;

    public Item(String name, int defense) {
        this.name = name;
        this.defense = defense;
    }

    public String getName() {
        return name;
    }

    public int getDefense() {
        return defense;
    }
    public static Item elegirItem() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Elige el item de tu personaje: ");

        System.out.println("1) Casco de Papel " + (10));
        System.out.println("2) Casco de Mago " + (30));
        System.out.println("3) Casco de Bronce " + (80));
        System.out.println("4) Casco de Cuero " + (50));
        System.out.println("Ingresar opción:");
        int tipo = scanner.nextInt();

        System.out.println("1) Traje de Animal " + (20));
        System.out.println("2) Traje de Tela reforzado " + (50));
        System.out.println("3) Traje de Hierro " + (84));
        System.out.println("4) Traje de Mago " + (10));
        System.out.println("Ingresar opción:");
        int traje = scanner.nextInt();

        System.out.println("1) Ballesta " + (40));
        System.out.println("2) Espada " + (90));
        System.out.println("3) Barra " + (80));
        System.out.println("4) Poción " + (50));
        System.out.println("Ingresar opción:");
        int arma = scanner.nextInt();

        String cascoElegido;
        String trajeElegido;
        String armaElegida;
        int defensaTotal = 0;
        switch (tipo) {
            case 1:
                cascoElegido = "Casco de Papel";
                defensaTotal = 10;
                break;
            case 2:
                cascoElegido = "Casco de Mago";
                defensaTotal = 30;
                break;
            case 3:
                cascoElegido = "Casco de Bronce";
                defensaTotal = 80;
                break;
            case 4:
                cascoElegido = "Casco de Cuero";
                defensaTotal = 50;
                break;

            default:
                cascoElegido = "Opción inválida";
        }

        switch (traje) {
            case 1:
                trajeElegido = "Traje de Animal";
                defensaTotal = 20;
                break;

            case 2:
                trajeElegido = "Traje de Tela reforzado";
                defensaTotal = 50;
                break;

            case 3:
                trajeElegido = "Traje de Hierro";
                defensaTotal = 84;
                break;

            case 4:
                trajeElegido = "Traje de Mago";
                defensaTotal = 10;
                break;

            default:
                trajeElegido = "Opción inválida";
        }

        switch (arma) {
            case 1:
                armaElegida = "Ballesta";
                defensaTotal = 40;
                break;

            case 2:
                armaElegida = "Espada";
                defensaTotal = 90;
                break;

            case 3:
                armaElegida = "Barra";
                defensaTotal = 80;
                break;

            case 4:
                armaElegida = "Poción";
                defensaTotal = 50;
                break;

            default:
                armaElegida = "Opción inválida";
        }

        System.out.println("Defensa total:"+ " " + cascoElegido + " " + (defensaTotal) + " " + trajeElegido + " " + (defensaTotal) + " " + armaElegida + " " +(defensaTotal));
        return null;
    }
}
