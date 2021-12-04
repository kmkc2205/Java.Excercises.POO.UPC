public class Main {
    public static void main(String[] args) {
        //Categorias
        Categoria c=new Categoria(123,"Comedia");
        Categoria c1=new Categoria(1234,"Terror");
        Categoria c2=new Categoria(1234,"Suspenso");
        Categoria c3=new Categoria(1234,"Accion");
        //Actores
        Actor a=new Actor("Jhordan","Peruana");
        Actor a1=new Actor("Marco","Peruana");
        Actor a2=new Actor("Felicita","Peruana");
        Actor a3=new Actor("Flor","Peruana");
        Actor a4=new Actor("Brenda","Peruana");
        Actor a5=new Actor("Angel","Peruana");
        Actor a6=new Actor("Miguel","Peruana");
        Actor a7=new Actor("Lucifer","Peruana");
        Actor a8=new Actor("Camila","Peruana");
        Actor a9=new Actor("Ferreti","Peruana");
        //Peliculas
        Pelicula p=new Pelicula(123,"Mellizas",c);
        //Agregar Actores
        p.agregarActor(a);
        p.agregarActor(a1);
        p.agregarActor(a3);
        Pelicula p1=new Pelicula(12345,"Gemelas",c1);
        p1.agregarActor(a4);
        p1.agregarActor(a5);
        p1.agregarActor(a6);
        Pelicula p2=new Pelicula(123456,"Parecidas",c2);//Codigo de este registrado
        p2.agregarActor(a7);
        p2.agregarActor(a8);
        p2.agregarActor(a9);
        Pelicula p3=new Pelicula(123456,"Parecidas",c);//
        p3.agregarActor(a7);
        p3.agregarActor(a8);
        p3.agregarActor(a9);
        Tienda t=Tienda.obtenerInstancia();//Singleton
        //Tienda t=new Tienda();//Metodo Convencional
        try{
            t.agregarPelicula(p);
            t.agregarPelicula(p1);
            t.agregarPelicula(p2);
            t.agregarPelicula(p3);//Codigo Repetido con pelicula 2
        }
        catch (Exception e){
            System.out.println(e.getMessage());//Captura de la exception de la p3
        }


        for (Pelicula ps: t.getPeliculas()){
            System.out.println(ps+" Apta para Mayores: "+ps.getCategoria().determinarsiesaptoparaMenores());
        }
    }
}
