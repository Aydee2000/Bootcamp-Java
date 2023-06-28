package Programacion_Orientada_a_Objetos_Clase_10;

public class Cliente {
    private String titular;
    private double cantidad;

    public Cliente() {
        // Los datos están vacíos
    }

    public Cliente(String titular, double cantidad) {
        this.titular = titular;
        this.cantidad = cantidad;
    }

    public String getTitular() {
        return titular;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }

    public double getCantidad() {
        return cantidad;
    }

    public void setCantidad(double cantidad) {
        this.cantidad = cantidad;
    }

    public void mostrar() {
        System.out.println("Titular: " + titular);
        System.out.println("Cantidad: " + cantidad);
    }

    public void ingresar(double monto) {
        if (monto > 0) {
            cantidad += monto;
        }
    }

    public void retirar(double monto) {
        if (monto <= cantidad) {
            cantidad -= monto;
        } else {
            System.out.println("No se puede retirar. Saldo insuficiente.");
        }
    }
}


