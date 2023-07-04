public class testGerente {
  public static void main(String[] args) {
    Gerente g1 = new Gerente();
    g1.setNombre("Gerente Don");
    g1.setDocumento("GG89HG63");
    g1.setSueldo(6000);
    g1.setClave("JavaCurso");

    System.out.println(g1.autentificar("JavaCurso"));
  }
}
