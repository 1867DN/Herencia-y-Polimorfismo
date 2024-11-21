package Ejercicio3;

public class SistemaNotificaciones {
    public static void main(String[] args) {
        Notificaciones sistemaNotificaciones = new Notificaciones(5);

        CanalNotificacion correo = new CorreoElectronico("Juan Pérez", "Bienvenido a nuestra aplicación.", "juan.perez@gmail.com");
        CanalNotificacion mensajeTexto = new MensajeTexto("María López", "Tu pedido está en camino.", "+54 9 261 123456");

        sistemaNotificaciones.agregarCanal(correo);
        sistemaNotificaciones.agregarCanal(mensajeTexto);

        sistemaNotificaciones.mostrarCanales();

        sistemaNotificaciones.personalizarMensaje(0, "Tu cuenta ha sido verificada.");
        sistemaNotificaciones.personalizarMensaje(1, "El repartidor llegará en 10 minutos.");

        sistemaNotificaciones.enviarNotificaciones();
    }
}