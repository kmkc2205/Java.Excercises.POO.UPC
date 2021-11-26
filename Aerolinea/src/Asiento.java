public class Asiento {
    private int numeroAsiento;
    private char letra;
    private double precio;

    public Asiento(int numeroAsiento, char letra) {
        this.numeroAsiento = numeroAsiento;
        this.letra = letra;
        this.precio = precio;
        calcularPrecio();
    }
    public int calcularPrecioBase(){
        int precioBase=0;
        if (letra=='A'||letra=='C'||letra=='D'||letra=='F'){
            precioBase=80;
        }
        if(letra=='B'||letra=='E'){
            precioBase=60;
        }
        return precioBase;
    }
    public double calcularfactorAdicional(){
        double factoradicional=0;
        if (numeroAsiento<7){
            factoradicional=1.5;
        }
        if (numeroAsiento>=7&&numeroAsiento<=16){
            factoradicional=1.3;
        }
        if (numeroAsiento>16){
            factoradicional=1.15;
        }

        return factoradicional;
    }
    public void calcularPrecio(){
        this.precio=calcularPrecioBase()*calcularfactorAdicional();
    }

    public int getNumeroAsiento() {
        return numeroAsiento;
    }

    public void setNumeroAsiento(int numeroAsiento) {
        this.numeroAsiento = numeroAsiento;
    }

    public char getLetra() {
        return letra;
    }

    public void setLetra(char letra) {
        this.letra = letra;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    @Override
    public String toString() {
        return "Asiento{" +
                "numeroAsiento=" + numeroAsiento +
                ", letra=" + letra +
                ", precio=" + precio +
                '}';
    }
}
