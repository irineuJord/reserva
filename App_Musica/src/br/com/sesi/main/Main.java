package br.com.sesi.main;

import java.util.Scanner;
import br.com.sesi.model.Musica;
import br.com.sesi.model.Usuario;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Musica musica = new Musica();
        Usuario usuario = new Usuario();

        System.out.println("----BEM VINDO----");
        System.out.println(" 🎧 Vi'Music 🎧");

        System.out.print("Digite seu nome de usuário:");
        usuario.setNomeUsuario(scanner.nextLine());
        System.out.print("Digite seu email:");
        usuario.setEmail(scanner.nextLine());
        usuario.setHorasescutadas(2003);
        usuario.ImprimirUsuario();

        String resposta;
        String escolherNovamente = "SIM";

        while (escolherNovamente.equalsIgnoreCase("SIM")) {
            System.out.println("O que você deseja Ouvir Hoje?");
            System.out.println("Opções: Veigh or Eminem");
            System.out.println("Digite nome da sua música/Artista: ");

            String escolher = scanner.nextLine();

            switch (escolher) {
                case "veigh","Bolsa de Ombro":
                    musica.setNome("Bolsa de Ombro");
                    musica.setArtista("Veigh");
                    musica.setDuracaoMinutos(3);
                    musica.setGenero("TRAP");
                    musica.setClassificacao("Livre");
                    musica.imprimirInfo();
                    break;

                case "eminem","Mockingbird":
                    musica.setNome("Mockingbird");
                    musica.setArtista("Eminem");
                    musica.setDuracaoMinutos(3);
                    musica.setGenero("RAP");
                    musica.setClassificacao("+18");
                    musica.imprimirInfo();
                    break;

                default:
                    System.out.println("Música não reconhecida.");
            }

            musica.curtir();

            System.out.println("Quer escutar outra música? (SIM ou NAO)");
            resposta = scanner.nextLine();
            escolherNovamente = resposta;
        }
    }
}