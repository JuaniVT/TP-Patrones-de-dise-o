package Mediator;

class UsuarioConcreto extends Usuario {
    public UsuarioConcreto(String nombre, ChatMediator mediator) {
        super(nombre, mediator);
    }

    @Override
    public void enviar(String mensaje) {
        System.out.println(this.nombre + " envía: " + mensaje);
        mediator.enviarMensaje(mensaje, this);
    }

    @Override
    public void recibir(String mensaje) {
        System.out.println(this.nombre + " recibe: " + mensaje);
    }
}