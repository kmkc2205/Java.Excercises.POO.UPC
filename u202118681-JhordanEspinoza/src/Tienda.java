import java.util.ArrayList;

public class Tienda {
    private ArrayList<Pelicula> peliculas;
    private static Tienda tienda=new Tienda();
    public Tienda(){
        peliculas=new ArrayList<>();
    }
    public static Tienda obtenerInstancia(){
        return tienda;
    }
    public void agregarPelicula(Pelicula p) throws Exception{
        for (int i=0;i<peliculas.size();i++){
            if (peliculas.get(i).getCodigo()== p.getCodigo()){
                throw new Exception("Código Repetido");
            }

        }
        peliculas.add(p);

    }

    public ArrayList<Pelicula> getPeliculas() {
        return peliculas;
    }

    public void setPeliculas(ArrayList<Pelicula> peliculas) {
        this.peliculas = peliculas;
    }
}
