package composicion;

public class Biblioteca {
    //Atributos
    private String nombre;
    private String direccion;
    //Relaciones
    private Inventario inventario;

    //Metodos
    public void agregarLibro() {
    }
    public void quitarLibro() {
    }

    //Constructor
    public Biblioteca(String nombre, String direccion) {
        this.nombre = nombre;
        this.direccion = direccion;
    }
}
