import java.util.ArrayList;

public class Prestamo {
    private final String fechaInicio;
    private final String fechaDevolucion;
    private final Cliente cliente;
    private ArrayList<Publicacion> lista;

    public Prestamo(String fechaInicio, String fechaDevolucion, Cliente cliente) {
        this.fechaInicio = fechaInicio;
        this.fechaDevolucion = fechaDevolucion;
        this.cliente = cliente;
    }
}
