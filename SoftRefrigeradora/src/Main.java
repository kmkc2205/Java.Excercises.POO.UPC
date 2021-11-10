public class Main {
    public static void main(String[] args) {
        Producto o1=new Fruta(1234,"Fresita",2.5,25,true);
        Producto o2=new Fruta(1234,"Banana",3,6,true);
        Producto o3 = new Fruta(1234, "Maracuya", 3, 7, false);
        Producto o4=new Liquido(1234,"Agua",2.5,60,"Cielo");
        AdminRefrigeradora p1 = new AdminRefrigeradora();
        p1.AgregarProducto(o1);
        p1.AgregarProducto(o2);
        p1.AgregarProducto(o3);
        p1.AgregarProducto(o4);
        //Imprime todo
         for (int i = 0; i < p1.Productos.size(); i++) {
            System.out.println(p1.Productos.get(i));
        }
        //Suma de valores referenciales
        p1.calcularValorReferencial();
        System.out.println("La suma total de valores referenciales es:"+p1.getTotalvalorReferencial());
        //Saber si hay alguna fruta dulce dentro del arreglo
        System.out.println(p1.frutaDulce());
    }
}
