package Iterator;


//interfaz que devuelve un iterador de cualquier tipo de objeto
public interface Aggregate <t>{
    Iterador<t> createIterator(String categoria);
}
