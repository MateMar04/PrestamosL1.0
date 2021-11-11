public class Direccion {
    private final String calle;
    private final String nombreCalle;
    private final Barrio barrio;

    public Direccion(String calle, String nombreCalle, Barrio barrio) {
        this.calle = calle;
        this.nombreCalle = nombreCalle;
        this.barrio = barrio;
    }
}
