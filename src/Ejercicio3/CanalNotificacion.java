package Ejercicio3;

public abstract class CanalNotificacion {
    protected String usuario;
    protected String mensaje;

    public CanalNotificacion(String usuario, String mensaje) {
        this.usuario = usuario;
        this.mensaje = mensaje;
    }

    public abstract void enviarNotificacion();

    public void mostrarInformacion() {
        System.out.println("Usuario: " + usuario);
        System.out.println("Mensaje: " + mensaje);
    }
}