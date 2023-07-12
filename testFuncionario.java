public class testFuncionario {
  public static void main(String[] args) {
    Funcionario f1 = new Contador();
    f1.setNombre("Cris");
    f1.setDocumento("FG45F89");
    f1.setSueldo(2000);
    f1.setTipo(0);

    System.out.println(f1.getSueldo());
    System.out.println(f1.getBonificacion());
  }
}
