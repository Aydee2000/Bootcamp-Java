package Ejercicios_de_POO_Clase_16.Ejercicio_2;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Personaje {
        private String name;
        private int health;
        private int endurance;
        private int speed;
        private int can;

        private List<Item> items;

        public Personaje(String name) {
            this.name = name;
            this.health = 100;
            this.endurance = 50;
            this.speed = 100;
            this.can = 70;
            items = new ArrayList<>();
        }

        public String getName() {
            return name;
        }

        public int getHealth() {
            return health;
        }

        public int getEndurance() {
            return endurance;
        }

        public int getSpeed() {
            return speed;
        }

        public int getCan() {
            return can;
        }

        public List<Item> getItems() {
            return items;
        }

       public void agregarDefensaItem() {
        items.add(Item.elegirItem());
        }

        public void menuDeAtaques(){
            Scanner scanner = new Scanner(System.in);

            System.out.println("1) ataque con arma: " + items);
            System.out.println("2) ataque con poder: " + items);
            System.out.println("3) curarse");
            System.out.println("4) rendirse: " + items);
            int opcion = scanner.nextInt();
        }
}
