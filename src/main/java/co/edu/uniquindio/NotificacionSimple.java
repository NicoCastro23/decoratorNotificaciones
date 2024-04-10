package co.edu.uniquindio;

// Implementación concreta

public class NotificacionSimple implements Notificacion {
    @Override
    public void enviar() {
        System.out.println("Notificación simple enviada");
    }
}
