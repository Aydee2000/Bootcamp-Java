package Interfaces_Clase_24.Ejercicio_2;

public class Main {
    public static void main(String[] args) {

      Pianist pianist = new Pianist();
      pianist.setName("The piano");
      System.out.println("Instrument: " + pianist.getName());
      pianist.playAnInstrument();

      System.out.println("\n");

      Guitarist guitarist = new Guitarist();
      guitarist.setName("Guitar");
      System.out.println("Instrument: " + guitarist.getName());
      guitarist.playAnInstrument();

    }
}
