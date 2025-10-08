package Visitor;

// Visitor concreto: calcula el área
class VisitorArea implements Visitor {

    @Override
    public void visitar(Circulo circulo) {
        double area = Math.PI * Math.pow(circulo.getRadio(), 2);
        System.out.println("Área del círculo: " + area);
    }

    @Override
    public void visitar(Cuadrado cuadrado) {
        double area = Math.pow(cuadrado.getLado(), 2);
        System.out.println("Área del cuadrado: " + area);
    }
}