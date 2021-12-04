package Package;

public class Main {
    public static void main(String[] args) {

         //AM Y CE
        Municipalidad m=Municipalidad.obtenerInstacia();
        try{
            m.agregarVecino("AM",74380501,923710235,"CASADO",74,"joran_1998_22@hotmail.com");
            m.agregarVecino("AM",74380502,923710235,"SOLTERO",56,"joran_1998_22@hotmail.com");
            m.agregarVecino("AM",74380503,923710235,"SOLTERO",46,"joran_1998_22@hotmail.com");
            m.agregarVecino("AM",74380504,923710235,"CASADO",65,"joran_1998_22@hotmail.com");
            m.agregarVecino("AM",74380505,923710235,"CASADO",77,"joran_1998_22@hotmail.com");
            m.agregarVecino("AM",74380506,923710235,"CASADO",65,"joran_1998_22@hotmail.com");
            m.agregarVecino("AM",74380507,923710235,"CASADO",56,"joran_1998_22@hotmail.com");
            m.agregarVecino("AM",74380508,923710235,"CASADO",87,"joran_1998_22@hotmail.com");
            m.agregarVecino("AM",74380509,923710235,"CASADO",81,"joran_1998_22@hotmail.com");
            m.agregarVecino("CE",74380510,923710235,"CASADO",24,"joran_1998_22@hotmail.com");
            m.agregarVecino("CE",74380511,923710235,"CASADO",24,"joran_1998_22@hotmail.com");
            m.agregarVecino("CE",74380512,923710235,"CASADO",24,"joran_1998_22@hotmail.com");
            m.agregarVecino("CE",74380513,923710235,"SOLTERO",24,"joran_1998_22@hotmail.com");
            m.agregarVecino("CE",74380514,923710235,"SOLTERO",24,"joran_1998_22@hotmail.com");
            m.agregarVecino("CE",74380515,923710235,"CASADO",24,"joran_1998_22@hotmail.com");
            m.agregarVecino("CE",74380516,923710235,"SOLTERO",24,"joran_1998_22@hotmail.com");
            m.agregarVecino("CE",74380517,923710235,"SOLTERO",17,"joran_1998_22@hotmail.com");


        }
        catch (Exception e){
            System.out.println(e.getMessage());
        }



        for (Vecino v:m.getVecinos()){
            System.out.println(v);
        }

            m.agregarBus("AC1234","21/12/2021");
            m.agregarBus("AB2345","22/12/2021");
            m.agregarBus("AC1343","23/12/2021");
            m.agregarBus("AV3345","24/12/2021");
            m.agregarBus("AB2355","25/12/2021");
            m.agregarBus("CV2345","26/12/2021");

            m.promedioEdadAdultosMayores();
        System.out.println("ssss");
            m.promedioEdadClubEcologiaConObsequio();
        System.out.println("ssss");
            m.vecinosConObsequios();
        System.out.println("ssss");
          //  m.numeroDeAsientosDisponiblesPorBus();

        m.numeroDeAsientosDisponiblesPorBus();

        Reserva r1=new Reserva("21/11/2021",m);
        r1.reservarAsiento(74380501);
        m.numeroDeAsientosDisponiblesPorBus();
        System.out.println("ss");
        try{
            m.busquedaVecino(74380501);
        }
        catch (Exception e){
            System.out.println(e.getMessage());
        }





        for (Bus b: m.getBuses()){
            System.out.println(b);
        }



    }
}
