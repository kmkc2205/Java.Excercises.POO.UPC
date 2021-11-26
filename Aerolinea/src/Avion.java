import java.util.ArrayList;

public class Avion {
    private String modelo;
    private ArrayList<Asiento> Asientos;

    public Avion(String modelo) {//Composicion
        this.modelo = modelo;
        this.Asientos=new ArrayList<>();
    }
    public void agregarAsiento(Asiento Asiento){
        Asientos.add(Asiento);
    }

    @Override
    public String toString() {
        return "Avion{" +
                "modelo='" + modelo + '\'' +
                ", Asientos=" + Asientos +
                '}';
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public ArrayList<Asiento> getAsientos() {
        return Asientos;
    }

    public void setAsientos(ArrayList<Asiento> asientos) {
        Asientos = asientos;
    }
}
