public class Main {
    public static void main(String[] args) {
        Concursante o1=new Profesionales(74380529,"Juan","Papa rellena",90,50,70,"Fidel Castro",true);
        Concursante o2=new Profesionales(74380529,"Maria","Papa rellena",90,50,70,"Fidel Castro",false);
        ArregloConcursante p1=new ArregloConcursante();
        p1.registrarConcursante(o1);
        p1.registrarConcursante(o2);
        p1.concur.toArray().getClass();
        p1.concur.get(0).getClass().getSimpleName();
        System.out.println(o1.getClass().getSimpleName());

    }

}
