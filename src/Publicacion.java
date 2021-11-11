public abstract class Publicacion {
    private final String titulo;
    private final Autor autor;
    private final Editorial editorial;
    private final Categoria categoria;
    private int cantidadDePrestamos;

    public Publicacion(String titulo, Autor autor, Editorial editorial, Categoria categoria) {
        this.titulo = titulo;
        this.autor = autor;
        this.editorial = editorial;
        this.categoria = categoria;
    }
}
