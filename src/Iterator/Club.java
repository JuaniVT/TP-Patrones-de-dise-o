package Iterator;

import java.util.ArrayList;
import java.util.List;


//Aggregate Concreto (el club puede devolver un iterador del tipo de objeto que tenga la coleccion)
public class Club implements Aggregate<Deportista>{
    private List<Deportista> deportistas = new ArrayList<>();

    public void agregarDeportista(Deportista d) {
        deportistas.add(d);
    }

    @Override
    public Iterador<Deportista> createIterator(String categoria) {
        return new ClubIterator(deportistas, categoria);
    }
}
