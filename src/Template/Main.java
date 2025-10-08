package Template;

public class Main {
    public static void main(String[] args) {
        Notificacion mail = new NotificacionMail();
        Notificacion sms = new NotificacionSMS();

        mail.enviarNotificacion();
        sms.enviarNotificacion();
    }
}
