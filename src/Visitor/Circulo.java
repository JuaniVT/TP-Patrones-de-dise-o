package Visitor;


// Clase concreta
class Circulo implements Figura {


    private double radio;

    public Circulo(double radio) {
        this.radio = radio;
    }

    public double getRadio() {
        return radio;
    }

    @Override
    public void aceptar(Visitor visitor) {
        visitor.visitar(this); // acepta el visitante
    }
}