import java.util.ArrayList;

public class ArregloAd {
    ArrayList<Producto> pro=new ArrayList<>();
    private double totalRef=0;
    private double valorTotal=0;

    public void agregar(Producto o){
        pro.add(o);
    }
    public void calcularValorReferencial(){

        for (int i=0;i<pro.size();i++){
            totalRef=totalRef+pro.get(i).getValorreferencial();

        }
    }
    public void calcularValorTotal(){

        for (int i=0;i<pro.size();i++){
            valorTotal=valorTotal+pro.get(i).getPrecio();

        }
    }


    public double getTotalRef() {
        return totalRef;
    }

    public void setTotalRef(double totalRef) {
        this.totalRef = totalRef;
    }

    public double getValorTotal() {
        return valorTotal;
    }

    public void setValorTotal(double valorTotal) {
        this.valorTotal = valorTotal;
    }
}
