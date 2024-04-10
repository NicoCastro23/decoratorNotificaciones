package co.edu.uniquindio;

// Clase de prueba
public class PruebaDecorator {
    public static void main(String[] args) {
        // Crear una notificación simple
        Notificacion notificacionSimple = new NotificacionSimple();
        notificacionSimple.enviar(); // Salida: Notificación simple enviada

        // Crear una notificación con efecto de sonido
        Notificacion notificacionConSonido = new NotificacionConSonido(new NotificacionSimple());
        notificacionConSonido.enviar();
     
    }
}
