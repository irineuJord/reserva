package br.com.main;

import br.com.classes.veiculo;

public class main {

	public static void main(String[] args) {
		
		
		
		veiculo corsa = new veiculo();
		corsa.nome = "Corsa";
		corsa.cor = "Amarelo";
		corsa.motor = "16cv";
		corsa.velocidade = 100;
		
		veiculo HB20 = new veiculo();
		HB20.nome = "HB20";
		HB20.cor = "Prata";
		HB20.motor = "200cv";
		HB20.velocidade = 400;
		
		veiculo Onix = new veiculo();
		Onix.nome = "Onix";
		Onix.cor = "Vermelho";
		Onix.motor = "500cv";
		Onix.velocidade = 4500;
		
		
		
		System.out.println("Nome: " + corsa.nome);
		System.out.println("Cor: " + corsa.cor);
		System.out.println("Motor: " + corsa.motor);
		System.out.println("Velocidade: " + corsa.velocidade);
		
		System.out.println("Nome: " + HB20.nome);
		System.out.println("Cor: " + HB20.cor);
		System.out.println("Motor: " + HB20.motor);
		System.out.println("Velocidade: " + HB20.velocidade);
		
		System.out.println("Nome: " + Onix.nome);
		System.out.println("Cor: " + Onix.cor);
		System.out.println("Motor: " + Onix.motor);
		System.out.println("Velocidade: " + Onix.velocidade);
		
		
		
	}

}
