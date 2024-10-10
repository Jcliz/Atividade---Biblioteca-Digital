import java.util.Scanner;

public class Utils {
    public static Ebook buscarEbook (Ebook[] ebooks, String nome) {
        for (Ebook e : ebooks) {
            if (e.getTitulo().equals(nome)) {
                return e;
            }
        }
        System.out.println("Ebook inexistente!" + "\n");
        return null;
    }

    public static VideoDigital buscarVideo (VideoDigital[] videos, String nome) {
        for (VideoDigital v : videos) {
            if (v.getTitulo().equals(nome)) {
                return v;
            }
        }
        System.out.println("Vídeo inexistente!" + "\n");
        return null;
    }

    public static String capitalize (String nome) {
        if (nome == null || nome.isEmpty()) {
            return nome;
        }

        String[] palavras = nome.split(" ");
        StringBuilder strBuilder = new StringBuilder();

        for (String palavra : palavras) {
            if (!palavra.isEmpty()) {
                strBuilder.append(palavra.substring(0, 1).toUpperCase())
                        .append(palavra.substring(1).toLowerCase());
            }
            strBuilder.append(" ");
        }

        return strBuilder.toString().trim();
    }

    public static void verificacao (ItemBibliotecaDigital item) {
        if (item != null) {
            System.out.println("Detalhes:" + "\n");
            item.descricao();
        }
    }
}
