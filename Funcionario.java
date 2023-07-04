public class Funcionario {
  private String nombre;
  private String documento;
  private double sueldo;

  public Funcionario() {

  }

  public String getNombre() {
    return this.nombre;
  }

  public void setNombre(String nombre) {
    this.nombre = nombre;
  }

  public String getDocumento() {
    return this.documento;
  }

  public void setDocumento(String documento) {
    this.documento = documento;
  }

  public double getSueldo() {
    return this.sueldo;
  }

  public void setSueldo(double sueldo) {
    this.sueldo = sueldo;
  }

  public double getBonificacion() {
    return this.sueldo * 0.05;
  }
}
