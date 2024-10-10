public class Ebook extends ItemBibliotecaDigital implements Baixavel{
    private int numeroPaginas;
    private String genero;

    public Ebook (String tituloItem, String autorItem, int numeroPaginas, String genero) {
        super(tituloItem, autorItem);
        this.numeroPaginas = numeroPaginas;
        this.genero = genero;
    }

    public void descricao() {
        System.out.println(super.toString());
        System.out.println("-_-_-_-_-_-_-_-_-_-_-_-_-_-_-" + "\n" +
                "Número de páginas: " + this.numeroPaginas + "\n" +
                "Gênero do livro: " + this.genero + "\n" +
                "-_-_-_-_-_-_-_-_-_-_-_-_-_-_-" + "\n");
    }

    public void baixar() {
        System.out.println("Baixando livro....");
    }
}
