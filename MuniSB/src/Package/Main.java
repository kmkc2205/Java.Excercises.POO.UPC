package Package;

public class Main {
    public static void main(String[] args) {
        Vecino o1=new AdultoMayor(74380529,923710235,"CASADO",24,"joran_1998_22@hotmail.com");
        BasedeDatosdeVecinos p1=new BasedeDatosdeVecinos();
        p1.registrarVecino(o1);

        for (int i=0;i<p1.Vecinos.size();i++){
            System.out.println(i);
        }
        Bus b1=new Bus();
        b1.ReservarBasedeDatos(74380529,211529,p1);
    }
}
