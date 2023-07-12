public class Contador extends Funcionario {

  @Override
  public double getBonificacion(){
    System.out.println("Llamando al contador");
    return 200;
  }
}
