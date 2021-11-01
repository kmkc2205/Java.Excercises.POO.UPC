package Clases;

public class Participante {
    private String Nombre;
    private String Apellido;
    private int DNI;
    private int Edad;


    public Participante(String Nombre, String Apellido,int DNI,int Edad){//Metodo Constructor
        this.Nombre=Nombre;
        this.Apellido=Apellido;
        this.DNI=DNI;
        this.Edad=Edad;

    }

    @Override
    public String toString() {
        return "Participante{" +
                "Nombre='" + Nombre + '\'' +
                ", Apellido='" + Apellido + '\'' +
                ", DNI=" + DNI +
                ", Edad=" + Edad +
                '}';
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String nombre) {
        Nombre = nombre;
    }

    public String getApellido() {
        return Apellido;
    }

    public void setApellido(String apellido) {
        Apellido = apellido;
    }

    public int getDNI() {
        return DNI;
    }

    public void setDNI(int DNI) {
        this.DNI = DNI;
    }

    public int getEdad() {
        return Edad;
    }

    public void setEdad(int edad) {
        Edad = edad;
    }
}
