import br.com.estilos.Musica;
import br.com.estilos.PodCast;


import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        int opcao = 1, opcao2;

        Scanner scan = new Scanner(System.in);

        Musica musica = new Musica();
        musica.setTitulo("Wasting Love");
        musica.setDuracaoMinuos(6);
        musica.setBanda("Iron Miden");
        musica.setLetra("Maybe one day I'll be an honest man\n" +
                "Up 'til now I'm doing the best I can\n" +
                "Long roads, long days\n" +
                "Of sunrise to sunset, of sunrise to sunset\n" +
                "Dream on, brothers, while you can\n" +
                "Dream on, sisters, I hope you find the one\n" +
                "All of our lives, covered up quickly\n" +
                "By the tides of time\n" +
                "Spend your days full of emptiness\n" +
                "Spend your years full of loneliness\n" +
                "Wasting love, in a desperate caress\n" +
                "Rolling shadows of nights\n" +
                "Dream on, brothers, while you can\n" +
                "Dream on, sisters, I hope you find the one\n" +
                "All of our lives, covered up quickly\n" +
                "By the tides of time\n" +
                "Sands are flowing and the lines are in your hand\n" +
                "In your eyes I see the hunger, and the desperate cry that tears the night\n" +
                "Spend your days full of emptiness\n" +
                "Spend your years full of loneliness\n" +
                "Wasting love, in a desperate caress\n" +
                "Rolling shadows of nights\n" +
                "Spend your days full of emptiness\n" +
                "Spend your years full of loneliness\n" +
                "Wasting love, in a desperate caress\n" +
                "Rolling shadows of nights\n" +
                "Spend your days full of emptiness\n" +
                "Spend your years full of loneliness\n" +
                "Wasting love, in a desperate caress\n" +
                "Rolling shadows of nights");

        PodCast podcast = new PodCast();
        podcast.setTitulo("Entrevista com Elon Musk");
        podcast.setDuracaoMinuos(250);
        podcast.setProdutora("Flow");
        podcast.setLetra("Flow Podcast é um podcast brasileiro fundado por Bruno\n" +
                "Monteiro Aiub (Monark) e Igor Rodrigues Coelho (Igor 3K) em 2018.\n" +
                "O podcast é dirigido e produzido por Gianluca Santana Eugenio (Gianzão).\n" +
                "O podcast já entrevistou várias pessoas, incluindo políticos, influencers\n" +
                "digitais, entre outras celebridades.");

        while(opcao != 0){
            System.out.println("\nBem-vindo ao canal de audio, o que deseja ouvir?\n");
            System.out.println("1 - Musica (Wasting Love)\n2 - Podcast (Flow)\n0 - Sair");
            opcao = scan.nextInt();

            switch (opcao){
                case 1:
                    System.out.println(musica.reproduzir());
                    System.out.println("\nTotal de curtidas: "+ musica.getCurtidas());
                    System.out.println("\nTotal de notas: "+ musica.getNota());
                    System.out.println("\nTotal de reproducoes: "+ musica.getTotalRepoducao());
                    System.out.println("\nTotal de duracao em minutos: "+ musica.getDuracaoMinuos());

                    System.out.println("\n------------------------------------------");
                    System.out.println("Gostaria de curtir a Musica?\n1 - Curtir\nQualquer numero - Sair");
                    opcao2 = scan.nextInt();
                    if(opcao2 == 1){
                        musica.curtir();
                    }

                    System.out.println("\n------------------------------------------");
                    System.out.println("Gostaria de dar uma nota a Musica?\n1 - SIM\nQualquer numero - NAO");
                    opcao2 = scan.nextInt();
                    if(opcao2 == 1){
                        System.out.println("Digite a nota: ");
                        opcao2 = scan.nextInt();
                        musica.darNota(opcao);
                    }

                    break;
                case 2:
                    System.out.println(podcast.reproduzir());
                    System.out.println("\nTotal de curtidas: "+ podcast.getCurtidas());
                    System.out.println("\nTotal de notas: "+ podcast.getNota());
                    System.out.println("\nTotal de reproducoes: "+ podcast.getTotalRepoducao());
                    System.out.println("\nTotal de duracao em minutos: "+ podcast.getDuracaoMinuos());

                    System.out.println("\n------------------------------------------");

                    System.out.println("Gostaria de curtir a PodCast?\n1 - Curtir\nQualquer numero - Sair");
                    opcao2 = scan.nextInt();
                    if(opcao2 == 1){
                        podcast.curtir();
                    }
                    System.out.println("\n------------------------------------------");
                    System.out.println("Gostaria de dar uma nota a PodCast?\n1 - SIM\nQualquer numero - NAO");
                    opcao2 = scan.nextInt();
                    if(opcao2 == 1){
                        System.out.println("Digite a nota: ");
                        opcao2 = scan.nextInt();
                        podcast.darNota(opcao);
                    }
                    break;
            }


        }

    }
}
