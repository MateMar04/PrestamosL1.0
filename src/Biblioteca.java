import java.util.ArrayList;

public class Biblioteca {
    private final String nombre;
    private ArrayList<Publicacion> publicaciones;
    private ArrayList<Prestamo> prestamos;

    public Biblioteca(String nombre) {
        this.nombre = nombre;
    }

    void agregarPublicacion(Publicacion publicacion) {
        publicaciones.add(publicacion);
    }

    void prestarPublicacion(Prestamo prestamo) {
        prestamos.add(prestamo);
    }

    public int cantidadPrestamos() {
        return prestamos.size();
    }

    public int cantidadPublicaciones() {
        return publicaciones.size();
    }

    public int cantLibros() {
        int cantLibros = 0;
        for (Publicacion publicacion : publicaciones) {
            if (publicacion instanceof Libro) {
                cantLibros++;
            }
        }
        return cantLibros;
    }

    public int cantRevistas() {
        int cantRevistas = 0;
        for (Publicacion publicacion : publicaciones) {
            if (publicacion instanceof Revista) {
                cantRevistas++;
            }
        }
        return cantRevistas;
    }

    public ArrayList<Publicacion> getPublicaciones() {
        return publicaciones;
    }

    public ArrayList<Prestamo> getPrestamos() {
        return prestamos;
    }

    public ArrayList<Cliente> clientesConPrestamoLibro() {
        ArrayList<Cliente> clientes = new ArrayList<Cliente>();
        for (Prestamo prestamo : prestamos) {
            for (Publicacion publicacion : prestamo.getPublicaciones()) {
                if (publicacion instanceof Libro) {
                    clientes.add(prestamo.getCliente());
                    break;
                }
            }
        }
        return clientes;
    }

    public ArrayList<Barrio> barriosConPrestamos() {
        ArrayList<Barrio> barrios = new ArrayList<Barrio>();
        for (Prestamo prestamo : prestamos) {
            barrios.add(prestamo.getCliente().getDireccion().getBarrio());
        }
        return barrios;
    }
}
