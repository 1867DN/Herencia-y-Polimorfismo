package Ejercicio2;

public class PayPal extends MetodoPago implements Cancelable {
    private String correoElectronico;

    public PayPal(String titular, String numero, String correoElectronico) {
        super(titular, numero);
        this.correoElectronico = correoElectronico;
    }

    @Override
    public void realizarPago(double monto) {
        System.out.println("Procesando pago de $" + monto + " con PayPal...");
        System.out.println("Pago realizado exitosamente.");
    }

    @Override
    public void cancelarPago() {
        System.out.println("El pago con PayPal ha sido cancelado.");
    }

    @Override
    public void mostrarInformacion() {
        super.mostrarInformacion();
        System.out.println("Correo Electrónico: " + correoElectronico);
    }
}