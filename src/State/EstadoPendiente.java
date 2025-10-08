package State;

import java.util.Random;

//Estado Contreto
public class EstadoPendiente implements Estado{
    @Override
    public void procecar(Pago pago) {
        System.out.println("Procesando pago...");

        // Simulamos resultado aleatorio (éxito o fallo)
        boolean exito = new Random().nextBoolean();
        if (exito) {
            System.out.println(" Pago completado con éxito.");
            pago.setEstado(new EstadoCompletado());
        } else {
            System.out.println(" El pago ha fallado.");
            pago.setEstado(new EstadoFallido());
        }
    }

    @Override
    public void cancelar(Pago pago) {
        System.out.println("Pago cancelado por el usuario.");

        //transicion de estado
        pago.setEstado(new EstadoFallido());
    }
}
