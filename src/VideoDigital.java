public class VideoDigital extends ItemBibliotecaDigital implements Baixavel, Visualizavel{
    private String duracao;
    private String qualidade;

    public VideoDigital (String tituloItem, String autorItem, String duracao, String qualidade) {
        super(tituloItem, autorItem);
        this.duracao = duracao;
        this.qualidade = qualidade;
    }

    public void descricao() {
        System.out.println(super.toString());
        System.out.println("-_-_-_-_-_-_-_-_-_-_-_-_-_-_-" + "\n" +
                "Duração: " + this.duracao + "\n" +
                "Qualidade: " + this.qualidade + "\n" +
                "-_-_-_-_-_-_-_-_-_-_-_-_-_-_-" + "\n");
    }

    public void baixar() {
        System.out.println("Baixando o video...");
    }

    public void visualizar() {
        System.out.println("""
                VIDEO:
                  ⠁⠁⠁⠁⠁⠁⠁⢀⣴⣶⣿⣿⣷⣶⣦⡀⠁⠁⠁⠁⠁⠁⠁⠁⠁⠁⠁⠁
                ⠁⠁⠁⠁⠁⠁⠁⣠⣿⣿⣿⣿⣿⣿⣟⣿⣿⣧⣄⠁⠁⠁⠁⠁⠁⠁⠁⠁⠁
                 ⠁⠁⠁⠁⣠⣴⣾⣿⣿⣿⣿⣿⣿⣷⣿⣷⣿⣿⣿⣷⣦⣄⡀⠁⠁⠁⠁⠁⠁
                  ⢀⣠⠶⠿⠿⠛⠛⠛⠛⠛⠛⠉⠋⠉⠋⠙⠙⠋⠛⠛⠟⠿⠿⣷⣦⡀⠁⠁⠁
                 ⠘⠤⡁⡐⢀⠁⠁⡀⠂⢀⠁⢀⠁⠂⠁⡀⢀⠁⡀⢀⠁⠁⠁⠁⢉⡹⠁⠁⠁
                 ⠁⠁⠁⠁⠁⠄⣦⣾⡼⠁⣤⢄⠤⠠⠠⠄⢠⠁⡄⢠⢀⡢⠦⠁⠁⡀⠁⠁⠁
                 ⠁⠁⠁⠁⠁⠘⠥⡄⣀⠓⢍⢡⢃⡜⢰⠨⠦⠊⠈⠁⠁⢀⢀⠁⡌⢸⡇⠁⠁
                ⠁⠁⠁⠁⠁⠁⠁⠁⠁⠉⠈⣠⣕⢀⢆⢑⡑⢤⣢⡀⠆⢐⠁⠁⢂⠜⠳⠶⡄
                ⠁⠁⠁⠁⠁⠁⠁⢀⣀⠤⢾⡟⣫⠝⠖⡡⠃⠂⠠⠙⠲⠤⣀⠁⡁⢀⢂⡐⠃
                ⠁⠁⠁⢀⣠⣴⢶⡏⠈⠁⣺⢞⡏⡝⠬⡠⢂⡘⣐⣤⠁⠁⠉⠢⣄⣀⡀⠁⠁
                ⠁⠁⠁⡛⠁⠁⠁⠁⠁⠁⣿⣮⡧⣽⢶⣵⣿⣾⣧⣿⡦⠂⠁⠁⠠⠁⡎⡩⠁
                ⠁⠁⠁⠈⠁⠁⠁⠁⠁⠁⠁⠘⠳⣻⣾⡿⡽⡧⣟⡝⢷⢖⣶⣄⠁⠁⠁⠁⠁
                ⠁⠁⠁⠁⠁⠁⠁⠁⠁⣀⠁⠁⠁⣹⡿⣿⠟⠁⠁⣤⣿⢺⡆⡟⢧⠁⠁⠁⠁
                ⠁⠁⠁⠁⠁⠁⠖⡛⠻⠛⠿⢟⢿⢻⡻⣯⠁⠁⠈⠛⠘⠁⠃⠑⠁⠁⠁⠁⠁
                ⠁⠁⠁⠁⠁⠁⠁⠁⠁⠈⠁⠁⠁⠁⠁⠈⠁⠁⠁⠁⠁⠁⠁⠁⠁⠁⠁⠁⠁""");
    }
}
