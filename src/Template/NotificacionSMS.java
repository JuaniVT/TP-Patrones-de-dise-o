package Template;

public class NotificacionSMS extends Notificacion{
    @Override
    protected void prepararContenido() {
        System.out.println("Preparando contenido del SMS...");
    }

    @Override
    protected void conectarProveedor() {
        System.out.println("Conectando con la API de SMS...");
    }

    @Override
    protected void enviarMensaje() {
        System.out.println("Enviando SMS al destinatario...");
    }
}
