package Package;

public class Asiento {
    private String codigoAsiento;
    private boolean AsientoOcupado;
    private Vecino veci;
    private int nroAsiento;

    private static int indiceCodigo;


    public Asiento() {
        indiceCodigo++;


        codigoAsiento="A0000"+indiceCodigo;

        AsientoOcupado=false;
    }

    public String getCodigoAsiento() {
        return codigoAsiento;
    }

    public void setCodigoAsiento(String codigoAsiento) {
        this.codigoAsiento = codigoAsiento;
    }

    public int getNroAsiento() {
        return nroAsiento;
    }

    public void setNroAsiento(int nroAsiento) {
        this.nroAsiento = nroAsiento;
    }

    public boolean isAsientoOcupado() {
        return AsientoOcupado;
    }

    public void setAsientoOcupado(boolean asientoOcupado) {
        AsientoOcupado = asientoOcupado;
    }

    public Vecino getVeci() {
        return veci;
    }

    public void setVeci(Vecino veci) {
        this.veci = veci;
    }

    @Override
    public String toString() {
        return "Asiento{" +
                "codigoAsiento='" + codigoAsiento + '\'' +
                ", lleno=" + AsientoOcupado +
                ", veci=" + veci +
                ", nroAsiento=" + nroAsiento +
                '}';
    }
}
