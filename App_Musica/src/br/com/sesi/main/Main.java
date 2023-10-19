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
        System.out.println(" 🎧 Veigh's Music 🎧");

        System.out.print("Digite seu nome de usuário:");
        usuario.setNomeUsuario(scanner.nextLine());
        System.out.print("Digite seu email:");
        usuario.setEmail(scanner.nextLine());
        usuario.setHorasescutadas(2003);
        usuario.ImprimirUsuario();

        String resposta;
        String escolherNovamente = "SIM";

        while (escolherNovamente.equalsIgnoreCase("SIM")) {
            System.out.println("Este é o lugar para voce apreciar todas as musicas de Veigh");
            System.out.println("Digite nome de qualquer musica de seu álmbum: ");

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
                    
                    
                    
                case "Novo Balanço":
                	 musica.setNome("Novo Balanço");
                     musica.setArtista("Veigh");
                     musica.setDuracaoMinutos(3);
                     musica.setGenero("TRAP");
                     musica.setClassificacao("Livre");
                     musica.imprimirInfo();
                     break;
                     
                case "Mandraka":
               	 musica.setNome("Mandraka");
                    musica.setArtista("Veigh");
                    musica.setDuracaoMinutos(3);
                    musica.setGenero("TRAP");
                    musica.setClassificacao("Livre");
                    musica.imprimirInfo();
                    break;
                case "Favelinha":
                  	 musica.setNome("Favelinha");
                       musica.setArtista("Veigh");
                       musica.setDuracaoMinutos(3);
                       musica.setGenero("TRAP");
                       musica.setClassificacao("Livre");
                       musica.imprimirInfo();
                       break;
                case "Chapa Quente":
                 	 musica.setNome("Chapa Quente");
                      musica.setArtista("Veigh");
                      musica.setDuracaoMinutos(3);
                      musica.setGenero("TRAP");
                      musica.setClassificacao("Livre");
                      musica.imprimirInfo();
                      break;
                case "Bandana":
                	 musica.setNome("Bandana");
                     musica.setArtista("Veigh");
                     musica.setDuracaoMinutos(3);
                     musica.setGenero("TRAP");
                     musica.setClassificacao("Livre");
                     musica.imprimirInfo();
                     break;
                case "Jeito Bandido":
               	 musica.setNome("Jeito Bandido");
                    musica.setArtista("Veigh");
                    musica.setDuracaoMinutos(3);
                    musica.setGenero("TRAP");
                    musica.setClassificacao("Livre");
                    musica.imprimirInfo();
                    break;
                case "Luxo No Morro":
                  	 musica.setNome("Luxo No Morro");
                       musica.setArtista("Veigh");
                       musica.setDuracaoMinutos(3);
                       musica.setGenero("TRAP");
                       musica.setClassificacao("Livre");
                       musica.imprimirInfo();
                       break;
                case "Vida Chique":
                 	 musica.setNome("Vida Chique");
                      musica.setArtista("Veigh");
                      musica.setDuracaoMinutos(3);
                      musica.setGenero("TRAP");
                      musica.setClassificacao("Livre");
                      musica.imprimirInfo();
                      break;
                case "Perdoa Por Tudo Vida":
                 	 musica.setNome("Perdoa Por Tudo Vida");
                      musica.setArtista("Veigh");
                      musica.setDuracaoMinutos(3);
                      musica.setGenero("TRAP");
                      musica.setClassificacao("Livre");
                      musica.imprimirInfo();
                      break;
                case "6AM NA COHAB":
                 	 musica.setNome("6AM NA COHAB");
                      musica.setArtista("Veigh");
                      musica.setDuracaoMinutos(3);
                      musica.setGenero("TRAP");
                      musica.setClassificacao("Livre");
                      musica.imprimirInfo();
                      break;
                      
                case "Londres Freestyle":
                	 musica.setNome("Londres Freestyle");
                     musica.setArtista("Veigh");
                     musica.setDuracaoMinutos(3);
                     musica.setGenero("TRAP");
                     musica.setClassificacao("Livre");
                     musica.imprimirInfo();
                     break;
                case "Orações":
                	 musica.setNome("Orações");
                     musica.setArtista("Veigh");
                     musica.setDuracaoMinutos(3);
                     musica.setGenero("TRAP");
                     musica.setClassificacao("Livre");
                     musica.imprimirInfo();
                     break;
                case "Pelo Momento":
                	 musica.setNome("Pelo Momento");
                     musica.setArtista("Veigh");
                     musica.setDuracaoMinutos(3);
                     musica.setGenero("TRAP");
                     musica.setClassificacao("Livre");
                     musica.imprimirInfo();
                     break;
                case "Mil Maneiras":
                	 musica.setNome("Mil Maneiras");
                     musica.setArtista("Veigh");
                     musica.setDuracaoMinutos(3);
                     musica.setGenero("TRAP");
                     musica.setClassificacao("Livre");
                     musica.imprimirInfo();
                     break;
                case "7 da Sorte":
                	 musica.setNome("7 da Sorte");
                     musica.setArtista("Veigh");
                     musica.setDuracaoMinutos(3);
                     musica.setGenero("TRAP");
                     musica.setClassificacao("Livre");
                     musica.imprimirInfo();
                     break;
                case "Champagne":
                	 musica.setNome("Champagne");
                     musica.setArtista("Veigh");
                     musica.setDuracaoMinutos(3);
                     musica.setGenero("TRAP");
                     musica.setClassificacao("Livre");
                     musica.imprimirInfo();
                     break;
                case "Clickbait":
                	 musica.setNome("Clickbait");
                     musica.setArtista("Veigh");
                     musica.setDuracaoMinutos(3);
                     musica.setGenero("TRAP");
                     musica.setClassificacao("Livre");
                     musica.imprimirInfo();
                     break;
                case "Detalhes":
                	 musica.setNome("Detalhes");
                     musica.setArtista("Veigh");
                     musica.setDuracaoMinutos(3);
                     musica.setGenero("TRAP");
                     musica.setClassificacao("Livre");
                     musica.imprimirInfo();
                     break;
                case "Tendenciosa":
                	 musica.setNome("Tendenciosa");
                     musica.setArtista("Veigh");
                     musica.setDuracaoMinutos(3);
                     musica.setGenero("TRAP");
                     musica.setClassificacao("Livre");
                     musica.imprimirInfo();
                     break;
                case "Hora Errada":
               	 musica.setNome("Hora Errada");
                    musica.setArtista("Veigh");
                    musica.setDuracaoMinutos(3);
                    musica.setGenero("TRAP");
                    musica.setClassificacao("Livre");
                    musica.imprimirInfo();
                    break;
                case "Devolve as Correntes":
               	 musica.setNome("Devolve as Correntes");
                    musica.setArtista("Veigh");
                    musica.setDuracaoMinutos(3);
                    musica.setGenero("TRAP");
                    musica.setClassificacao("Livre");
                    musica.imprimirInfo();
                    break;
                case "Engana Dizendo Que Ama":
               	 musica.setNome("Engana Dizendo Que Ama");
                    musica.setArtista("Veigh");
                    musica.setDuracaoMinutos(3);
                    musica.setGenero("TRAP");
                    musica.setClassificacao("Livre");
                    musica.imprimirInfo();
                    break;
                case "Turma do Bairro":
               	 musica.setNome("Turma do Bairro");
                    musica.setArtista("Veigh");
                    musica.setDuracaoMinutos(3);
                    musica.setGenero("TRAP");
                    musica.setClassificacao("Livre");
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