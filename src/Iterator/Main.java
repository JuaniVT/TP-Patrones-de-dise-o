package Iterator;

import java.util.Iterator;

public class Main {
    public static void main(String[] args) {
        Club club = new Club();

        club.agregarDeportista(new Deportista("Juan", "100m"));
        club.agregarDeportista(new Deportista("María", "Maratón"));
        club.agregarDeportista(new Deportista("Pedro", "100m"));
        club.agregarDeportista(new Deportista("Lucía", "Salto"));


        Iterador<Deportista> iter100m = club.createIterator("100m");
        while (iter100m.hasNext()) {
            Deportista d = iter100m.next();
            System.out.println(d.getNombre() + " - " + d.getCategoria());
        }

        Iterador <Deportista> iterMaraton = club.createIterator("Maratón");
        while (iterMaraton.hasNext()) {
            Deportista d = iterMaraton.next();
            System.out.println(d.getNombre() + " - " + d.getCategoria());
        }
    }
}
