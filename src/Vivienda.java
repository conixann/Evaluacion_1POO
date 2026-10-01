public abstract class Vivienda {
    protected String codigoPropiedad;
    protected int SuperficieMetros;
    protected int numeroHabitaciones;

    public Vivienda() {
    }

    public Vivienda(String codigoPropiedad, int superficieMetros, int numeroHabitaciones) {
        setCodigoPropiedad(codigoPropiedad);
        setSuperficieMetros(superficieMetros);
        setNumeroHabitaciones(numeroHabitaciones);
    }

    public String getCodigoPropiedad() {
        return codigoPropiedad;
    }

    public void setCodigoPropiedad(String codigoPropiedad) {
        if(codigoPropiedad.isBlank()){
            throw new IllegalArgumentException("El codigo  no puede ser nulo ni vacío. ");
        }else {
            this.codigoPropiedad = codigoPropiedad;
        }
        }


    public int getSuperficieMetros() {
        return SuperficieMetros;
    }

    public void setSuperficieMetros(int superficieMetros) {
        if(superficieMetros <20 || superficieMetros >500){
            throw new IllegalArgumentException("la superficie debe encontrarse en el rango entre 20 y 500. ");
        }else {
            SuperficieMetros = superficieMetros;
        }
        }

    public int getNumeroHabitaciones() {
        return numeroHabitaciones;
    }

    public void setNumeroHabitaciones(int numeroHabitaciones) {
        if(numeroHabitaciones <= 0){
            throw new IllegalArgumentException("La cantidad de habitaciones debe ser un valor mayor que cero.");
        }
        this.numeroHabitaciones = numeroHabitaciones;
    }
    public abstract double calcularCostoArriendo();

    @Override
    public String toString() {
        return "codigoPropiedad:" + codigoPropiedad + '\'' +
                ", SuperficieMetros:" + SuperficieMetros +
                ", numeroHabitaciones:" + numeroHabitaciones;
    }
}
