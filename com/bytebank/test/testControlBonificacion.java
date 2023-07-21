package com.bytebank.test;
import com.bytebank.modelo.*;

public class testControlBonificacion {
  public static void main(String[] args) {
    Funcionario Eris = new Contador();
    Eris.setNombre("Eris");
    Eris.setSueldo(2000);

    Gerente ErisGerente = new Gerente();
    ErisGerente.setNombre("Eris Gerente");
    ErisGerente.setSueldo(10000);

    Contador ErisContador = new Contador();
    ErisContador.setSueldo(5000);

    ControlBonificacion controlBonificacion = new ControlBonificacion();

    controlBonificacion.registrarSalario(Eris);
    controlBonificacion.registrarSalario(ErisGerente);
    controlBonificacion.registrarSalario(ErisContador);

  }
  
}
