package Ejercicios_de_POO_Clase_16.Ejercicio_2;

public class Guerrero extends Personaje{
 private int force;
 private int stroke;
 private int defending;

 public Guerrero(int force, int stroke, int defending){
  super("Golden");
  this.force = force;
  this.stroke = stroke;
  this.defending = defending;
 }

 public int getForce() {
  return force;
 }

 public int getStroke() {
  return stroke;
 }

 public int getDefending() {
  return defending;
 }

 public void showSkills(){
  System.out.println("Name: " + getName());
  System.out.println("Health: " + getHealth());
  System.out.println("Endurance: " +getEndurance());
  System.out.println("Speed: " +getSpeed());
  System.out.println("Can: " +getCan());
  System.out.println("Force: " +getForce());
  System.out.println("Stroke: " +getStroke());
  System.out.println("Defending: " +getDefending());
 }

 public int attack() {
  // Implementa la lógica de ataque específica para el Guerrero
  // Puedes calcular el daño basado en sus características (fuerza, golpe, etc.)
  return 0;
 }


 public void defend() {
  // Implementa la lógica de defensa específica para el Guerrero
  // Puedes aumentar temporalmente su resistencia o reducir el daño recibido
  System.out.println(getName() + " is defending!");
  defending += 10;
 }
}
