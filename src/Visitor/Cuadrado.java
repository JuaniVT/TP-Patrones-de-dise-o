package Visitor;

// Clase concreta
class Cuadrado implements Figura {

    private double lado;

    public Cuadrado(double lado) {
        this.lado = lado;
    }

    public double getLado() {
        return lado;
    }

    @Override
    public void aceptar(Visitor visitor) {
        visitor.visitar(this);
    }
}