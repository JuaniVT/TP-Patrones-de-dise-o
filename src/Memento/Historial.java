package Memento;

// Clase Caretaker: administra el historial

import java.util.Stack;

class Historial {

    private final Stack<Memento> estados = new Stack<>();

    public void guardar(Memento memento) {
        estados.push(memento);
    }

    public Memento deshacer() {
        if (!estados.isEmpty()) {
            estados.pop(); // elimina el estado actual
            if (!estados.isEmpty()) {
                return estados.peek(); // devuelve el anterior
            }
        }
        return new Memento(""); // si no hay más estados, texto vacío
    }
}