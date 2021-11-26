package Package;

import java.util.ArrayList;

public class Bus {
    BasedeDatosdeVecinos Pru;
    ArrayList<Vecino> ReservaVecino=new ArrayList<>(40);

    public void ReservarBasedeDatos(int DNI,int fecha, BasedeDatosdeVecinos pru){
        Pru=pru;
        for (int i=0;i<pru.Vecinos.size();i++){
            if (pru.Vecinos.get(i).getDNI()==DNI){
                System.out.println("Son iguales");
            }
        }

    }


}
