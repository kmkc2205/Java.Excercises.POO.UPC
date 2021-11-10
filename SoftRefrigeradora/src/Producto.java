public abstract class Producto {
    private int codigo;
    private String nombre;
    private double precio;
    private double valorRefencial;

    public Producto(int codigo, String nombre, double precio) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.precio = precio;
    }
    public abstract void calcularValorReferencial();



    public int getCodigo() {
        return codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public double getPrecio() {
        return precio;
    }

    @Override
    public String toString() {
        return "Producto{" +
                "codigo=" + codigo +
                ", nombre='" + nombre + '\'' +
                ", precio=" + precio +
                ", valorRefencial=" + valorRefencial +
                '}';
    }

    public double getValorRefencial() {
        return valorRefencial;
    }

    public void setValorRefencial(double valorRefencial) {
        this.valorRefencial = valorRefencial;
    }
}
