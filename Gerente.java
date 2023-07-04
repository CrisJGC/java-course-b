public class Gerente extends Funcionario {
  private String clave;

  public double getBonificacionG() {
    return super.getSueldo() + super.getBonificacion();
  }

  public void setClave(String clave) {
    this.clave = clave;
  }

  public boolean autentificar(String clave){
    return this.clave.equals(clave);
  }
}
