package br.com.sesi.model;

import java.util.Scanner;

public class Dados {

	protected String artista;
	protected String nome;
	protected double duracaoMinutos;
	protected double totalRepeticoes;
	protected double curtidas;
	protected double totalDeCurtidas;
	protected int  anoDeLancamento;
	protected String classificacao;
	protected String genero;
	 
	
	public String getClassificacao() {
		return classificacao;
	}
	public void setClassificacao(String classificacao) {
		this.classificacao = classificacao;
	}
	public String getGenero() {
		return genero;
	}
	public void setGenero(String genero) {
		this.genero = genero;
	}
	public String getArtista() {
		return artista;
	}
	public void setArtista(String artista) {
		this.artista = artista;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public double getDuracaoMinutos() {
		return duracaoMinutos;
	}
	public void setDuracaoMinutos(double duracaoMinutos) {
		this.duracaoMinutos = duracaoMinutos;
	}
	public double getTotalRepeticoes() {
		return totalRepeticoes;
	}
	public void setTotalRepeticoes(double totalRepeticoes) {
		this.totalRepeticoes = totalRepeticoes;
	}
	public double getCurtidas() {
		return curtidas;
	}
	public void setCurtidas(double curtidas) {
		this.curtidas = curtidas;
	}
	public double getTotalDeCurtidas() {
		return totalDeCurtidas;
	}
	public void setTotalDeCurtidas(int totalDeCurtidas) {
		this.totalDeCurtidas = totalDeCurtidas;
	}
	public int getAnoDeLancamento() {
		return anoDeLancamento;
	}
	public void setAnoDeLancamento(int anoDeLancamento) {
		this.anoDeLancamento = anoDeLancamento;
	}
	
public void imprimirInfo() {
		System.out.println("Musica Selecionada: " + nome);
		System.out.println("Música de: " + artista);
		System.out.println("Tempo de Duração: " + duracaoMinutos + " Minutos");
		System.out.println("Número de Curtidas: " + totalDeCurtidas);
		System.out.println("-------------------------------");
		System.out.println("Genero Musical: " + genero);
		System.out.println("Classificação de idade: " + classificacao);
	}
	
public void curtir() {
    Scanner scanner = new Scanner(System.in);

    String curtir;
    do {
        System.out.println("Deseja curtir esta música novamente? (SIM ou NAO)");
        curtir = scanner.nextLine();

        if (curtir.equalsIgnoreCase("SIM")) {
            curtidas++;
            totalDeCurtidas++;
            System.out.println("Obrgado Por Curtir a musica!");
            mostrarDetalhes();
        } else if (!curtir.equalsIgnoreCase("NAO")) {
            System.out.println("Opção invalida. Por favor, digite SIM ou NAO");
        }
    } while (!curtir.equalsIgnoreCase("NAO"));
}
	
	public void mostrarDetalhes() {
	    imprimirInfo();
	    System.out.println("Número de Curtidas: " + totalDeCurtidas);
	}
	
	
	
}