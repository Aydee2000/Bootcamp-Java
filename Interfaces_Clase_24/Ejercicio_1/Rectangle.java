package Interfaces_Clase_24.Ejercicio_1;

public class Rectangle implements geometricFigure {
    private float broad;
    private float high;

    public float getBroad() {
        return broad;
    }

    public void setBroad(float broad) {
        this.broad = broad;
    }

    public float getHigh() {
        return high;
    }

    public void setHigh(float high) {
        this.high = high;
    }

    @Override
    public float calculateArea() {
        return broad * high / 2;
    }
}
