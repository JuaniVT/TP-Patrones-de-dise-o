package Template;

public abstract class Notificacion {

    //metodo base que van a heredar las subclases
    public final void enviarNotificacion(){
        prepararContenido();
        conectarProveedor();
        enviarMensaje();
    }

    //pasos especificos que varian dependiendo de la forma de envio
    protected abstract void prepararContenido();
    protected abstract void conectarProveedor();
    protected abstract void enviarMensaje();



    // Paso común a todas las notificaciones
    protected void mostrarResultado() {
        System.out.println("Notificación enviada correctamente.\n");
    }
}
