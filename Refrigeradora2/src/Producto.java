public abstract class Producto {
    private int codigo;
    private String nombre;
    private double precio;
    private double TotalReferencial;

    public Producto(int codigo, String nombre, double precio) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.precio = precio;
    }
    public abstract void calcularTotalreferencial();
    public int getCodigo() {
        return codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public double getPrecio() {
        return precio;
    }

    public double getTotalReferencial() {
        return TotalReferencial;
    }

    public void setTotalReferencial(double totalReferencial) {
        TotalReferencial = totalReferencial;
    }

    @Override
    public String toString() {
        return "Producto{" +
                "codigo=" + codigo +
                ", nombre='" + nombre + '\'' +
                ", precio=" + precio +
                ", TotalReferencial=" + TotalReferencial +
                '}';
    }
}
