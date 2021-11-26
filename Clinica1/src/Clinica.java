import java.util.ArrayList;

public class Clinica {
    private ArrayList<Paciente> Pacientes;
    public Clinica(){
        Pacientes=new ArrayList<>();
    }
    public void AgregarPaciente(Paciente paciente){
    Pacientes.add(paciente);
    }
    public ArrayList<Paciente> getPacientes() {
        return Pacientes;
    }

    public void setPacientes(ArrayList<Paciente> pacientes) {
        Pacientes = pacientes;
    }
    public void ingresarDependencia(String prioridad) throws Exception{
       boolean TienePrioridad=false;
        for (int i=0;i<Pacientes.size();i++){
           for (int j=0;j<Pacientes.get(i).getHistorial().getVisitas().size();j++){

             if (Pacientes.get(i).getHistorial().getVisitas().get(j).calcularPrioridad().equals(prioridad)){
                TienePrioridad=true;
                 System.out.println(Pacientes.get(i));
             }
           }
       }
        if (TienePrioridad==false){
            throw new Exception("Prioridad incorrecta");
        }
    }


    @Override
    public String toString() {
        return "Clinica{" +
                "Pacientes=" + Pacientes +
                '}';
    }
}
