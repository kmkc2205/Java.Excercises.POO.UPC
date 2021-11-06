public class Profesionales extends Concursante{
    private String Intitucion;
    private boolean Ganado;
    public Profesionales(int DNI,String nombre,String nombrePlato,int puntajeSabor,int puntajePresentacion, int puntajeOriginalidad,String Intitucion,boolean Ganado){
        super(DNI, nombre, nombrePlato, puntajeSabor, puntajePresentacion, puntajeOriginalidad);
        this.Intitucion=Intitucion;
        this.Ganado=Ganado;
        puntosextraporGanarAntes(Ganado);
    }
    public void puntosextraporGanarAntes(boolean ganado){

        if (ganado==true){
            super.setPuntajeF(super.getPuntajeF()+5);
        }
    }

    public String getIntitucion() {
        return Intitucion;
    }

    public void setIntitucion(String intitucion) {
        Intitucion = intitucion;
    }

    @Override
    public String toString() {
        return super.toString()+" Profesionales{" +
                "Intitucion='" + Intitucion + '\'' +
                ", Ganado=" + Ganado +
                '}';
    }
}
