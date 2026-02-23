public class Sala {

    private final int codigoSala;
    private final String descripcion;

    /**
     * Constructor de la Sala
     * @param codigoSala identificador de la sala
     * @param descripcion de la sala
     */
    public Sala(int codigoSala, String descripcion) {
        this.codigoSala = codigoSala;
        this.descripcion = descripcion;
    }

    public int getCodigoSala() {
        return codigoSala;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public String toString() {
        return "Sala{ codigoSala=" + codigoSala + ", descripcion=" + descripcion + "}";
    }
}
