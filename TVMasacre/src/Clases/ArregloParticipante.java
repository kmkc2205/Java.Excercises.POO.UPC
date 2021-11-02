package Clases;

public class ArregloParticipante {
    Participante Participantes[]=new Participante[4];
    int indice=0;
    public ArregloParticipante(){

    }
    public void MostrarParticipante(){
        for(int i=0;i<Participantes.length;i++){
            System.out.println(Participantes[i]);
        }
    }
    public void ingresarParticipante(Participante pa){
        Participantes[indice]=pa;
        indice++;
    }
    public void puntajeParticipante(){
        for(int i=0;i<Participantes.length;i++){
            if (Participantes[0]==null){
                System.out.println("Arreglo Vacio");
                break;
            }
            if (Participantes[i]==null){

                break;
            }
            System.out.println("Nombre: "+Participantes[i].getNombre()+" Apellido: "+Participantes[i].getApellido()+" Puntaje: "+Participantes[i].getPuntaje());
        }
    }
    public String gAnador(){
        int Mayor=Participantes[0].getPuntaje();
        int indice=0;
        for (int i=0;i<Participantes.length;i++){
            if (Participantes[i].getPuntaje()>Mayor) {
            Mayor=Participantes[i].getPuntaje();
            indice=i;
            }
        }
        return " El Ganador es: "+Participantes[indice].getNombre()+" Con Apellido: "+Participantes[indice].getApellido()+" Con Puntaje: "+Participantes[indice].getPuntaje();
    }
    public String busquedaporDNI(int DNI){
        int indice=0;
        for (int i=0;i<Participantes.length;i++){
            if(DNI==Participantes[i].getDNI()){
               indice=i;
            }
        }
        return "El Nombre del Participante es: "+Participantes[indice].toString();
    }
    public void ingresarParticipanteFanMasacre(String Nombre,String Apellido,int DNI,int Edad,String EquipoAlQuePertenece,int CMT,int PB,int PE){
        Participantes[indice]= new FanMasacre(Nombre,Apellido,DNI,Edad,EquipoAlQuePertenece,CMT,PB,PE);
        indice++;
    }
    public void ingresarParticipanteTelevidente(String Nombre,String Apellido,int DNI,int Edad,int NumerodeLLamada,int CMT,int CLL){
        Participantes[indice]=new Televidente(Nombre,Apellido,DNI,Edad,NumerodeLLamada,CMT,CLL);
        indice++;
    }
}
