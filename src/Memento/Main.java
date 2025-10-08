package Memento;

public class Main {
    public static void main(String[] args) {

        EditorTexto editor = new EditorTexto();
        Historial historial = new Historial();

        editor.escribir("Hola");
        historial.guardar(editor.guardar()); // cada vez que se escribe se guarda en el historial

        editor.escribir(" mundo");
        historial.guardar(editor.guardar());

        editor.escribir("!!!");
        historial.guardar(editor.guardar());

        System.out.println("Texto actual: " + editor.getTexto());

        editor.restaurar(historial.deshacer());
        System.out.println("Después de deshacer: " + editor.getTexto());


        editor.restaurar(historial.deshacer());
        System.out.println("Después de otro deshacer: " + editor.getTexto());

    }
}
