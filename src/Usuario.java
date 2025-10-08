abstract class Usuario {
    protected ChatMediator mediator;
    protected String nombre;

    public Usuario(String nombre, ChatMediator mediator) {
        this.nombre = nombre;
        this.mediator = mediator;
    }

    public abstract void enviar(String mensaje);
    public abstract void recibir(String mensaje);
}