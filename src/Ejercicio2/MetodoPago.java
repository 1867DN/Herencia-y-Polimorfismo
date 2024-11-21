package Ejercicio2;

public abstract class MetodoPago {
    protected String titular;
    protected String numero;

    public MetodoPago(String titular, String numero) {
        this.titular = titular;
        this.numero = numero;
    }

    public abstract void realizarPago(double monto);

    public void mostrarInformacion() {
        System.out.println("Titular: " + titular);
        System.out.println("Número: " + numero);
    }
}