package State;

//Estado Contreto
public class EstadoCompletado implements Estado{
    @Override
    public void procecar(Pago pago) {
        System.out.println("El pago ya fue completado. No se puede volver a procesar.");
    }

    @Override
    public void cancelar(Pago pago) {
        System.out.println("⚠️ No se puede cancelar un pago completado.");
    }
}
