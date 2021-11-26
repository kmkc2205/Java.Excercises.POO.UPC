public class Vuelo {
    private int codigoUnico;
    private Avion avion;
    private String origen;
    private String destino;

    public Vuelo(int codigoUnico, Avion avion, String origen, String destino) {
        this.codigoUnico = codigoUnico;
        this.avion = avion;
        this.origen = origen;
        this.destino = destino;
    }

    public int getCodigoUnico() {
        return codigoUnico;
    }

    public void setCodigoUnico(int codigoUnico) {
        this.codigoUnico = codigoUnico;
    }

    public Avion getAvion() {
        return avion;
    }

    public void setAvion(Avion avion) {
        this.avion = avion;
    }

    public String getOrigen() {
        return origen;
    }

    public void setOrigen(String origen) {
        this.origen = origen;
    }

    public String getDestino() {
        return destino;
    }

    public void setDestino(String destino) {
        this.destino = destino;
    }

    @Override
    public String toString() {
        return "Vuelo{" +
                "codigoUnico=" + codigoUnico +
                ", avion=" + avion +
                ", origen='" + origen + '\'' +
                ", destino='" + destino + '\'' +
                '}';
    }
}
