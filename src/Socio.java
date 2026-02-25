public class Socio {

    private final int numSocio;
    private final String nombre;

    /**
     * Constructor del Socio
     * @param numSocio identificador del socio
     * @param nombre del socio
     */

    public Socio(int numSocio, String nombre) {
        this.numSocio = numSocio;
        this.nombre = nombre;
    }

    /**
     * Obtener número de socio
     * @return devuelve el número del socio
     */

    public int getNumSocio() {
        return numSocio;
    }

    /**
     * Obtener nombre de socio
     * @return devuelve el nombre del socio
     */

    public String getNombre() {
        return nombre;
    }

    /**
     * Obtener la información entera de socio
     * @return devuelve la información del socio
     */

    @Override
    public String toString() {
        return "Socio{ numSocio = " + numSocio + ", nombre = " + nombre + "}";
    }


}
