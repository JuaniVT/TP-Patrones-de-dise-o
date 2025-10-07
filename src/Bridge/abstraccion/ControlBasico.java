package Bridge.abstraccion;

import Bridge.implementacion.Dispositivo;

public class ControlBasico extends ControlRemoto{

    public ControlBasico(Dispositivo dispositivo) {
        super(dispositivo);
    }

    @Override
    public void encender() {
        dispositivo.encender();
    }

    @Override
    public void apagar() {
        dispositivo.apagar();
    }

    @Override
    public void subirVolumen() {
        System.out.println("Subiendo volumen...");
        dispositivo.setVolumen(20);
    }

    @Override
    public void bajarVolumen() {
        System.out.println("Bajando volumen...");
        dispositivo.setVolumen(5);
    }
}
