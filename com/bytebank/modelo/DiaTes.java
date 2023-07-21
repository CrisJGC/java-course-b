package com.bytebank.modelo;
public class DiaTes {
  public static void main(String[] args) {
    for(Dia dia : Dia.values()){
      System.out.println("Dia de la semana: " + dia);
    }

    Dia sabado = Dia.SABADO;
    System.out.println(sabado.name());

  }
}
