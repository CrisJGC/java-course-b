public class CuentaAhorros extends Cuenta{
  public CuentaAhorros(int agencia, int numero) {
    super(agencia, numero);
  }

  public void deposita(double valor) {
    this.saldo += this.saldo + valor;
  }
}

