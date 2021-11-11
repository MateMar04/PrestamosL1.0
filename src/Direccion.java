public class Direccion {
    private final String calle;
    private final String nombreCalle;
    private final Barrio barrio;

    public Direccion(String calle, String nombreCalle, Barrio barrio) {
        this.calle = calle;
        this.nombreCalle = nombreCalle;
        this.barrio = barrio;
    }

    public String getCalle() {
        return calle;
    }

    public String getNombreCalle() {
        return nombreCalle;
    }

    public Barrio getBarrio() {
        return barrio;
    }

    @Override
    public String toString() {
        return "Direccion{" +
                "calle='" + calle + '\'' +
                ", nombreCalle='" + nombreCalle + '\'' +
                ", barrio=" + barrio +
                '}';
    }
}
