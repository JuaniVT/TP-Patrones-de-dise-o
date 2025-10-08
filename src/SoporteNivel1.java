class SoporteNivel1 extends Soporte {
    @Override
    public void manejarSolicitud(String tipo) {
        if (tipo.equalsIgnoreCase("basico")) {
            System.out.println("Nivel 1: resolviendo solicitud básica");
        } else if (siguiente != null) {
            siguiente.manejarSolicitud(tipo);
        }
    }
}
