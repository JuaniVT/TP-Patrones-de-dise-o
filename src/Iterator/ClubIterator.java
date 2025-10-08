package Iterator;


import java.util.List;

//Iterador Concreto (aca le damos la logica de iteracion)
public class ClubIterator implements Iterador<Deportista> {
    private List<Deportista> deportistas;
    private String categoria;
    private int posicion = 0;

    public ClubIterator(List<Deportista> deportistas, String categoria) {
        this.deportistas = deportistas;
        this.categoria = categoria;
        moverPosicionValida();
    }

    private void moverPosicionValida() {
        while (posicion < deportistas.size() && !deportistas.get(posicion).getCategoria().equals(categoria)) {
            posicion++;
        }
    }

    @Override
    public boolean hasNext() {
        return posicion < deportistas.size();
    }

    @Override
    public Deportista next() {
        Deportista actual = deportistas.get(posicion);
        posicion++;
        moverPosicionValida(); // saltamos a la próxima coincidencia
        return actual;
    }
}
