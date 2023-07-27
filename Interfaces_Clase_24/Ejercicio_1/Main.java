package Interfaces_Clase_24.Ejercicio_1;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<geometricFigure> figures = new ArrayList<>();
        Rectangle rectangle = new Rectangle();
        rectangle.setBroad(5);
        rectangle.setHigh(10);
        figures.add(rectangle);

        Circle circle = new Circle();
        circle.setRadio(8);
        figures.add(circle);

        System.out.println("the width of the rectangle is: " + rectangle.getBroad());
        System.out.println("the height of the rectangle is: " + rectangle.getHigh());
        System.out.println("The radius of the circle is: " + circle.getRadio());
        System.out.println("\n");

        for (geometricFigure figure : figures){
            System.out.println("Total area is: " + figure.calculateArea());
        }
    }
}
