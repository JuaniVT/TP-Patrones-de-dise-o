package Bridge;

import Bridge.abstraccion.ControlAvanzado;
import Bridge.abstraccion.ControlBasico;
import Bridge.abstraccion.ControlRemoto;
import Bridge.implementacion.Dispositivo;
import Bridge.implementacion.Radio;
import Bridge.implementacion.Television;

public class Main {

    /*
 * EJEMPLO DEL PATRÓN BRIDGE: CONTROL REMOTO Y DISPOSITIVOS
 *
 * Contexto:
 * Tenemos dispositivos electrónicos como TV y Radio, y queremos controlarlos
 * mediante distintos tipos de controles remotos: Básico, Avanzado, etc.
 *
 * Problema:
 * Si creamos una clase por cada combinación (ControlBasicoTV, ControlAvanzadoRadio, etc.)
 * terminaríamos con una explosión de clases y un alto acoplamiento entre control y dispositivo.
 *
 * Solución con Bridge:
 * - Separamos la abstracción (ControlRemoto) de la implementación (Dispositivo).
 * - La abstracción define qué operaciones puede realizar el usuario (encender, apagar, subir/bajar volumen).
 * - La implementación define cómo se ejecutan esas operaciones concretamente (TV, Radio, etc.).
 * - La abstracción mantiene una referencia a la implementación para llamar sus métodos
 *   sin depender de la clase concreta (esto es el "puente").*/

    public static void main(String[] args) {
        Dispositivo television = new Television();
        Dispositivo radio = new Radio();

        ControlRemoto controlBasico = new ControlBasico(radio);
        ControlRemoto controlAvanzado = new ControlAvanzado(television);

        System.out.println("=== Control básico manejando Radio ===");
        controlBasico.encender();
        controlBasico.subirVolumen();
        controlBasico.bajarVolumen();
        controlBasico.apagar();

        System.out.println("\n=== Control avanzado manejando TV ===");
        controlAvanzado.encender();
        controlAvanzado.subirVolumen();
        ((ControlAvanzado) controlAvanzado).silenciar();
        ((ControlAvanzado) controlAvanzado).reiniciarDispositivo();
        controlAvanzado.apagar();
    }
}