package State;


//Clase contexto que tiene la instancia del estado del objeto
public class Pago {
    private Estado estado;

    public Pago() {
        this.estado = new EstadoPendiente();
    }

    public void setEstado(Estado estado) {
        this.estado = estado;
    }

    public void procesar (){
        estado.procecar(this);
    }

    public void cancelar (){
        estado.cancelar(this);
    }
}
