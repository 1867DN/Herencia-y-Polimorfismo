package Ejercicio3;

public class Notificaciones {
    private CanalNotificacion[] canales;
    private int contador;

    public Notificaciones(int capacidad) {
        this.canales = new CanalNotificacion[capacidad];
        this.contador = 0;
    }

    public void agregarCanal(CanalNotificacion canal) {
        if (contador < canales.length) {
            canales[contador++] = canal;
            System.out.println("Canal de notificación agregado exitosamente.");
        } else {
            System.out.println("No se pueden agregar más canales de notificación.");
        }
    }

    public void enviarNotificaciones() {
        System.out.println("Enviando todas las notificaciones:");
        for (int i = 0; i < contador; i++) {
            canales[i].enviarNotificacion();
            System.out.println();
        }
    }

    public void personalizarMensaje(int indice, String nuevoMensaje) {
        if (indice >= 0 && indice < contador) {
            if (canales[indice] instanceof Personalizable) {
                ((Personalizable) canales[indice]).personalizarMensaje(nuevoMensaje);
            } else {
                System.out.println("El canal no permite personalizar mensajes.");
            }
        } else {
            System.out.println("Índice de canal inválido.");
        }
    }

    public void mostrarCanales() {
        System.out.println("Canales de Notificación:");
        for (int i = 0; i < contador; i++) {
            System.out.println("Canal #" + (i + 1) + ":");
            canales[i].mostrarInformacion();
            System.out.println();
        }
    }
}