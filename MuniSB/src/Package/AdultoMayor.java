package Package;

public class AdultoMayor extends Vecino{
    private boolean bebida=false;

    public AdultoMayor(int DNI, int telefono, String estadoCivil, int edad, String correoElectronico) {
        super(DNI, telefono, estadoCivil, edad, correoElectronico);
        promocionespecial();
    }

    @Override
    public void promocionespecial() {
        if(super.getEdad()>75){
            bebida=true;
        }
    }
}
