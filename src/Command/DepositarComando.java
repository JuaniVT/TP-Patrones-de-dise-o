package Command;


//Comando Contreto
public class DepositarComando implements Comando{
    private CuentaBancaria cuentaBancaria;
    private double monto;


    public DepositarComando(CuentaBancaria cuentaBancaria, double monto) {
        this.cuentaBancaria = cuentaBancaria;
        this.monto = monto;
    }

    @Override
    public void ejecutar() {
        cuentaBancaria.depostiar(monto);
    }

    @Override
    public void deshacer() {
        cuentaBancaria.retirar(monto);
    }
}
