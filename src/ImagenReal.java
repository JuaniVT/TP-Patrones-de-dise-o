public class ImagenReal implements Imagen {
    private String nombreArchivo;

    public ImagenReal(String nombreArchivo) {
        this.nombreArchivo = nombreArchivo;
        cargarDesdeDisco();
    }

    private void cargarDesdeDisco() {
        System.out.println("Cargando imagen " + nombreArchivo + " desde disco...");
    }

    @Override
    public void mostrar() {
        System.out.println("Mostrando imagen " + nombreArchivo);
    }
}
