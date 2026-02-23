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

    public int getNumSocio() {
        return numSocio;
    }

    public String getNombre() {
        return nombre;
    }

    public String toString() {
        return "Socio{ numSocio = " + numSocio + ", nombre = " + nombre + "}";
    }


}
