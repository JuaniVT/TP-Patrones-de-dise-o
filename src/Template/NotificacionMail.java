package Template;

public class NotificacionMail extends Notificacion{
    @Override
    protected void prepararContenido() {
        System.out.println("Preparando contenido del email...");
    }

    @Override
    protected void conectarProveedor() {
        System.out.println("Conectando con el servidor de correo...");
    }

    @Override
    protected void enviarMensaje() {
        System.out.println("Enviando email al destinatario...");
    }
}
