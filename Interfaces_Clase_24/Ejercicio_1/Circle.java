package Interfaces_Clase_24.Ejercicio_1;

public class Circle implements geometricFigure {
    private float radio;
    public float getRadio() {
        return radio;
    }
    public void setRadio(float radio) {
        this.radio = radio;
    }
    @Override
    public float calculateArea() {
        return (float) Math.PI * (radio * radio);
    }
}
