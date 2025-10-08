package Proxy;

public class ProxyImagen implements Imagen {
    private ImagenReal imagenReal;
    private String nombreArchivo;

    public ProxyImagen(String nombreArchivo) {
        this.nombreArchivo = nombreArchivo;
    }

    @Override
    public void mostrar() {
        // Solo creamos la imagen real cuando realmente se necesita
        if (imagenReal == null) {
            imagenReal = new ImagenReal(nombreArchivo);
        }
        imagenReal.mostrar();
    }
}
