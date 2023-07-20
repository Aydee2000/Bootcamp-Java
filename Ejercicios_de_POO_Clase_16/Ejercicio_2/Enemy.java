package Ejercicios_de_POO_Clase_16.Ejercicio_2;

public class Enemy extends Personaje {
    private int atacar;

    private int ataqueFeroz;

    public int getAtacar() {
        return atacar;
    }

    public int getAtaqueFeroz() {
        return ataqueFeroz;
    }

    public Enemy(String name){
        super("Zombie");
        this.atacar = 30;
        this.ataqueFeroz = 50;
    }

    public void atacarAlEnemigo(){
        Personaje personaje = new Personaje("");
        int ataque = personaje.getHealth() - 30;
        System.out.println("Zombie ataca a jugador" );
        System.out.println("vida del jugador disminuye a " + ataque);
    }


}


