public class testReferecnias {
  public static void main(String[] args) {
    Funcionario fNew = new Gerente();
    fNew.setNombre("Eris");
    fNew.setSueldo(1000);

    Gerente gNew = new Gerente();
    gNew.setNombre("Eris Gerente");
    gNew.setSueldo(3000);

    gNew.iniciarSesion("_asd");
  }
}
