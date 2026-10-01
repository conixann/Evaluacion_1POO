public class Casa extends Vivienda {
    private boolean tienePatio;

    public Casa() {
    }

    public Casa(String codigoPropiedad, int superficieMetros, int numeroHabitaciones, boolean tienePatio) {
        super(codigoPropiedad, superficieMetros, numeroHabitaciones);
        this.tienePatio = tienePatio;
    }

    public boolean isTienePatio() {
        return tienePatio;
    }

    public void setTienePatio(boolean tienePatio) {
        this.tienePatio = tienePatio;
    }

    @Override
    public double calcularCostoArriendo() {
        double costoBase=250000;
        if(this.tienePatio){
            return costoBase;
        }else{
            double incremento = costoBase * 0.10;
            return costoBase + incremento;
        }

    }

    @Override
    public String toString() {
        return super.toString() +
                "tienePatio:" + (tienePatio?"SI":"NO")  + "Costo de arriendo:" + calcularCostoArriendo();
    }
}
