public class Liquido extends Producto{
    private double contenido;
    private String marca;

    public Liquido(int codigo, String nombre, double precio,double contenido, String marca) {
        super(codigo, nombre, precio);
        this.contenido = contenido;
        this.marca = marca;
        calcularValorReferencial();
    }

    @Override
    public void calcularValorReferencial() {
        if (contenido>50){
            super.setValorRefencial(super.getPrecio());
        }
    }

    public double getContenido() {
        return contenido;
    }

    public String getMarca() {
        return marca;
    }

    public void setContenido(double contenido) {
        this.contenido = contenido;
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
