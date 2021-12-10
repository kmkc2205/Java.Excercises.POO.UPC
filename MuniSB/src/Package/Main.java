package Package;



import javax.swing.*;

public class Main {
    public static void main(String[] args) {

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
            m.agregarVecino("CE",74380517,923710235,"SOLTERO",19,"joran_1998_22@hotmail.com");


        }
        catch (Exception e){
            System.out.println(e.getMessage());
        }
        m.agregarBus("AC1234","21/12/2021");
        m.agregarBus("AB2345","22/12/2021");
        m.agregarBus("AC1343","23/12/2021");
        m.agregarBus("AV3345","24/12/2021");
        m.agregarBus("AB2355","25/12/2021");
        m.agregarBus("CV2345","26/12/2021");

        try{
            m.reservarAsiento(74380502,"26/12/2021");
            m.reservarAsiento(74380501,"26/12/2021");
            m.reservarAsiento(74380503,"21/12/2021");
            m.reservarAsiento(74380504,"21/12/2021");
            m.reservarAsiento(74380505,"21/12/2021");
        }
        catch (Exception e){
            System.out.println(e.getMessage());
        }

        int r;
        JOptionPane.showMessageDialog(null,"Bienvenido a la Municipalidad de SAN BORJA.");
        do{
            r=Integer.parseInt(JOptionPane.showInputDialog("1.- Registrar Vecino de San Borja\n" +
                    "2.- Reservar Asiento\n" +
                    "3.- Buscar Vecino por su DNI\n" +
                    "4.- Pasajeros registrados por Fecha y Numero de Bus\n" +
                    "5.- Promedio de edades de los Adultos Mayores registrados\n" +
                    "6.- Promedio de edades de los Vecinos Club Ecologia y no lograron tener obsequio\n" +
                    "7.- Vecinos que obtuvieron un obsequio y su obsequio\n" +
                    "8.- Numero de asientos por Bus\n" +
                    "9.- Reporte de Vecinos\n" +
                    "10.- Reporte de Buses\n" +
                    "11.- Reporte de Boletos\n" +
                    "12.- Salida"));

            switch (r){

                case 1:
                    String acu;
                    String tipoVecino=JOptionPane.showInputDialog("Ingresar *AM* para registrar Vecino Adulto Mayor\n" +
                            "Ingresar *CE* para registrar Vecino Club Ecologia" );
                    int dNI=Integer.parseInt(JOptionPane.showInputDialog("Ingresa el numero de DNI"));
                    int nTelefono=Integer.parseInt(JOptionPane.showInputDialog("Ingresa el numero de Telefono"));
                    String estadoCivil=JOptionPane.showInputDialog("Ingresa *CASADO* o *SOLTERO*");
                    int edad=Integer.parseInt(JOptionPane.showInputDialog("Ingresar la edad"));
                    String correoElectronico=JOptionPane.showInputDialog("Ingresar el correo electronico");
                    try{
                        m.agregarVecino(tipoVecino,dNI,nTelefono,estadoCivil,edad,correoElectronico);
                    }
                    catch (Exception e){
                        JOptionPane.showMessageDialog(null,e.getMessage());
                        acu=e.getMessage();
                        break;
                    }
                    JOptionPane.showMessageDialog(null,"Vecino Registrado Correctamente");
                    System.out.println("***********");

                    break;
                case 2:
                    int DNI=Integer.parseInt(JOptionPane.showInputDialog("Ingresa el numero de DNI"));
                    String Fecha=JOptionPane.showInputDialog("Ingrese Fecha de reserva ejemplo:*26/12/2021*");
                    try {
                        JOptionPane.showMessageDialog(null,m.reservarAsiento(DNI,Fecha));
                    }
                    catch (Exception e){
                        JOptionPane.showMessageDialog(null,e.getMessage());
                        break;
                    }
                    JOptionPane.showMessageDialog(null, "Vecino reservo correctamente su asiento");
                    System.out.println("***********");
                    break;
                case 3:
                    int dni=Integer.parseInt(JOptionPane.showInputDialog("Ingresa el DNI a consultar"));
                    try{
                        m.busquedaVecino(dni);
                    }
                    catch (Exception e){
                        JOptionPane.showMessageDialog(null,e.getMessage());
                    }
                    System.out.println("***********");
                    break;
                case 4:
                    String nRObus=JOptionPane.showInputDialog("Ingresa el numero de Placa del Bus");
                    String fEcha=JOptionPane.showInputDialog("Ingresa la fecha de reserva de bus");
                    m.pasajerosRegistradosEnUnBus(nRObus,fEcha);
                    System.out.println("***********");
                    break;
                case 5:
                    m.promedioEdadAdultosMayores();
                    System.out.println("***********");
                    break;
                case 6:
                    m.promedioEdadClubEcologiaConObsequio();
                    System.out.println("***********");
                    break;
                case 7:
                    m.vecinosConObsequios();
                    System.out.println("***********");
                    break;
                case 8:
                    m.numeroDeAsientosDisponiblesPorBus();
                    System.out.println("***********");
                    break;
                case 9:
                    for (Vecino v:m.getVecinos()){
                        System.out.println(v);
                    }
                    System.out.println("***********");
                    break;
                case 10:
                    for (Bus b:m.getBuses()){
                        System.out.println(b);
                    }
                    System.out.println("***********");
                    break;
                case 11:
                    for (Boleto bo:m.getBoletos()){
                        System.out.println(bo);

                    }
                    System.out.println("***********");
                    break;
                default:
                    System.out.println("Gracias..");
            }

        }while (r!=12);














    }
}
