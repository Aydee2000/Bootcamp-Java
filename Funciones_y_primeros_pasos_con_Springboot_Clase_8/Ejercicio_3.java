package Funciones_y_primeros_pasos_con_Springboot_Clase_8;

public class Ejercicio_3 {
    public static void main(String[] args) {
        /* Crear una función que sea un generador de contraseñas. Al llamarla debe devolver una
        contraseña (por ejemplo, puedes utilizar Math.random() para devolver un número
                aleatorio que podría ser una contraseña. */
      String password = generadorDeContrasena();
      System.out.println("La contraseña generada es: " + password);

    }
    public static String generadorDeContrasena(){
        String caracteres = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789";
        int longitud = 8;

        StringBuilder nose = new StringBuilder();

        for (int i = 0; i < longitud; i++){
            int indice = (int) (Math.random() * caracteres.length());
            char caracter = caracteres.charAt(indice);
            nose.append(caracter);
        }
        return nose.toString();
    }
}
