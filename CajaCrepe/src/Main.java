public class Main {
    public static void main(String[] args) {
        Producto pro1=new Fruta(234,"Fresa",5.6,2,true);
        Producto pro2=new Fruta(235,"Pera",57,2,true);
        Producto pro3=new Fruta(235,"Mango",57,2,false);
        Lacteos pro4=new Lacteos(234,"Coca Cola",25,2,"gloria");
        ArregloAd ar1=new ArregloAd();
        ar1.agregar(pro1);
        ar1.agregar(pro2);
        ar1.agregar(pro3);
        ar1.agregar(pro4);
        for (int i = 0; i < ar1.pro.size(); i++) {
            System.out.println(ar1.pro.get(i));
        }
        ar1.calcularValorReferencial();
        ar1.calcularValorTotal();
        System.out.println("Valor total Referencial es: "+ar1.getTotalRef());
        System.out.println("Valor total de precios es: "+ar1.getValorTotal());
    }

}
