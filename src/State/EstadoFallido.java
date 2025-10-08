package State;

//Estado Contreto
public class EstadoFallido implements Estado{
    @Override
    public void procecar(Pago pago) {
        System.out.println("Reintentando procesar un pago fallido...");

        boolean exito = new java.util.Random().nextBoolean();
        if (exito) {
            System.out.println("Pago completado con éxito.");
            pago.setEstado(new EstadoCompletado());
        } else {
            System.out.println("El pago volvió a fallar.");
        }
    }

    @Override
    public void cancelar(Pago pago) {
        System.out.println("El pago ya está fallido, no se puede cancelar.");
    }
}
