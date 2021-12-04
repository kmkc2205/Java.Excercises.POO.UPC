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
    public void agregarActor(Actor actor){
        Actores.add(actor);
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Categoria getCategoria() {
        return categoria;
    }

    public void setCategoria(Categoria categoria) {
        this.categoria = categoria;
    }

    @Override
    public String toString() {
        return "Pelicula{" +
                "codigo=" + codigo +
                ", nombre='" + nombre + '\'' +
                ", categoria=" + categoria +
                ", Actores=" + Actores +
                '}';
    }
}
