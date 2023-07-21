package com.bytebank.test;

public class testMain {
  public static void main(String[] args) {
    int edad1 = 20;
    int edad2 = 28;
    int edad3 = 64;

    int[] edades = new int[3];
    edades[0] = edad1;
    edades[1] = edad2;
    edades[2] = edad3;
    for(int i = 0; i <= edades.length-1; i++) {
      System.out.println(edades[i]);
    }
  }
}
