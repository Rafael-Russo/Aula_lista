package dominio;

public class ContaCorrente {
    private Float saldo = 0.0F;
    protected Cliente cliente;

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public Float getSaldo() {
        return saldo;
    }

    public void setSaldo(Float saldo) {
        this.saldo = saldo;
    }

    public void depositar(Float valor){
        setSaldo(getSaldo() + valor);
    }
}
