public class Paciente  {
    private int nroDocumento;
    private String nombreCompleto;
    private int edad;
    private Historial historial;

    public Paciente(int nroDocumento, String nombreCompleto, int edad, Historial historial) {//agregacion
        this.nroDocumento = nroDocumento;
        this.nombreCompleto = nombreCompleto;
        this.edad = edad;
        this.historial = historial;
    }

    public int getNroDocumento() {
        return nroDocumento;
    }

    public void setNroDocumento(int nroDocumento) {
        this.nroDocumento = nroDocumento;
    }

    public String getNombreCompleto() {
        return nombreCompleto;
    }

    public void setNombreCompleto(String nombreCompleto) {
        this.nombreCompleto = nombreCompleto;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public Historial getHistorial() {
        return historial;
    }

    public void setHistorial(Historial historial) {
        this.historial = historial;
    }

    @Override
    public String toString() {
        return "Paciente{" +
                "nroDocumento=" + nroDocumento +
                ", nombreCompleto='" + nombreCompleto + '\'' +
                ", edad=" + edad +
                ", historial=" + historial +
                '}';
    }
}
