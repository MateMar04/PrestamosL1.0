public class Cliente {
    private final String nombre;
    private final String numeroTelefono;
    private final String mail;
    private final Direccion direccion;

    public Cliente(String nombre, String numeroTelefono, String mail, Direccion direccion) {
        this.nombre = nombre;
        this.numeroTelefono = numeroTelefono;
        this.mail = mail;
        this.direccion = direccion;
    }
}
