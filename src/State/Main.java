package State;

public class Main {
    public static void main(String[] args) {
        Pago pago = new Pago();

        //hacemos las diferentes acciones para ver los diferentes comportamientos dependiendo del estado
        pago.procesar();
        pago.cancelar();
        pago.procesar();
    }
}
