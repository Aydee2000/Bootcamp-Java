package Funciones_y_primeros_pasos_con_Springboot_Clase_8;

public class Ejercicio_1 {
    public static void main(String[] args) {
        /*Hacer una función que calcule el área de un cuadrado. Al llamarla debe devolver el área
        del cuadrado.*/

        double lado = 5.0;
        double area = calcularElAreaDelCuadrado(lado);
        System.out.println("el area del cuadrado es: " + area);
    }
     public static double calcularElAreaDelCuadrado(double lado){
        double area = lado * lado;
        return area;
     }
}
