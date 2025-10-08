
public class Main {
   /*
 * PATRÓN CHAIN OF RESPONSIBILITY: SOPORTE TÉCNICO
 *
 * Contexto:
 * Tenemos un sistema de soporte con distintos niveles (Nivel 1, 2, 3) y distintas solicitudes.
 *
 * Problema:
 * Sin patrón, el cliente debería conocer qué nivel puede manejar la solicitud, generando
 * acoplamiento y condicionales rígidos.
 *
 * Solución:
 * Se crea una cadena de manejadores (SoporteNivel1 → Nivel2 → Nivel3).
 * Cada manejador decide si procesa la solicitud o la pasa al siguiente.
 * El cliente solo envía la solicitud al inicio de la cadena.*/

    public static void main(String[] args) {
        Soporte nivel1 = new SoporteNivel1();
        Soporte nivel2 = new SoporteNivel2();
        Soporte nivel3 = new SoporteNivel3();

        // Configurar la cadena
        nivel1.setSiguiente(nivel2);
        nivel2.setSiguiente(nivel3);

        // Enviar solicitudes
        nivel1.manejarSolicitud("basico");
        nivel1.manejarSolicitud("intermedio");
        nivel1.manejarSolicitud("avanzado");
        nivel1.manejarSolicitud("desconocido");
    }
}