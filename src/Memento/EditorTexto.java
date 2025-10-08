package Memento;


// Clase Originator: el editor de texto
class EditorTexto {

    private String texto = "";

    public void escribir(String nuevoTexto) {
        texto += nuevoTexto;
    }

    public String getTexto() {
        return texto;
    }

    // Crea un Memento con el estado actual
    public Memento guardar() {
        return new Memento(texto);
    }

    // Restaura el estado desde un Memento
    public void restaurar(Memento memento) {
        this.texto = memento.getEstadoTexto();
    }
}