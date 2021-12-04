import java.util.ArrayList;

public class Pelicula {
    private int codigo;
    private String nombre;
    private Categoria categoria;
    private ArrayList<Actor> Actores;

    public Pelicula(int codigo, String nombre, Categoria categoria) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.categoria = categoria;
        Actores=new ArrayList<>();
    }
    public void agregarActores(){

    }
}
