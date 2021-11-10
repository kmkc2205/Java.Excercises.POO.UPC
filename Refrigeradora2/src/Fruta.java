public class Fruta extends Producto {
    private int cantidad;
    private boolean dulce;


    public Fruta(int codigo, String nombre, double precio, int cantidad, boolean dulce) {
        super(codigo, nombre, precio);
        this.cantidad = cantidad;
        this.dulce = dulce;
        calcularTotalreferencial();
    }

    @Override
    public void calcularTotalreferencial() {
        super.setTotalReferencial(super.getPrecio()*cantidad);
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public boolean isDulce() {
        return dulce;
    }

    public void setDulce(boolean dulce) {
        this.dulce = dulce;
    }

    @Override
    public String toString() {
        return super.toString()+" "+"Fruta{" +
                "cantidad=" + cantidad +
                ", dulce=" + dulce +
                '}';
    }
}
