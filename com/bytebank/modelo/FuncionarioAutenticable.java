package com.bytebank.modelo;
public class FuncionarioAutenticable {
  
  private int contraseña;

  public void setContraseña(int contraseña) {
    this.contraseña = contraseña;
  }

  public boolean autenticar(int contraseña) {
    if (this.contraseña == contraseña) {
      return true;
    } else {
      return false;
    }
  }

}
