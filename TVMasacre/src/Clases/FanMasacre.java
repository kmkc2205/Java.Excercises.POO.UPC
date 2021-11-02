package Clases;

public class FanMasacre extends Participante{
   private String EquipoAlQuePertenece;
   private int CMT;
   private int PB;
   private int PE;
   private int Puntaje;
   public FanMasacre(String Nombre,String Apellido,int DNI,int Edad,String EquipoAlQuePertenece,int CMT,int PB,int PE){
       super(Nombre,Apellido,DNI,Edad);
       this.EquipoAlQuePertenece=EquipoAlQuePertenece;
       this.CMT=CMT;
       this.PB=PB;
       this.PE=PE;
       calcularPuntaje();

   }

    public int getPuntaje() {
        return Puntaje;
    }

    public void setPuntaje(int puntaje) {
        Puntaje = puntaje;
    }

    public String getEquipoAlQuePertenece() {
        return EquipoAlQuePertenece;
    }

    public void setEquipoAlQuePertenece(String equipoAlQuePertenece) {
        EquipoAlQuePertenece = equipoAlQuePertenece;
    }

   public int calcularPuntaje(){
    Puntaje=((CMT*4)+(PB)+(PE*2));
    return Puntaje;
   }



    @Override
    public String toString() {
        return "Participante{" +
                "Nombre='" + super.getNombre() + '\'' +
                ", Apellido='" + super.getApellido() + '\'' +
                ", DNI=" + super.getDNI() +
                ", Edad=" + super.getEdad() +
                '}'+"FanMasacre{" +
                "EquipoAlQuePertenece='" + EquipoAlQuePertenece + '\'' +
                '}';
    }
}
