package Package;

import java.util.ArrayList;

public class Bus {
    private String nroPlaca;
    private String fecha;

    private ArrayList<Asiento> Asientos;

    public Bus(String placa,String fecha){
        this.nroPlaca=placa;
        Asientos=new ArrayList<>(40);
        this.fecha=fecha;
        agregarAsiento();
    }
    public void agregarAsiento(){
        Asiento asiento[]=new Asiento[40];
        for (int i=0;i<40;i++){

            asiento[i]=new Asiento();

            Asientos.add(asiento[i]);
            asiento[i].setNroAsiento(i+1);
        }

    }


    public String getNroPlaca() {
        return nroPlaca;
    }

    public void setNroPlaca(String codigoBus) {
        this.nroPlaca = codigoBus;
    }

    public ArrayList<Asiento> getAsientos() {
        return Asientos;
    }

    public void setAsientos(ArrayList<Asiento> asientos) {
        Asientos = asientos;
    }

    @Override
    public String toString() {
        return "Bus{" +
                "Numero de Placa=" + nroPlaca +
                ", Asientos=" + Asientos +
                '}';
    }
}
