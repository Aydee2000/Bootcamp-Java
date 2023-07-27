package Interfaces_Clase_24.Ejercicio_2;

public class Guitarist implements Musician {
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    @Override
    public void playAnInstrument() {
        System.out.println("Playing song... 'Hotel California' - Eagles");
    }
}
