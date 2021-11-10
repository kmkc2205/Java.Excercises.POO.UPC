import java.util.ArrayList;

public class AdminRefrigeradora {
    ArrayList <Producto> Productos=new ArrayList<>();
    private double TotalvalorReferencial=0;

    public void AgregarProducto(Producto Pro){
        Productos.add(Pro);
    }
    public void calcularValorReferencial(){
        //Liquido o1;
        //Fruta o2;

        for (int i=0;i<Productos.size();i++){
            TotalvalorReferencial=TotalvalorReferencial+Productos.get(i).getValorRefencial();

           /* if (Productos.get(i).getClass().getSimpleName().equals("Liquido")){
                o1=(Liquido)Productos.get(i);
               if (o1.getContenido()>50) {
                   valorReferencial = valorReferencial + (Productos.get(i).getPrecio());
               }
            }
            if (Productos.get(i).getClass().getSimpleName().equals("Fruta")){
                o2=(Fruta)Productos.get(i);
                valorReferencial=valorReferencial+(Productos.get(i).getPrecio()*o2.getCantidad());
            }

            */
        }
    }
    public String frutaDulce(){
       boolean frutadulce=false;
        Fruta o1;
        for (int i=0;i<Productos.size();i++){

            if (Productos.get(i).getClass().getSimpleName().equals("Fruta")){
                o1=(Fruta)Productos.get(i);
                if(o1.isDulce()==true){
                    frutadulce=true;
                }

            }
        }
        if (frutadulce==true){
            return "Si tiene fruta dulce";
        }
        else {
            return "No tiene fruta dulce";
        }
    }

    public double getTotalvalorReferencial() {
        return TotalvalorReferencial;
    }

    public void setTotalvalorReferencial(double totalvalorReferencial) {
        TotalvalorReferencial = totalvalorReferencial;
    }
}
