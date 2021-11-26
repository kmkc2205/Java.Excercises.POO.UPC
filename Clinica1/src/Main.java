public class Main {
    public static void main(String[] args) {
        Visita v1=new Visita("21/05/21","Caida",450);
        Visita v2=new Visita("22/05/21","Infeccion",900);
        Visita v3=new Visita("23/05/21","Muerte",7000);
        Visita v4=new Visita("24/05/21","Ruptura de hueso",1200);
        Visita v5=new Visita("25/05/21","Balaso",5001);
        Visita v6=new Visita("26/05/21","Mordida de perro",3200);
        Historial h1=new Historial(12345);
        h1.agregarVisita(v1);
        h1.agregarVisita(v2);
        Historial h2=new Historial(123456);
        h2.agregarVisita(v3);
        h2.agregarVisita(v4);
        Historial h3=new Historial(1234567);
        h3.agregarVisita(v5);
        h3.agregarVisita(v6);
        Paciente p1=new Paciente(74380529,"Jhordan Espinoza",23,h1);
        Paciente p2=new Paciente(74380529,"Angel Kollman",31,h2);
        Paciente p3=new Paciente(74380529,"Miguel ignacio",45,h3);
        Clinica c1=new Clinica();
        c1.AgregarPaciente(p1);
        c1.AgregarPaciente(p2);
        c1.AgregarPaciente(p3);

        for (Paciente p:c1.getPacientes()){
            System.out.println(p);
        }
        System.out.println(" ");

        //Exception
        try {
            c1.ingresarDependencia("Media");

        }
        catch (Exception e){
            System.out.println(e.getMessage());
        }

    }
}
