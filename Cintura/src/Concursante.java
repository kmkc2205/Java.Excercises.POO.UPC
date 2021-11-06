public class Concursante {
    private int DNI;
    private String nombre;
    private String nombrePlato;
    private int puntajeSabor;
    private int puntajePresentacion;
    private int puntajeOriginalidad;
    private double puntajeF;

    public Concursante(int DNI,String nombre,String nombrePlato,int puntajeSabor,int puntajePresentacion, int puntajeOriginalidad){
        this.DNI=DNI;
        this.nombre=nombre;
        this.nombrePlato=nombrePlato;
        this.puntajeSabor=puntajeSabor;
        this.puntajePresentacion=puntajePresentacion;
        this.puntajeOriginalidad=puntajeOriginalidad;
        calcularPuntajeFinal();
    }
    public void calcularPuntajeFinal(){
         puntajeF=(puntajeSabor*0.7)+(puntajePresentacion*0.2)+(puntajeOriginalidad*0.1);

    }

    public int getDNI() {
        return DNI;
    }

    public void setDNI(int DNI) {
        this.DNI = DNI;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getNombrePlato() {
        return nombrePlato;
    }

    public void setNombrePlato(String nombrePlato) {
        this.nombrePlato = nombrePlato;
    }

    public int getPuntajeSabor() {
        return puntajeSabor;
    }

    public void setPuntajeSabor(int puntajeSabor) {
        this.puntajeSabor = puntajeSabor;
    }

    public int getPuntajePresentacion() {
        return puntajePresentacion;
    }

    public void setPuntajePresentacion(int puntajePresentacion) {
        this.puntajePresentacion = puntajePresentacion;
    }

    public int getPuntajeOriginalidad() {
        return puntajeOriginalidad;
    }

    public void setPuntajeOriginalidad(int puntajeOriginalidad) {
        this.puntajeOriginalidad = puntajeOriginalidad;
    }

    public double getPuntajeF() {
        return puntajeF;
    }

    public void setPuntajeF(double puntajeF) {
        this.puntajeF = puntajeF;
    }

    @Override
    public String toString() {
        return "Concursante{" +
                "DNI=" + DNI +
                ", nombre='" + nombre + '\'' +
                ", nombrePlato='" + nombrePlato + '\'' +
                ", puntajeSabor=" + puntajeSabor +
                ", puntajePresentacion=" + puntajePresentacion +
                ", puntajeOriginalidad=" + puntajeOriginalidad +
                ", puntajeF=" + puntajeF +
                '}';
    }
}
