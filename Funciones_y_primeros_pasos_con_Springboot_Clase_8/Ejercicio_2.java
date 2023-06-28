package Funciones_y_primeros_pasos_con_Springboot_Clase_8;

public class Ejercicio_2 {
    public static void main(String[] args) {
       /* Hacer una función que calcule el área de un triángulo. Al llamarla debe devolver el área
        del triángulo. */

        double base = 6.0;
        double altrura = 4.0;
        double area = calcularAreaTriangulo(base, altrura);
        System.out.println("El area de un triangulo es: " + area);
    }
    public static double calcularAreaTriangulo(double base, double altura){
        double area = (base * altura) / 2;
        return area;
    }
}
