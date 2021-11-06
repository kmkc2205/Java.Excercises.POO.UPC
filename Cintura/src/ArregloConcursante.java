import java.util.ArrayList;

public class ArregloConcursante {
    ArrayList <Concursante> concur=new ArrayList<>();


    public void registrarConcursante(Concursante concursantes){
        concur.add(concursantes);
    }
    public void ganadorGeneral(){
        for (int i=0;i<concur.size();i++){
            System.out.println(concur.get(0));
        }
    }

}
