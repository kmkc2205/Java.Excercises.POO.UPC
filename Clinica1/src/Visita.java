public class Visita {
    private String fecha;
    private String motivo;
    private double montoGastado;

    public Visita(String fecha, String motivo, double montoGastado) {
        this.fecha = fecha;
        this.motivo = motivo;
        this.montoGastado = montoGastado;
    }
    public String calcularPrioridad(){
        String Prioridad=null;
        if (montoGastado>5000){
            Prioridad="Alta";
        }
        if (montoGastado>=2000&&montoGastado<=5000){
            Prioridad="Media";
        }
        if (montoGastado<2000){
            Prioridad="Baja";
        }
        return Prioridad;
    }
    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public String getMotivo() {
        return motivo;
    }

    public void setMotivo(String motivo) {
        this.motivo = motivo;
    }

    public double getMontoGastado() {
        return montoGastado;
    }

    public void setMontoGastado(double montoGastado) {
        this.montoGastado = montoGastado;
    }

    @Override
    public String toString() {
        return "Visita{" +
                "fecha='" + fecha + '\'' +
                ", motivo='" + motivo + '\'' +
                ", montoGastado=" + montoGastado +
                '}';
    }
}
