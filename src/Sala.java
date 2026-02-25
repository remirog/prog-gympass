public class Sala {

    private final int codigoSala;
    private final String descripcion;

    /**
     * Constructor de la Sala
     *
     * @param codigoSala  identificador de la sala
     * @param descripcion de la sala
     */
    public Sala(int codigoSala, String descripcion) {
        this.codigoSala = codigoSala;
        this.descripcion = descripcion;
    }

    /**
     * Obtener codigo de sala
     *
     * @return devuelve el código de la asla
     */

    public int getCodigoSala() {
        return codigoSala;
    }

    /**
     * Obtener descripcion de sala
     *
     * @return devuelve la descripción de la sala
     */

    public String getDescripcion() {
        return descripcion;
    }

    /**
     * Obtener la información entera de socio
     *
     * @return devuelve la información de la sala
     */

    @Override
    public String toString() {
        return "Sala{ codigoSala = " + codigoSala + ", descripcion = " + descripcion + "}";
    }
}
