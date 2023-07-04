package Ejercicios_de_repaso_Clase_14.Ejercicio_4;

import java.util.ArrayList;
import java.util.List;

public class Alumnos {
    private String nombre;
    private String apellido;
    private List<Float> calificaciones;


    public Alumnos (){
      calificaciones = new ArrayList<>();
   }

   public String getNombre(){
       return nombre;
   }

   public void setNombre(String nombre){
       this.nombre = nombre;
   }

   public String getApellido(){
       return apellido;
   }

   public void setApellido(String apellido){
       this.apellido = apellido;
   }

   public float[] getCalificaciones(){
       float[] notas = new float[calificaciones.size()];
       for (int i = 0; i < calificaciones.size(); i++){
           notas[i] = calificaciones.get(i);
       }
       return notas;
   }

   public void agregarNotas(float nota){
        calificaciones.add(nota);
   }

   public String mostrarDatos(){
       System.out.println("Nombre del alumno: " + nombre);
       System.out.println("Apellido del alumno: " + apellido);
       return nombre + " " +apellido;
   }

   public float calcularPromedio(){
       if (calificaciones.isEmpty()) {
           return 0.0f;
       }

       float suma = 0;
       for (float calificacion : calificaciones){
           suma += calificacion;
       }
       return suma / calificaciones.size();
   }
}
