package Visitor;

//Visitor concreto: dibuja las figuras

class VisitorDibujar implements Visitor {

    @Override
    public void visitar(Circulo circulo) {
        System.out.println("Dibujando un círculo de radio " + circulo.getRadio());
    }

    @Override
    public void visitar(Cuadrado cuadrado) {
        System.out.println("Dibujando un cuadrado de lado " + cuadrado.getLado());
    }
}