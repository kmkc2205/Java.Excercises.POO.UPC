package Clases;

public class Main {
    public static void main(String[] args) {
        Participante o1=new Participante("Angel","Nene",73259343,45);
        Participante o2=new Televidente("Jhordan","Espinoza", 2345542,23,923710235);
        Participante o3=new FanMasacre("Luis","Mercedez",74380529,25,"Rojo");
        FanMasacre f1=(FanMasacre)o3;

        System.out.println( f1.getEquipoAlQuePertenece());


    }
}
