package co.edu.uniquindio;

// Decorador abstracto
public abstract class NotificacionDecorator implements Notificacion {
    protected Notificacion notificacion;

    public NotificacionDecorator(Notificacion notificacion) {
        this.notificacion = notificacion;
    }

    @Override
    public void enviar() {
        notificacion.enviar();
    }
}
