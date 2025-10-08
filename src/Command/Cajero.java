package Command;


import javax.swing.*;
import java.util.ArrayList;

//Invoker (el que recibe la orden de ejecutar el comando e inica el comando sin saber como funciona intermanete)
public class Cajero {
    //lista para guardar todas las operaciones por si se quiere deshacer una o demas coasas
    private ArrayList<Comando> historial;

    public Cajero() {
        historial = new ArrayList<>();
    }

    //metodo que ejecuta la operacion sin saber la logica interna del comando
    public void ejecutarOperacion (Comando comando){
        comando.ejecutar();
        historial.add(comando);
    }

    public void deshacerUltimaOperacion (){
        if (!historial.isEmpty()){
            Comando ultimaOperacion = historial.getLast();
            historial.remove(ultimaOperacion);
        }

        System.out.println("no hay operaciones disponibles");
    }
}
