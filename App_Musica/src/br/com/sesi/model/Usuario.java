package br.com.sesi.model;

import java.io.IOException;
import java.util.Scanner;

public class Usuario extends Dados {

	private String nomeUsuario;
	private String email;
	private String maisEscutada;
	private double horasescutadas;
	
	public String getNomeUsuario() {
		return nomeUsuario;
	}
	public void setNomeUsuario(String nomeUsuario) {
		this.nomeUsuario = nomeUsuario;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getmaisEscutada() {
		return maisEscutada;
	}
	public void setmaisEscutada(String maisEscutada) {
		this.maisEscutada = maisEscutada;
	}
	public double getHorasescutadas() {
		return horasescutadas;
	}
	public void setHorasescutadas(double horasescutadas) {
		this.horasescutadas = horasescutadas;
	}
	
	public void ImprimirUsuario() {
		System.out.println("------------------");
		System.out.println("Bem Vindo " + nomeUsuario);
		System.out.println("Você passou:" + horasescutadas + " horas escutando nossas musicas");
	}
	
	
	

//	// Método para limpar o console
//	private static void clearConsole() throws InterruptedException, IOException {
//		 for (int i = 0; i < 3; ++i) System.out.println();
//	}

	
}
