package Ejercicios_de_POO_Clase_16.Ejercicio_2;

public class Arquero extends Personaje{
    private int agility;
    private int aim;
    private int stealth;

    public Arquero(int agility, int aim, int stealth){
        super("Sylvan");
        this.agility = agility;
        this.aim = aim;
        this.stealth = stealth;
    }

    public void showSkills(){
        System.out.println("Name: " + getName());
        System.out.println("Health: " + getHealth());
        System.out.println("Endurance: " +getEndurance());
        System.out.println("Speed: " +getSpeed());
        System.out.println("Can: " +getCan());
        System.out.println("Agility: " +getAgility());
        System.out.println("Aim: " +getAim());
        System.out.println("Stealth: " +getStealth());
    }
    public int getAgility() {
        return agility;
    }

    public int getAim() {
        return aim;
    }

    public int getStealth() {
        return stealth;
    }

    public int attack() {
        // Implementa la lógica de ataque específica para el Guerrero
        // Puedes calcular el daño basado en sus características (fuerza, golpe, etc.)
        return 0;
    }

    public void defend() {
        // Implementa la lógica de defensa específica para el Guerrero
        // Puedes aumentar temporalmente su resistencia o reducir el daño recibido
    }

}
