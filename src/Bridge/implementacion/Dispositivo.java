package Bridge.implementacion;

public interface Dispositivo {
    void encender();
    void apagar();
    void setVolumen(int nivel);
    boolean estaEncendido();
}
