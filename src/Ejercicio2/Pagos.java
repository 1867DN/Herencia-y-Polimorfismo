package Ejercicio2;

public class Pagos {
    private MetodoPago[] metodos;
    private int contador;

    public Pagos(int capacidad) {
        this.metodos = new MetodoPago[capacidad];
        this.contador = 0;
    }

    public void agregarMetodoPago(MetodoPago metodo) {
        if (contador < metodos.length) {
            metodos[contador++] = metodo;
            System.out.println("Método de pago agregado exitosamente.");
        } else {
            System.out.println("No se pueden agregar más métodos de pago.");
        }
    }

    public void realizarPago(int indice, double monto) {
        if (indice >= 0 && indice < contador) {
            metodos[indice].realizarPago(monto);
        } else {
            System.out.println("Índice de método de pago inválido.");
        }
    }

    public void cancelarPago(int indice) {
        if (indice >= 0 && indice < contador) {
            if (metodos[indice] instanceof Cancelable) {
                ((Cancelable) metodos[indice]).cancelarPago();
            } else {
                System.out.println("El método de pago no puede ser cancelado.");
            }
        } else {
            System.out.println("Índice de método de pago inválido.");
        }
    }

    public void mostrarMetodosPago() {
        System.out.println("Métodos de Pago:");
        for (int i = 0; i < contador; i++) {
            System.out.println("Método #" + (i + 1) + ":");
            metodos[i].mostrarInformacion();
            System.out.println();
        }
    }
}