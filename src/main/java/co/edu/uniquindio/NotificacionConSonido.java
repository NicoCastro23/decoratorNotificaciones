package co.edu.uniquindio;

// Decorador concreto
public class NotificacionConSonido extends NotificacionDecorator {
    public NotificacionConSonido(Notificacion notificacion) {
        super(notificacion);
    }

    @Override
    public void enviar() {
        super.enviar();
        agregarSonido();
    }

    private void agregarSonido() {
        System.out.println("¡Ding! ¡Notificación con sonido!");
    }
}
