import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        Ebook[] ebooks = new Ebook[]{
                new Ebook ("Fundamentos De Java", "John Doe", 327, "Programação"),
                new Ebook ("Historia Da Arte", "Jane Doe", 630, "História"),
                new Ebook ("O Capital", "Karl Marx", 421, "Filosofia")
        };

        VideoDigital[] videos = new VideoDigital[] {
                new VideoDigital("O Último Príncipe Brasileiro", "Inultilismo", "23:18", "1080p 60fps"),
                new VideoDigital("Fuller House", "Zach Fuller", "30:28", "1080p 60fps"),
                new VideoDigital("Skepta Dance", "ValvetSweatSuit", "0:05", "240p")
        };

        while (true) {
            System.out.println("""
                    +_+-+_+-+_+-+_+ BEM VINDO(a) À BIBLIOTECA DIGITAL!!! +_+-+_+-+_+-+_+
                    
                    Selecione uma opção:
                    [1] - Baixar um livro
                    [2] - Buscar um vídeo
                    
                    [0] - Sair
                    """);
            switch (leitor.nextInt()) {
                case 1:
                    System.out.println("Digite o nome do ebook que você deseja buscar:");
                    leitor.nextLine();
                    String nome = Utils.capitalize(leitor.nextLine());
                    ItemBibliotecaDigital livro = Utils.buscarEbook(ebooks, nome);
                    Utils.verificacao(livro);

                    if (livro != null) {
                        System.out.println("Você deseja baixar o ebook? (s/n):");
                        switch (Utils.capitalize(leitor.nextLine())) {
                            case "S":
                                livro.baixar();
                                System.out.println("Ebook baixado com sucesso!" + "\n");
                                break;
                            case "N":
                                System.out.println("Voltando para o menu!" + "\n");
                                break;
                            default:
                                System.out.println("Opção inválida!" + "\n");
                                break;
                        }
                    }
                    break;

                case 2:
                    System.out.println("Digite o título do vídeo que você deseja buscar:");
                    leitor.nextLine();
                    String nomeVideo = Utils.capitalize(leitor.nextLine());
                    ItemBibliotecaDigital video = Utils.buscarVideo(videos, nomeVideo);
                    Utils.verificacao(video);

                    System.out.println("""
                            Opções:
                            [1] - Vizualizar o vídeo
                            [2] - Baixar o vídeo
                            
                            [0] - Voltar
                            """);

                    switch (leitor.nextInt()) {
                        case 1:
                            if (video != null) {
                                video.visualizar();
                            }
                            break;

                        case 2:
                            if (video != null) {
                                video.baixar();
                                System.out.println("Vídeo baixado!");
                            }
                            break;

                        case 0:
                            System.out.println("Voltando....");
                            break;

                        default:
                            System.out.println("Opção inválida!" + "\n");
                    }
                    break;

                case 0:
                    System.out.println("""
                            Sentiremos sua falta!
                            """);
                    System.exit(0);
                    break;

                default:
                    System.out.println("Opção inválida!" + "\n");
                    break;
            }
        }
    }
}