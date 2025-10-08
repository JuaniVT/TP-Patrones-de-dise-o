package Mediator;

public interface ChatMediator {
    void enviarMensaje(String mensaje, Usuario remitente);
    void agregarUsuario(Usuario usuario);
}
