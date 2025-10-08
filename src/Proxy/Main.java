package Proxy;

public class Main {
    /*
 * EJEMPLO DEL PATRÓN PROXY: VISUALIZADOR DE IMÁGENES
 *
 * Contexto:
 * Tenemos imágenes que son costosas de cargar desde disco, como fotos grandes o gráficos
 * que requieren muchos recursos. Queremos mostrarlas a los usuarios sin cargar todo
 * inmediatamente ni gastar memoria innecesaria.
 *
 * Problema:
 * Si cada vez que el usuario quiere ver una imagen creamos un nuevo objeto, se gastan
 * muchos recursos y se pierde eficiencia. Además, puede que queramos controlar el acceso
 * a ciertas imágenes (ej: permisos, logging, cache).
 *
 * Solución con Proxy:
 * - Creamos un objeto intermediario (ProxyImagen) que implementa la misma interfaz que
 *   la imagen real (Imagen).
 * - El proxy controla el acceso a la imagen real: solo la crea cuando realmente se necesita
 *   (Lazy Initialization).
 * - El proxy también permite agregar funcionalidades extras antes o después de usar
 *   la imagen real, como logging, cache o control de permisos.*

    public static void main(String[] args) {
        Imagen imagen1 = new ProxyImagen("foto1.jpg");
        Imagen imagen2 = new ProxyImagen("foto2.jpg");

        // La imagen se carga desde disco solo la primera vez que se necesita
        imagen1.mostrar();
        imagen1.mostrar(); // Ya no se carga desde disco, solo se muestra
        imagen2.mostrar();
    }
}