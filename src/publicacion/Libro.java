package publicacion;


import java.util.ArrayList;

public class Libro extends Publicacion{
    //Atributos
    private String codigo;
    private int numeroPaginas;

    //Relaciones
    private ArrayList<Copia> copia;
    public Categoria categoria;

    //Constructor
    public Libro(String titulo, int anio, String editorial, Autor autor) {
        super(titulo, anio, editorial, autor);

    }
}
