package Programacion_Orientada_a_Objetos_Clase_10;

import java.util.Scanner;

public class Persona {
    public static void main(String[] args) {
       /* Vamos a crear una clase llamada Persona. Sus atributos son: id, nombre, edad, fecha
        de nacimiento y DNI. Construye los siguientes métodos para la clase:

        ● Un constructor, donde los datos pueden estar vacíos.
        ● Los setters y getters para cada uno de los atributos.
        ● mostrar(): Muestra los datos de la persona.
        ● esMayorDeEdad(): Devuelve un valor lógico indicando si es mayor de edad
        */

        DatosDePersona newperson= cargarDatos();
        newperson.mostrarDatos();
        newperson.esMayorDeEdad();
    }

    private static DatosDePersona cargarDatos() {
        Scanner scanner = new Scanner(System.in);
        DatosDePersona personas = new DatosDePersona();

        System.out.println("Por favor, ingresa tus datos:");
        System.out.print("Ingresa tu nombre:");
        personas.setNombre(scanner.nextLine());

        System.out.print("Ingresa tu DNI:");
        personas.setDni(scanner.nextInt());

        System.out.print("Ingresa tu fecha de nacimiento:");
        personas.setFechaDeNacimiento(scanner.nextInt());

        System.out.print("Ingresa tu edad:");
        personas.setEdad(scanner.nextInt());
        scanner.nextLine();

        return personas;
    }
}

