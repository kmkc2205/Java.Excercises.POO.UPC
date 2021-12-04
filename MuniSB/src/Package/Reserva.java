package Package;

import java.util.ArrayList;

public class Reserva {
    private String fechaReserva;
    private Municipalidad Vecinos;



    public Reserva(String fechaReserva,Municipalidad muni) {
        this.fechaReserva = fechaReserva;

        this.Vecinos=muni;
    }
    public void reservarAsiento(int DNI){
        int RamdomA=(int)(Math.random()*40)+1;
        int RamdomB=(int)(Math.random()*(Vecinos.getBuses().size()));
        Vecino ProximoARegistrarse;
        for (int i=0;i<Vecinos.getVecinos().size();i++){
            if (Vecinos.getVecinos().get(i).getDNI()==DNI){
                ProximoARegistrarse=Vecinos.getVecinos().get(i);

                for (int j=0;j<Vecinos.getBuses().size();j++) {

                    if (RamdomB==j){

                        for (int k=0;k<Vecinos.getBuses().get(j).getAsientos().size();k++){
                            if (RamdomA==Vecinos.getBuses().get(j).getAsientos().get(k).getNroAsiento()){

                                Vecinos.getBuses().get(j).getAsientos().get(k).setAsientoOcupado(true);
                                Vecinos.getBuses().get(j).getAsientos().get(k).setVeci(ProximoARegistrarse);

                            }
                        }
                    }


                }
            }


        }
    }

}
