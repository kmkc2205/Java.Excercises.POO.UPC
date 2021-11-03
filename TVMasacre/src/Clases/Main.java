package Clases;

import javax.swing.*;


public class Main {
    public static void main(String[] args) {

            int r,r1;
            int indicador=0;
            ArregloParticipante p1=new ArregloParticipante();
            Participante a[]=new Participante[4];

            JOptionPane.showMessageDialog(null,"Bienvenido al Programa Televisivo Masacre");
            do{

                r=Integer.parseInt(JOptionPane.showInputDialog("1.- Agregar Participante Fan Masacre\n" +
                        "2.- Agregar Participante Televidente\n" +
                        "3.- Imprimir Listado de Concursantes y sus Puntajes\n" +
                        "4.- Concursante Ganador y su Puntaje\n" +
                        "5.- Busqueda por DNI\n" +
                        "6.- Salir"));
                switch (r){
                    case 1:
                        String Nombre=JOptionPane.showInputDialog("Ingresa Nombre");
                        String Apellido=JOptionPane.showInputDialog("Ingresa Apellido");
                        int DNI=Integer.parseInt(JOptionPane.showInputDialog("Ingresa DNI"));
                        int Edad=Integer.parseInt(JOptionPane.showInputDialog("Ingresa Edad"));
                        if(Edad<18){
                            JOptionPane.showMessageDialog(null,"El participante tiene que ser mayor de edad");
                            break;
                        }
                        String Equipo=JOptionPane.showInputDialog("Ingresa Equipo al que Pertenece");
                        int CMT=Integer.parseInt(JOptionPane.showInputDialog("Ingresa Cantidad de mensaje de texto"));
                        int PB=Integer.parseInt(JOptionPane.showInputDialog("Ingresa Puntaje de la Barrra"));
                        int PE=Integer.parseInt(JOptionPane.showInputDialog("Ingresa Puntaje de Equipo"));
                        if(Edad>=18) {
                            a[indicador] = new FanMasacre(Nombre, Apellido, DNI, Edad, Equipo, CMT, PB, PE);
                            p1.ingresarParticipante(a[indicador]);
                        }

                        JOptionPane.showMessageDialog(null,"Participante FanMasacre Agregado con exito.");
                        indicador++;

                        break;
                    case 2:
                        String Nombre1=JOptionPane.showInputDialog("Ingresa Nombre");
                        String Apellido1=JOptionPane.showInputDialog("Ingresa Apellido");
                        int DNI1=Integer.parseInt(JOptionPane.showInputDialog("Ingresa DNI"));
                        int Edad1=Integer.parseInt(JOptionPane.showInputDialog("Ingresa Edad"));
                        if(Edad1<18){
                            JOptionPane.showMessageDialog(null,"El participante tiene que ser mayor de edad");
                            break;
                        }
                        int NLL=Integer.parseInt(JOptionPane.showInputDialog("Ingresa Numero de LLamada"));
                        int CMT1=Integer.parseInt(JOptionPane.showInputDialog("Ingresa Cantidad de mensaje de texto"));
                        int CLL=Integer.parseInt(JOptionPane.showInputDialog("Ingresa Cantidad de LLamadas"));
                        if(Edad1>=18){
                            a[indicador]=new Televidente(Nombre1,Apellido1,DNI1,Edad1,NLL,CMT1,CLL);
                            p1.ingresarParticipante(a[indicador]);
                        }
                        JOptionPane.showMessageDialog(null,"Participante Televidente Agregado con exito.");
                        indicador++;
                        break;
                    case 3:
                        JOptionPane.showMessageDialog(null,"Listado Impreso con sus respectivos puntajes.");
                        p1.puntajeParticipante();;
                        break;
                    case 4:
                        JOptionPane.showMessageDialog(null,"El Ganador es:");
                        System.out.println(p1.gAnador());
                        break;
                    case 5:
                        int DNICONSULTA;
                        DNICONSULTA=Integer.parseInt(JOptionPane.showInputDialog("Ingresa el DNI a colsutar:"));
                        JOptionPane.showMessageDialog(null,"Gracias por la Busqueda.");
                        System.out.println(p1.busquedaporDNI(DNICONSULTA));

                }
            }while (r!=6);

     /*
            for(int i=0;i<4;i++){
                 int Interface=Integer.parseInt(JOptionPane.showInputDialog("1.- Agregar Participante Fan Masacre\n" +
                         "2.-Agregar Participante Televidente"));
                 if(Interface==1){
                     String Nombre=JOptionPane.showInputDialog("Ingresa Nombre");
                         String Apellido=JOptionPane.showInputDialog("Ingresa Apellido");
                         int DNI=Integer.parseInt(JOptionPane.showInputDialog("Ingresa DNI"));
                         int Edad=Integer.parseInt(JOptionPane.showInputDialog("Ingresa Edad"));
                         if(Edad<18){
                                 JOptionPane.showMessageDialog(null,"El participante tiene que ser mayor de edad");
                                 break;
                         }
                         String Equipo=JOptionPane.showInputDialog("Ingresa Equipo al que Pertenece");
                         int CMT=Integer.parseInt(JOptionPane.showInputDialog("Ingresa Cantidad de mensaje de texto"));
                         int PB=Integer.parseInt(JOptionPane.showInputDialog("Ingresa Puntaje de la Barrra"));
                         int PE=Integer.parseInt(JOptionPane.showInputDialog("Ingresa Puntaje de Equipo"));
                         if(Edad>18){
                                 a[i]=new FanMasacre(Nombre,Apellido,DNI,Edad,Equipo,CMT,PB,PE);
                         }


                 }
                 if(Interface==2){
                         String Nombre=JOptionPane.showInputDialog("Ingresa Nombre");
                         String Apellido=JOptionPane.showInputDialog("Ingresa Apellido");
                         int DNI=Integer.parseInt(JOptionPane.showInputDialog("Ingresa DNI"));
                         int Edad=Integer.parseInt(JOptionPane.showInputDialog("Ingresa Edad"));
                         if(Edad<18){
                                 JOptionPane.showMessageDialog(null,"El participante tiene que ser mayor de edad");
                                 break;
                         }
                         int NLL=Integer.parseInt(JOptionPane.showInputDialog("Ingresa Numero de LLamada"));
                         int CMT=Integer.parseInt(JOptionPane.showInputDialog("Ingresa Cantidad de mensaje de texto"));
                         int CLL=Integer.parseInt(JOptionPane.showInputDialog("Ingresa Cantidad de LLamadas"));
                         if(Edad>18){
                                 a[i]=new Televidente(Nombre,Apellido,DNI,Edad,NLL,CMT,CLL);
                         }


                 }
            }
     */



            /*
            a[0]=new FanMasacre("Luisss","Mercedez",74380529,25,"Rojo",23,25,27);
             Participante o1=new Televidente("Jhordan","Espinoza", 2345542,17,923710235,25,30);
            a[1]=new FanMasacre("Luis","Mercedez",74380529,25,"Rojo",23,25,27);
            Participante o2=new FanMasacre("Luis","Mercedez",74380529,25,"Rojo",23,25,27);
            a[2]=new Televidente("Jhordans","Espinoza", 22345542,23,923710235,45,24);
            Participante o3=new Televidente("Jhordans","Espinoza", 22345542,23,923710235,45,24);

            Participante nombre;
            p1.ingresarParticipante(a[0]);
            p1.ingresarParticipante(a[1]);
            p1.ingresarParticipante(a[2]);
            p1.Participantes[0].getPuntaje();
            p1.ingresarParticipanteFanMasacre("Luisssas","Mercedezes",74380529,25,"Rojo",23,25,27);
            p1.MostrarParticipante();
            System.out.println(".....");
            p1.puntajeParticipante();
            System.out.println(".....");
            System.out.println(p1.gAnador()) ;
            System.out.println(".....");
            System.out.println(p1.busquedaporDNI(74380529));
*/






    }
}
