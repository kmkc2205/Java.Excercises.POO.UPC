import java.util.ArrayList;

public class Historial {
    private int codigo;
    private ArrayList<Visita> visitas;

    public Historial(int codigo) {
        this.codigo = codigo;
        this.visitas=new ArrayList<>();
    }
    public void agregarVisita(Visita visita){//composicion
        visitas.add(visita);
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public ArrayList<Visita> getVisitas() {
        return visitas;
    }

    public void setVisitas(ArrayList<Visita> visitas) {
        this.visitas = visitas;
    }

    @Override
    public String toString() {
        return "Historial{" +
                "codigo=" + codigo +
                ", visitas=" + visitas +
                '}';
    }
}
