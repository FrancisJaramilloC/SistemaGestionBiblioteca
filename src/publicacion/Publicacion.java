package publicacion;

public abstract class Publicacion {
    // Atributos
    protected String titulo;
    protected int anio;
    protected String editorial;
    // Relaciones
    protected Libro libro;

    // Constructor
    public Publicacion(String titulo, int anio, String editorial, Autor autor) {
        this.titulo = titulo;
        this.anio = anio;
        this.editorial = editorial;
    }
}
