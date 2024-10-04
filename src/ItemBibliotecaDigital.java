public abstract class ItemBibliotecaDigital {
    private String tituloItem;
    private String autorItem;

    public ItemBibliotecaDigital(String titulo, String autor) {
        this.tituloItem = titulo;
        this.autorItem = autor;
    }

    public abstract void descricao();

    @Override
    public String toString() {
        return "-_-_-_-_-_-_-_-_-_-_-_-_-_-_-" + "\n" +
                "Título: " + this.tituloItem + "\n" +
                "Autor: " + this.autorItem + "\n" +
                "-_-_-_-_-_-_-_-_-_-_-_-_-_-_-" + "\n";
    }
}
