package Package;

import java.util.ArrayList;
import java.util.Vector;

public class Municipalidad {
    private ArrayList<Vecino> Vecinos;
    private ArrayList<Bus> Buses;
    private static Municipalidad vecinos=new Municipalidad();
    private  Municipalidad(){

        Vecinos=new ArrayList<>();
        Buses=new ArrayList<>(10);
    }
    public static Municipalidad obtenerInstacia(){

        return vecinos;
    }

    public boolean ArregloVecinoVacio(){
        boolean Vacio=true;
        if (Vecinos.size()>=1){
            Vacio=false;
        }
        return Vacio;
    }
    public void agregarVecino(String Tipo,int DNI, int telefono, String estadoCivil, int edad, String correoElectronico) throws Exception{
        Vecino vecino=Factoria.dameInstancia(Tipo,DNI,telefono,estadoCivil,edad,correoElectronico);

        if (edad>=18){
            if (ArregloVecinoVacio()==false){

                for (int i=0;i<Vecinos.size();i++){
                    if (Vecinos.get(i).getDNI()==DNI){
                        throw new Exception("Vecino se encuentra actualmente registrado.");
                    }
                }
                Vecinos.add(vecino);
            }
            if (ArregloVecinoVacio()==true){
                Vecinos.add(vecino);
            }

        }
        if (edad<18){

            throw new Exception("No se puede registrar Menor de edad");
        }


    }
    public void agregarBus(String placa,String Fecha){
        Bus bus1=new Bus(placa,Fecha);
        Buses.add(bus1);
    }

    public void busquedaVecino(int DNI) throws Exception{
        Vecino vecinoBuscado=null;
        for (int i=0;i<Vecinos.size();i++){
            if (Vecinos.get(i).getDNI()==DNI){
                vecinoBuscado=Vecinos.get(i);
                System.out.println(Vecinos.get(i));
            }
        }
        if (vecinoBuscado==null){
            throw new Exception("No se encontro el DNI");
        }

    }

    public void promedioEdadAdultosMayores(){
        double sumaEdades=0;
        int cont=0;
        for (Vecino v:Vecinos){
            if (v.getClass().getSimpleName().equals("AdultoMayor")){
                sumaEdades=sumaEdades+v.getEdad();
                cont++;
            }
        }

        System.out.println("El promedio de edades de adultos mayores es: "+sumaEdades/cont);
    }

    public void vecinosConObsequios(){
        for (Vecino v:Vecinos){
            if (v.promocionespecial()==true){
                System.out.println(v);
            }
        }
    }
    public void promedioEdadClubEcologiaConObsequio(){
        double sumaEdades=0;
        int cont=0;
        for (Vecino v:Vecinos){
            if ((v.getClass().getSimpleName().equals("ClubEcoloGia")&&(v.promocionespecial()==false))){
                sumaEdades=sumaEdades+v.getEdad();
                cont++;
            }
        }

        System.out.println("El promedio de edades de Vecinos Club Ecologia sin obsequio: "+sumaEdades/cont);
    }

    public void numeroDeAsientosDisponiblesPorBus(){
        int canAsientosDisponibles=0;
        int temCantidadAsientosDisponibles=0;
        for (int j=0;j<Buses.size();j++) {



                for (int k=0;k<Buses.get(j).getAsientos().size();k++){
                    if (Buses.get(j).getAsientos().get(k).isAsientoOcupado()==false){
                        canAsientosDisponibles++;
                    }
                    if (k==39){
                        temCantidadAsientosDisponibles=canAsientosDisponibles;
                        canAsientosDisponibles=0;
                    }

                }


                System.out.println("La cantidad de asientos dispobiles de el bus con placa "+Buses.get(j).getNroPlaca()+" es: "+temCantidadAsientosDisponibles);
                temCantidadAsientosDisponibles=0;


        }

    }



    public ArrayList<Vecino> getVecinos() {
        return Vecinos;
    }

    public ArrayList<Bus> getBuses() {
        return Buses;
    }

    public void setBuses(ArrayList<Bus> buses) {
        Buses = buses;
    }

}
