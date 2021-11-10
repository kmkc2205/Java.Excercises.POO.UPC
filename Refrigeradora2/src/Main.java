public class Main {
    public static void main(String[] args) {
        Producto o1=new Fruta(123,"fRESA",2.3,25,false);
        Producto o2=new Liquido(1234,"Gaseosa",3,250,"Coca");
        ArregloProducto po1=new ArregloProducto();

        po1.Agregar(o1);
        po1.Agregar(o2);

        for (int i=0;i<po1.pro.size();i++){
            System.out.println(po1.pro.get(i));
        }
        System.out.println("  ");

        System.out.println(po1.sabersihayfrutadulce());
    }
}
