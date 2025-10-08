package Command;

public class Main {
    public static void main(String[] args) {

        //aca seria la parte del cliente, donde se crea todo

        CuentaBancaria cuentaBancaria = new CuentaBancaria(200);
        Cajero cajero = new Cajero();

        //creamos comandos
        DepositarComando depositarComando = new DepositarComando(cuentaBancaria, 500);
        RetirarComando retirarComando = new RetirarComando(cuentaBancaria, 200);

        //el cajero ejecuta las operaciones (invoker)
        cajero.ejecutarOperacion(depositarComando);
        cajero.ejecutarOperacion(retirarComando);

        //si queremos deshacer la ultima operacion (aca se podria tener muchos mas metodos para tener mas operaciones del estilo)
        cajero.deshacerUltimaOperacion();
    }
}
