package Bridge.abstraccion;

import Bridge.implementacion.Dispositivo;

public abstract class ControlRemoto {
    protected Dispositivo dispositivo;

    protected ControlRemoto(Dispositivo dispositivo) {
        this.dispositivo = dispositivo;
    }

    public abstract void encender();
    public abstract void apagar();
    public abstract void subirVolumen();
    public abstract void bajarVolumen();
}
