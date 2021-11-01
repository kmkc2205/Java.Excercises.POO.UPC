package Clases;

public class FanMasacre extends Participante{
   private String EquipoAlQuePertenece;
   public FanMasacre(String Nombre,String Apellido,int DNI,int Edad,String EquipoAlQuePertenece){
       super(Nombre,Apellido,DNI,Edad);
       this.EquipoAlQuePertenece=EquipoAlQuePertenece;
   }

    public String getEquipoAlQuePertenece() {
        return EquipoAlQuePertenece;
    }

    public void setEquipoAlQuePertenece(String equipoAlQuePertenece) {
        EquipoAlQuePertenece = equipoAlQuePertenece;
    }

    @Override
    public String toString() {
        return "FanMasacre{" +
                "EquipoAlQuePertenece='" + EquipoAlQuePertenece + '\'' +
                '}';
    }
    public String baboso(){
       return "Baboso";
    }
}
