public class ControlBonificacion {
  private double suma;

  public double registrarSalario(Funcionario funcionario){
    // System.out.println(this.suma);
    return this.suma += funcionario.getBonificacion();
  }
  
  // public double registrarSalario(Gerente gerente){
  //   // System.out.println(this.suma);
  //   return this.suma += gerente.getBonificacion();
  // }

}
