package Bridge.abstraccion;

import Bridge.implementacion.Dispositivo;

public class ControlAvanzado extends ControlRemoto{

    public ControlAvanzado(Dispositivo dispositivo) {
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
        System.out.println("Control avanzado: subiendo volumen al máximo!");
        dispositivo.setVolumen(100);
    }

    @Override
    public void bajarVolumen() {
        System.out.println("Control avanzado: silenciando dispositivo.");
        dispositivo.setVolumen(0);
    }

    public void silenciar() {
        System.out.println("Silenciando dispositivo temporalmente...");
        dispositivo.setVolumen(0);
    }

    public void reiniciarDispositivo() {
        System.out.println("Reiniciando dispositivo...");
        dispositivo.apagar();
        dispositivo.encender();
    }
}
