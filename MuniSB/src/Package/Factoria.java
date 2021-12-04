package Package;

public class Factoria {
    public static Vecino dameInstancia(String tipo,int DNI, int telefono, String estadoCivil, int edad, String correoElectronico){
        switch (tipo){
            case "AM":
                return new AdultoMayor(DNI,telefono,estadoCivil,edad,correoElectronico);
            case "CE":
                return new ClubEcoloGia(DNI,telefono,estadoCivil,edad,correoElectronico);
            default:
                return null;
        }

    }
}
