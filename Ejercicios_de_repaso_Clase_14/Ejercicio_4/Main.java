package Ejercicios_de_repaso_Clase_14.Ejercicio_4;

import java.util.Scanner;

/*  Crear un programa para ingresar las notas de alumnos utilizando programación orientada a
        objetos: El programa debe permitir al usuario cargar las notas de varios alumnos. Cada alumno
        debe tener atributos como nombre, apellido y una lista de notas. Utilizando la programación
        orientada a objetos, el programa debe permitir ingresar las notas de cada alumno y realizar
        cálculos como el promedio de notas. */
public class Main {
    public static void main(String[] args) {

           Alumnos[] listaDeAlumnos = null;

           Scanner scanner = new Scanner(System.in);
           int opcion;

        sistemaDeAlumnos(listaDeAlumnos, scanner);
    }

    private static void sistemaDeAlumnos(Alumnos[] listaDeAlumnos, Scanner scanner) {
        int opcion;
        do {
            System.out.println("------MENU------");
            System.out.println("1) Agregar alumnos");
            System.out.println("2) Mostrar informacion");
            System.out.println("3) Calcular promedio");
            System.out.println("4) Salir");
            System.out.print("Seleccione una opción: ");
            opcion = scanner.nextInt();

            switch (opcion) {
                case 1:
                    System.out.println("¿Cuantos alumnos vas agregar?");
                    int cantidadPersonas = scanner.nextInt();
                    listaDeAlumnos = new Alumnos[cantidadPersonas];

                    for (int i = 0; i < cantidadPersonas; i++){
                        Alumnos alumnos = new Alumnos();

                        System.out.println("Ingrese el nombre del alumno:");
                        String nombreDeLaPersona = scanner.next();
                        alumnos.setNombre(nombreDeLaPersona);

                        System.out.println("Ingrese el apellido del alumno:");
                        String apellidoDeAlumno = scanner.next();
                        alumnos.setApellido(apellidoDeAlumno);

                        System.out.println("Ingrese la cantidad de notas:");
                        int cantidadDeNotas = scanner.nextInt();

                        for (int a = 0; a < cantidadDeNotas; a++){
                            System.out.println("Ingresar la nota #" + (a + 1) + ":");
                            float nota = scanner.nextFloat();
                            alumnos.agregarNotas(nota);
                        }
                        listaDeAlumnos[i] = alumnos;
                    }
                    break;
                case 2:
                    System.out.println("---------------------------");
                    System.out.println("Informacion de los alumnos:");

                    for (Alumnos alumno : listaDeAlumnos) {
                        System.out.println("Nombre del alumno: " + alumno.getNombre());
                        System.out.println("Apellido del alumno: " + alumno.getApellido());
                        System.out.println("Notas del alumno: ");
                        float[] notas = alumno.getCalificaciones();
                    for (int i = 0; i < notas.length; i++){
                        System.out.println("Nota #" + (i + 1) + ":" + notas[i]);
                    }
                        System.out.println("---------------------------");
                    }
                    break;
                case 3:
                    System.out.println("---------------------------");
                    System.out.println("Promedio de los alumnos:");

                    for (Alumnos alumno : listaDeAlumnos) {
                        System.out.println("Nombre del alumno: " + alumno.getNombre());
                        System.out.println("Apellido del alumno: " + alumno.getApellido());
                        System.out.println("Promedio: " + alumno.calcularPromedio());
                        System.out.println("---------------------------");
                    }
                    break;
                case 4:
                    System.out.println("Saliendo del programa...");
                    break;
                default:
                    System.out.println("Opción inválida. Intente nuevamente.");
                    break;
            }
        } while (opcion != 4);

        scanner.close();
    }
}
