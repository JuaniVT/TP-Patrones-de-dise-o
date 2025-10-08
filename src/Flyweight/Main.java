package Flyweight;

public class Main {
    public static void main(String[] args) {


        LetraFactory factory = new LetraFactory();

        String texto = "FLYWEIGHT";
        int x = 0;

        for (char c : texto.toCharArray()) {
            Letra letra = factory.getLetra(c); // pide letra al factory
            letra.mostrar(x, 0);               // pasa posición como estado extrínseco
            x += 10;                            // incrementa posición horizontal
        }

    }
}
