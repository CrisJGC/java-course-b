public class testSistema {
  public static void main(String[] args) {
    
    Gerente g = new Gerente();
    g.setClave("1234");

    Administrador admin = new Administrador();

    SIstemaInterno si = new SIstemaInterno();
    
    si.autentica(g);
    si.autentica(admin);  
  }
}
