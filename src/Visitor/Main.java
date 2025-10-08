package Visitor;

public class Main {
    public static void main(String[] args) {

        Figura f1 = new Circulo(5);
        Figura f2 = new Cuadrado(4);

        Visitor visitorArea = new VisitorArea();
        Visitor visitorDibujar = new VisitorDibujar();

        // Aplicamos los visitantes
        f1.aceptar(visitorArea);
        f2.aceptar(visitorArea);

        f1.aceptar(visitorDibujar);
        f2.aceptar(visitorDibujar);

    }
}
