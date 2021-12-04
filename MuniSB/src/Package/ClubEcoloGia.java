package Package;

public class ClubEcoloGia extends Vecino{
    private boolean chocolateSublime=false;
    public ClubEcoloGia(int DNI, int telefono, String estadoCivil, int edad, String correoElectronico) {
        super(DNI, telefono, estadoCivil, edad, correoElectronico);
        promocionespecial();
    }

    @Override
    public boolean promocionespecial() {
        if(getEstadoCivil().equals("CASADO")){
            this.chocolateSublime=true;
        }
        return this.chocolateSublime;
    }

    @Override
    public String toString() {
        return super.toString()+" ClubEcoloGia{" +
                "chocolateSublime=" + chocolateSublime +
                '}';
    }
}
