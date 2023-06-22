package Programacion_Orientada_a_Objetos_Clase_10;

public class DatosDePersona {
    private int id;
    private String nombre;
    private int dni;
    private int fechaDeNacimiento;
    private int edad;

    public void mostrarDatos(){
        System.out.println("---------Sus datos son:----------");
        System.out.println("Nombre: " + nombre);
        System.out.println("DNI: " + dni);
        System.out.println("Fecha de nacimiento: " + fechaDeNacimiento);
        System.out.println("Edad: " + edad);
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getDni() {
        return dni;
    }

    public void setDni(int dni) {
        this.dni = dni;
    }

    public int getFechaDeNacimiento() {
        return fechaDeNacimiento;
    }

    public void setFechaDeNacimiento(int fechaDeNacimiento) {
        this.fechaDeNacimiento = fechaDeNacimiento;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public void esMayorDeEdad(){
        System.out.println("------------Mensaje:-------------");
        if (edad >= 18){
            System.out.println(nombre + " tienes " + edad + " eres mayor de edad");
        } else if (edad < 18) {
            System.out.println(nombre + " tienes " + edad + " eres menor de edad");
        }
    }

}
