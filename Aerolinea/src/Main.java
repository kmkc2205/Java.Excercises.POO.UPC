import javax.swing.*;

public class Main {
    public static void main(String[] args) throws Exception {
        Asiento a1=new Asiento(14,'A');
        Asiento a2=new Asiento(12,'C');
        Asiento a3=new Asiento(16,'D');
        Asiento a4=new Asiento(17,'F');
        Asiento a5=new Asiento(11,'B');
        Asiento a6=new Asiento(7,'E');
        Avion av1=new Avion("ABC");
        Avion av2=new Avion("AZF");
        Avion av3=new Avion("ACV");
        av1.agregarAsiento(a1);
        av1.agregarAsiento(a2);
        av2.agregarAsiento(a3);
        av2.agregarAsiento(a4);
        av3.agregarAsiento(a5);
        av3.agregarAsiento(a6);

        Vuelo v1=new Vuelo(1234,av1,"Canada","Peru");
        Vuelo v2=new Vuelo(12345,av2,"Canada","Brazil");
        Vuelo v3=new Vuelo(123456,av3,"Canada","Argentina");
        Aerolinea aero=new Aerolinea();
        aero.registrarVuelos(v1);
        aero.registrarVuelos(v2);
        aero.registrarVuelos(v3);

        for (Vuelo v:aero.getVuelos()
             ) {
            System.out.println(v.toString());
        }
        System.out.println("");


        try{
            aero.retornarVuelos("ABC");
        }
        catch (Exception e){
            System.out.println(e.getMessage());
        }



    }

}
