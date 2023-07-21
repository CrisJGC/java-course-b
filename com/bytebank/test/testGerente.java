package com.bytebank.test;
import com.bytebank.modelo.Gerente;
public class testGerente {
  public static void main(String[] args) {
    Gerente g1 = new Gerente();
    // g1.setNombre("Gerente Don");
    // g1.setDocumento("GG89HG63");
    g1.setSueldo(6000);
    g1.setClave("JavaCurso");
    g1.setTipo(1);

    System.out.println(g1.iniciarSesion("JavaCurso"));
  }
}
