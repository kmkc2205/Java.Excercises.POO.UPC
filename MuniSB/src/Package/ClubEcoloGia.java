package Package;

public class ClubEcoloGia extends Vecino{
    private boolean chocolateSublime;
    public ClubEcoloGia(int DNI, int telefono, String estadoCivil, int edad, String correoElectronico) {
        super(DNI, telefono, estadoCivil, edad, correoElectronico);
        promocionespecial();
    }

    @Override
    public void promocionespecial() {
        if(getEstadoCivil().equals("casado")){
            chocolateSublime=true;
        }
    }
}
