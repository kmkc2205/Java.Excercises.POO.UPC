public class Liquido extends Producto{
    private double contenido;
    private String marca;

    public Liquido(int codigo, String nombre, double precio, double contenido, String marca) {
        super(codigo, nombre, precio);
        this.contenido = contenido;
        this.marca = marca;
        calcularTotalreferencial();
    }

    @Override
    public void calcularTotalreferencial() {
        if(contenido>50){
            super.setTotalReferencial(super.getPrecio());
        }
    }

    public double getContenido() {
        return contenido;
    }

    public void setContenido(double contenido) {
        this.contenido = contenido;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    @Override
    public String toString() {
        return super.toString()+" "+"Liquido{" +
                "contenido=" + contenido +
                ", marca='" + marca + '\'' +
                '}';
    }
}
