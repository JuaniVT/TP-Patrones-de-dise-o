package Bridge.implementacion;

public class Television implements Dispositivo{
    private boolean encendido = false;
    private int volumen = 10;

    @Override
    public void encender() {
        encendido = true;
        System.out.println("TV encendida");
    }

    @Override
    public void apagar() {
        encendido = false;
        System.out.println("TV apagada");
    }

    @Override
    public void setVolumen(int nivel) {
        volumen = nivel;
        System.out.println("Volumen de TV: " + volumen);
    }

    @Override
    public boolean estaEncendido() {
        return encendido;
    }
}
