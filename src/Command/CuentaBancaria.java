package Command;

//Receiver (quien sabe realizar la solicitud o accion)
public class CuentaBancaria {
    private double saldo;

    public CuentaBancaria(double saldo) {
        this.saldo = saldo;
    }



    public void depostiar(double cant){
        saldo += cant;
    }

    public void retirar (double cant){
        saldo -= cant;
    }





    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }
}
