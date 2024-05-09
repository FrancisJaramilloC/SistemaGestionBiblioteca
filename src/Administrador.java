import composicion.Biblioteca;

public class Administrador extends Persona implements Permisos {
    //Atributos
    private String cargo;
    //Relaciones
    private Biblioteca biblioteca;

    //Constructor
    public Administrador(String nombre, String apellido, String dni, String direccion, String telefono, String cargo, Biblioteca biblioteca) {
        super();
        this.cargo = cargo;
        this.biblioteca = biblioteca;
    }

    //Getters y Setters
    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    //Metodos
    public void agregarUsuario() {
        this.agregarUsuario();
    }

    public void quitarUsuario() {
        this.quitarUsuario();
    }

    public void darLibro() {
        this.darLibro();
    }

    public void regresarLibro() {
        this.regresarLibro();
    }

    public void buscarLibro() {
        this.buscarLibro();
    }
}


