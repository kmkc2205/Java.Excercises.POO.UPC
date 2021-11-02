package Clases;

public class Televidente extends Participante{
    private int NumerodeLLamada;
    private int CMT;
    private int CLL;
    private int Puntaje;
    public Televidente(String Nombre,String Apellido,int DNI,int Edad,int NumerodeLLamada,int CMT,int CLL){
        super(Nombre,Apellido,DNI,Edad);
        this.NumerodeLLamada=NumerodeLLamada;
        this.CMT=CMT;
        this.CLL=CLL;
        calcularPuntaje();
    }

    public int getPuntaje() {
        return Puntaje;
    }

    public void setPuntaje(int puntaje) {
        Puntaje = puntaje;
    }

    public int getNumerodeLLamada() {
        return NumerodeLLamada;
    }

    public void setNumerodeLLamada(int numerodeLLamada) {
        NumerodeLLamada = numerodeLLamada;
    }
    public int calcularPuntaje(){
        Puntaje=((CMT*4)+(CLL*3));
        return Puntaje;
    }



    @Override
    public String toString() {
        return "Participante{" +
                "Nombre='" + super.getNombre() + '\'' +
                ", Apellido='" + super.getApellido() + '\'' +
                ", DNI=" + super.getDNI() +
                ", Edad=" + super.getEdad() +
                '}'+"Televidente{" +
                "NumerodeLLamada=" + NumerodeLLamada +
                '}';
    }
}
