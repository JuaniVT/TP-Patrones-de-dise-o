package Mediator;

import java.util.ArrayList;
import java.util.List;

class  ChatConcreto implements ChatMediator {
    private List<Usuario> usuarios = new ArrayList<>();

    @Override
    public void enviarMensaje(String mensaje, Usuario remitente) {
        for (Usuario u : usuarios) {
            if (u != remitente) {
                u.recibir(mensaje);
            }
        }
    }

    @Override
    public void agregarUsuario(Usuario usuario) {
        usuarios.add(usuario);
    }
}