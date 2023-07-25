package br.com.projeto;

import br.com.classes.Cliente;
import br.com.classes.Diarista;

public class App {

	public static void main(String[] args) {
		
		Diarista diarista = new Diarista();
		
		diarista.nome = " João da Silva🧑";
		diarista.telefone = "(11) 987577-7859";
		diarista.endereço = "Av Cajamar, N: 111";
		diarista.chavePix = "123";
		
		
		
		System.out.println("Nome Diarista: " + diarista.nome);
		System.out.println("Telefone Diarista: " + diarista.telefone);
		System.out.println("Endereço Diarista: " + diarista.endereço);
		diarista.atender("José👨");
		
		System.out.println("✨------------------------------------------✨");

		Cliente cliente = new Cliente();
			
		cliente.nome = "Daniel🐭";
		cliente.telefone ="40028922";
		cliente.endereço = "Osasco";
		cliente.saldo = 100.0;
		
		System.out.println("Nome Cliente: " + cliente.nome);
		System.out.println("Telefone Cliente: " + cliente.telefone);
		System.out.println("Endereço Cliente: " + cliente.endereço);
	}
	
	
	

}