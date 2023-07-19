package Ejercicios_de_POO_Clase_16.Ejercicio_1;

import java.util.Scanner;

public class PoligonoRegular extends Figura{
    protected double base;
    protected double altura;

    public double getBase() {
        return base;
    }

    public void setBase(double base) {
        this.base = base;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }
    public void cargarDatos(){
        Scanner teclado = new Scanner(System.in);

        System.out.print("Ingresa la base en cm:");
         base = teclado.nextDouble();

        System.out.print("Ingresa la altura en cm:");
         altura = teclado.nextDouble();

    }
}
