package Memento;

// Clase Memento: guarda el estado del texto

class Memento {
    private final String estadoTexto;

    public Memento(String estadoTexto) {
        this.estadoTexto = estadoTexto;
    }

    public String getEstadoTexto() {
        return estadoTexto;
    }
}