package Package;

public class Boleto {
    private int codigoBoleto;
    private static int indicecodigoBoleto;
    private Bus bus;
    private Vecino vecino;
    private Asiento asiento;

    public Boleto( Bus bus,Asiento asiento, Vecino vecino) {
        ++indicecodigoBoleto;
        codigoBoleto=indicecodigoBoleto;
        this.asiento=asiento;
        this.bus = bus;
        this.vecino = vecino;
    }

    public int getCodigoBoleto() {
        return codigoBoleto;
    }

    public void setCodigoBoleto(int codigoBoleto) {
        this.codigoBoleto = codigoBoleto;
    }

    public Bus getBus() {
        return bus;
    }

    public void setBus(Bus bus) {
        this.bus = bus;
    }

    public Vecino getVecino() {
        return vecino;
    }

    public void setVecino(Vecino vecino) {
        this.vecino = vecino;
    }

    @Override
    public String toString() {
        return "Boleto{" +
                "codigoBoleto=" + codigoBoleto +
                ", bus= " +"Numero de placa: "+ bus.getNroPlaca()+" Fecha de reserva: "+bus.getFecha() +
                ", vecino=" + vecino +
                ", asiento=" + asiento.getNroAsiento()+" " +asiento.getCodigoAsiento() +
                '}';
    }
}
