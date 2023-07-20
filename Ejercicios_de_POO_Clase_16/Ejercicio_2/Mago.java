package Ejercicios_de_POO_Clase_16.Ejercicio_2;

public class Mago extends Personaje{
    private int energy;
    private int defending;
    private int intelligence;

    public int getEnergy() {
        return energy;
    }

    public int getDefending() {
        return defending;
    }

    public int getIntelligence() {
        return intelligence;
    }

    public Mago(int energy, int defending, int intelligence){
        super("Aurora");
        this.energy = energy;
        this.defending = defending;
        this.intelligence = intelligence;
    }

    public void showSkills(){
        System.out.println("Name: " + getName());
        System.out.println("Health: " + getHealth());
        System.out.println("Endurance: " +getEndurance());
        System.out.println("Speed: " +getSpeed());
        System.out.println("Can: " +getCan());
        System.out.println("Enegy: " + getEnergy());
        System.out.println("Defending: " + getDefending());
        System.out.println("Intelligence: " + getIntelligence());
    }
}
