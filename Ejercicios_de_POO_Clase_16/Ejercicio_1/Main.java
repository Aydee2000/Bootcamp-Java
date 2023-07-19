package Ejercicios_de_POO_Clase_16.Ejercicio_1;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    static List<Figura> figuras = new ArrayList<>();
    public static void main(String[] args) {

        boolean mostrarMenu = true;

        do {
            System.out.println("----------MENU----------");
            System.out.println("¿Que deseas hacer?");
            System.out.println("1) Crear una figura");
            System.out.println("2) Mostrar la sumatoria de areas de las figuras");
            System.out.println("0) Salir");
            System.out.print("Ingrese una opcion:");
            Scanner respuestaUsuario = new Scanner(System.in);
            int opciones = respuestaUsuario.nextInt();

            switch (opciones){

                case 1:
                    crearFigura();
                    break;

                case 2:
                    mostrarSumatoriasDeFiguras();
                    break;

                case 0:
                    System.out.println("Saliendo del programa...");
                    mostrarMenu =  false;
            }

        } while (mostrarMenu);

    }

    private static void mostrarSumatoriasDeFiguras(){
        double sumatoriaDeAreas = 0;
        for (Figura figura : figuras){
            sumatoriaDeAreas += figura.calcularArea();
        }
        System.out.println("La sumatoria de las areas de todas las figuras es: "+ sumatoriaDeAreas + "cm");
    }

    private static void crearFigura() {
        System.out.println("¿Que figura quieres crear?");
        System.out.println("1) Circulo");
        System.out.println("2) Cuadrado");
        System.out.println("3) Triangulo");
        System.out.println("4) Rectangulo");
        System.out.print("Escribe una opcion:");
        Scanner teclado = new Scanner(System.in);
        int opcion = teclado.nextInt();

        if (opcion == 1) {
            Circulo circulo = new Circulo();
            circulo.cargarDatos();
            System.out.println("Circulo creado existosamente");
            System.out.println("El area total es: " + circulo.calcularArea());
            figuras.add(circulo);

        }

        if (opcion == 2){
            Cuadrado cuadrado = new Cuadrado();
            cuadrado.cargarDatos();
            System.out.println("Cuadrado creado existosamente");
            System.out.println("El area total es: " + cuadrado.calcularArea());
            figuras.add(cuadrado);
        }

        if (opcion == 3){
            Triangulo triangulo = new Triangulo();
            triangulo.cargarDatos();
            System.out.println("Triangulo creado existosamente");
            System.out.println("El area total es: " + triangulo.calcularArea());
            figuras.add(triangulo);
        }

        if (opcion == 4){
            Rectangulo rectangulo = new Rectangulo();
            rectangulo.cargarDatos();
            System.out.println("Rectangulo creado existosamente");
            System.out.println("El area total es: " + rectangulo.calcularArea());
            figuras.add(rectangulo);
        }

    }
}
