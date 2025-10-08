package ChainOfResponsibility;

class SoporteNivel3 extends Soporte {
    @Override
    public void manejarSolicitud(String tipo) {
        if (tipo.equalsIgnoreCase("avanzado")) {
            System.out.println("Nivel 3: resolviendo solicitud avanzada");
        } else {
            System.out.println("Solicitud no puede ser manejada");
        }
    }
}
