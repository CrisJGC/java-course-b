public class Contador extends Funcionario {
  public double getBonificacion(){
    System.out.println("Llamando al contador");
    return super.getBonificacion();
  }
}
