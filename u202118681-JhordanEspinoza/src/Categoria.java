public class Categoria {
    private int codigo;
    private String nombre;

    public Categoria(int codigo, String nombre) {
        this.codigo = codigo;
        this.nombre = nombre;
    }
    public boolean determinarsiesaptoparaMenores(){
        boolean aptoparamenores=true;
        if (this.nombre.equals("Terror")){
            aptoparamenores=false;
        }
        if (this.nombre.equals("Suspenso")){
            aptoparamenores=false;
        }
        if (this.nombre.equals("Accion")){
            aptoparamenores=false;
        }
        return aptoparamenores;
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

    @Override
    public String toString() {
        return "Categoria{" +
                "codigo=" + codigo +
                ", nombre='" + nombre + '\'' +
                '}';
    }
}
