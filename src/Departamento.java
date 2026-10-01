public class Departamento extends Vivienda implements ConEstacionamiento {
    private int numeroPiso;
    private boolean gastoComunAldia;
    private boolean estacionamientoAsignado;

    public Departamento() {
    }

    public Departamento(String codigoPropiedad, int superficieMetros, int numeroHabitaciones, int numeroPiso, boolean gastoComunAldia, boolean estacionamientoAsignado) {
        super(codigoPropiedad, superficieMetros, numeroHabitaciones);
        setNumeroPiso(numeroPiso);
        this.gastoComunAldia = gastoComunAldia;
        this.estacionamientoAsignado = estacionamientoAsignado;
    }

    public int getNumeroPiso() {
        return numeroPiso;
    }

    public void setNumeroPiso(int numeroPiso) {
        this.numeroPiso = numeroPiso;
    }

    public boolean isGastoComunAldia() {
        return gastoComunAldia;
    }

    public void setGastoComunAldia(boolean gastoComunAldia) {
        this.gastoComunAldia = gastoComunAldia;
    }

    public boolean isEstacionamientoAsignado() {
        return estacionamientoAsignado;
    }

    public void setEstacionamientoAsignado(boolean estacionamientoAsignado) {
        this.estacionamientoAsignado = estacionamientoAsignado;
    }

    @Override
    public double calcularCostoArriendo() {
        double costoBase = 185000;
        if(this.gastoComunAldia){
            return costoBase;
        }else{
            double incremento = costoBase * 0.15;
            return costoBase + incremento;
        }
    }

    @Override
    public boolean tieneEstacionamiento() {
        boolean tieneEstacionamiento = false;
        if(this.estacionamientoAsignado){
            tieneEstacionamiento = true;
        }
        if(!this.estacionamientoAsignado){
            tieneEstacionamiento = false;
        }return (tieneEstacionamiento);

    }

    @Override
    public void asignarEstacionamiento() {
        if(!this.estacionamientoAsignado){
            this.asignarEstacionamiento();
        }else{
            System.out.println("Vivienda con estacionamiento asignado previamente.");
        }

    }

    @Override
    public String toString() {
        return super.toString() +
                "numeroPiso:" + numeroPiso +
                ", gastoComunAldia:" + (gastoComunAldia?"SI":"NO") +
                ", estacionamientoAsignado:" + (estacionamientoAsignado?"SI":"NO") +
                '}' + "Costo de arriendo:" + calcularCostoArriendo();
    }
}
