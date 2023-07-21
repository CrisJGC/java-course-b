package com.bytebank.modelo;
public class SIstemaInterno {
  
  private String clave = "JavaCurso";
	
	public boolean autentica(Autenticable gerente) {
		boolean puedeIniciarSesion = gerente.iniciarSesion(clave);
		if (puedeIniciarSesion) {
			System.out.println("Login exitoso");
			return true;
		} else {
			System.out.println("Error en login");
			return false;
		}
	}
}
