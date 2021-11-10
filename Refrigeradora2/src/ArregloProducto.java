import java.util.ArrayList;

public class ArregloProducto {
    ArrayList<Producto> pro=new ArrayList<>();

    public void Agregar(Producto po){
        pro.add(po);

    }
    public String sabersihayfrutadulce(){
        Fruta o1;
        boolean frutadulce=false;
        for (int i=0;i<pro.size();i++){
            if (pro.get(i).getClass().getSimpleName().equals("Fruta")){
             o1=(Fruta)pro.get(i);
             if(o1.isDulce()==true){
                 frutadulce=true;
             }
            }
        }
        if (frutadulce==true){
            return "Si hay fruta dulce";
        }
        else{
            return "No hay fruta dulce";
        }

    }



}
