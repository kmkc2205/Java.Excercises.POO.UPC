public class Lacteos extends Producto{
    private double cantidad;
    private String marca;

    public Lacteos(int codigo, String nombre, double precio, double cantidad, String marca) {
        super(codigo, nombre, precio);
        this.cantidad = cantidad;
        this.marca = marca;
        calcularvalorRe();
    }

    @Override
    public void calcularvalorRe() {
        if (cantidad>100){
            super.setValorreferencial(super.getPrecio());
        }
    }

    @Override
    public String toString() {
        return super.toString()+" " +"Lacteos{" +
                "cantidad=" + cantidad +
                ", marca='" + marca + '\'' +
                '}';
    }
}
