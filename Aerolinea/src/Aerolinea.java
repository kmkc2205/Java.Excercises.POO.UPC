import java.util.ArrayList;

public class Aerolinea {
    private ArrayList<Vuelo> Vuelos;
    public Aerolinea(){
        Vuelos=new ArrayList<>();
    }
    public void registrarVuelos(Vuelo vuelo){
        Vuelos.add(vuelo);
    }
    public void retornarVuelos(String modelo) throws Exception{
        Vuelo vu=null;
        for (Vuelo vuelo : Vuelos) {

               if (vuelo.getAvion().getModelo().equals(modelo)) {

                   vu=vuelo;
                   System.out.println("El modelo de avion tiene el siguiente vuelo: "+vuelo);
               }

        }
        if (vu==null){
            throw new Exception("Modelo de avión inválido");
        }

    }

    public ArrayList<Vuelo> getVuelos() {
        return Vuelos;
    }

    public void setVuelos(ArrayList<Vuelo> vuelos) {
        Vuelos = vuelos;
    }
}
