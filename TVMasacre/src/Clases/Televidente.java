package Clases;

public class Televidente extends Participante{
    private int NumerodeLLamada;
    public Televidente(String Nombre,String Apellido,int DNI,int Edad,int NumerodeLLamada){
        super(Nombre,Apellido,DNI,Edad);
        this.NumerodeLLamada=NumerodeLLamada;
    }

    public int getNumerodeLLamada() {
        return NumerodeLLamada;
    }

    public void setNumerodeLLamada(int numerodeLLamada) {
        NumerodeLLamada = numerodeLLamada;
    }
}
