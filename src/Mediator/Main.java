package Mediator;

public class Main {
    /*
 * PATRÓN MEDIATOR: SISTEMA DE CHAT ENTRE USUARIOS
 *
 * Contexto:
 * Tenemos múltiples objetos (Usuarios) que necesitan comunicarse entre sí.
 * Sin un mediador, cada usuario tendría que conocer a todos los demás, generando
 * acoplamiento fuerte y dificultando el mantenimiento.
 *
 * Problema:
 * La comunicación directa entre todos los objetos genera dependencias rígidas,
 * difícil de mantener y extender. Si agregamos nuevos usuarios o cambiamos la lógica
 * de comunicación, habría que modificar muchas clases.
 *
 * Solución:
 * Se crea un objeto central (ChatMediator) que gestiona toda la comunicación entre usuarios.
 * Cada usuario envía mensajes al mediador, y éste decide a quién reenviarlos.
 * Los usuarios no se comunican directamente entre sí.*/
    
    public static void main(String[] args) {
        ChatMediator chat = new ChatConcreto();

        Usuario u1 = new UsuarioConcreto("Alice", chat);
        Usuario u2 = new UsuarioConcreto("Bob", chat);
        Usuario u3 = new UsuarioConcreto("Charlie", chat);

        chat.agregarUsuario(u1);
        chat.agregarUsuario(u2);
        chat.agregarUsuario(u3);

        u1.enviar("Hola a todos!");
        u2.enviar("Hola Alice!");
    }
}