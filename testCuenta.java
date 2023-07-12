public class testCuenta {
  public static void main(String[] args) {
    Cuenta corriente = new CuentaCorriente(1, 1);
    Cuenta ahorros = new CuentaAhorros(2, 2);

    corriente.deposita(2000);
    corriente.transfiere(500, ahorros);

    System.out.println(corriente.getSaldo());
    System.out.println(ahorros.getSaldo());
    // ahorros.deposita(150);


  }
  
}
