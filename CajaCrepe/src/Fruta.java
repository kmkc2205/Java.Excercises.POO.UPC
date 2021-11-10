public class Fruta extends Producto{
    private double cantidad;
    private boolean dulce;

    public Fruta(int codigo, String nombre, double precio, double cantidad, boolean dulce) {
        super(codigo, nombre, precio);
        this.cantidad = cantidad;
        this.dulce = dulce;
        calcularvalorRe();
    }

    @Override
    public void calcularvalorRe() {
        super.setValorreferencial(getPrecio()*cantidad);

    }

    @Override
    public String toString() {
        return super.toString()+" "+"Fruta{" +
                "cantidad=" + cantidad +
                ", dulce=" + dulce +
                '}';
    }
}
