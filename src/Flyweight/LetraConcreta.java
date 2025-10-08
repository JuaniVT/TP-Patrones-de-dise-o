package Flyweight;

// ConcreteFlyweight

class LetraConcreta implements Letra {
    private final char caracter; // estado intrínseco

    public LetraConcreta(char caracter) {
        this.caracter = caracter;
    }

    @Override
    public void mostrar(int x, int y) {
        System.out.println("Mostrando '" + caracter + "' en posición (" + x + "," + y + ")");
    }
}