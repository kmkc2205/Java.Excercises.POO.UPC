package Package;

public abstract  class Vecino {
    private int DNI;
    private int Telefono;
    private String EstadoCivil;
    private int edad;
    private String correoElectronico;


    public Vecino(int DNI, int telefono, String estadoCivil, int edad, String correoElectronico) {
        this.DNI = DNI;
        Telefono = telefono;
        EstadoCivil = estadoCivil;
        this.edad = edad;
        this.correoElectronico = correoElectronico;
    }
    public abstract boolean promocionespecial();

    public int getDNI() {
        return DNI;
    }

    public void setDNI(int DNI) {
        this.DNI = DNI;
    }

    public int getTelefono() {
        return Telefono;
    }

    public void setTelefono(int telefono) {
        Telefono = telefono;
    }

    public String getEstadoCivil() {
        return EstadoCivil;
    }

    public void setEstadoCivil(String estadoCivil) {
        EstadoCivil = estadoCivil;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getCorreoElectronico() {
        return correoElectronico;
    }

    public void setCorreoElectronico(String correoElectronico) {
        this.correoElectronico = correoElectronico;
    }

    @Override
    public String toString() {
        return "Vecino{" +
                "DNI=" + DNI +
                ", Telefono=" + Telefono +
                ", EstadoCivil='" + EstadoCivil + '\'' +
                ", edad=" + edad +
                ", correoElectronico='" + correoElectronico + '\'' +
                '}';
    }
}
