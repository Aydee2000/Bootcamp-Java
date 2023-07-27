package Interfaces_Clase_24.Ejercicio_2;

public class Pianist implements Musician{
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public void playAnInstrument() {
        System.out.println("Playing song... 'Imagine' - John Lennon");
    }
}
