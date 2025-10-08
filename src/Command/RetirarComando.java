package Command;


//Comando concreto
public class RetirarComando implements Comando{
    private CuentaBancaria cuentaBancaria;
    private double monto;


    public RetirarComando(CuentaBancaria cuentaBancaria, double monto) {
        this.cuentaBancaria = cuentaBancaria;
        this.monto = monto;
    }

    @Override
    public void ejecutar() {
        cuentaBancaria.retirar(monto);
    }

    @Override
    public void deshacer() {
        cuentaBancaria.depostiar(monto);
    }
}
