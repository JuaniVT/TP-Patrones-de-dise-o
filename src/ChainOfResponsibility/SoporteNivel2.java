package ChainOfResponsibility;

class SoporteNivel2 extends Soporte {
    @Override
    public void manejarSolicitud(String tipo) {
        if (tipo.equalsIgnoreCase("intermedio")) {
            System.out.println("Nivel 2: resolviendo solicitud intermedia");
        } else if (siguiente != null) {
            siguiente.manejarSolicitud(tipo);
        }
    }
}
