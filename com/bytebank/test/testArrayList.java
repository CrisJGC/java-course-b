package com.bytebank.test;

import java.util.ArrayList;

import com.bytebank.modelo.Cuenta;
import com.bytebank.modelo.CuentaCorriente;

public class testArrayList {
  public static void main(String[] args) {
    // tipo de ArrayList
    ArrayList<Cuenta> lista = new ArrayList<>();
    Cuenta cc = new CuentaCorriente(10,20);
    Cuenta cc2 = new CuentaCorriente(11,22);
    Cuenta cc3 = new CuentaCorriente(11, 42);

    lista.add(cc);
    lista.add(cc2);

    // Cuenta obtenerCuenta = (Cuenta) lista.get(0);
    // System.out.println(obtenerCuenta);

    for(int i = 0; i <lista.size(); i++){
      System.out.println(lista.get(i));
    }

    for(Cuenta cuenta : lista){
      System.out.println(cuenta);
    }

    boolean contiene = lista.contains(cc3);
    if(contiene){
      System.out.println("Si");
    }
  }
  
  
}
