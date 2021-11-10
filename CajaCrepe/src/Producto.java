public abstract class Producto {
    private int codigo;
    private String nombre;
    private double precio;
    private double valorreferencial;

    public Producto(int codigo, String nombre, double precio) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.precio = precio;
    }
    public abstract void calcularvalorRe();

    public int getCodigo() {
        return codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public double getPrecio() {
        return precio;
    }

    public double getValorreferencial() {
        return valorreferencial;
    }

    public void setValorreferencial(double valorreferencial) {
        this.valorreferencial = valorreferencial;
    }

    @Override
    public String toString() {
        return super.toString()+" "+"Producto{" +
                "codigo=" + codigo +
                ", nombre='" + nombre + '\'' +
                ", precio=" + precio +
                ", valorreferencial=" + valorreferencial +
                '}';
    }
}
